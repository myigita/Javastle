import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayDeque<Card> drawDeck = new ArrayDeque<Card>();
    ArrayDeque<Card> discardDeck = new ArrayDeque<Card>();

    public Deck() {
        String[] suits = {"clubs", "hearts", "spades", "diamonds"};
        int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.drawDeck.add(new Card(suits[i], ranks[j]));
            }
        }
        this.drawDeck = shuffle();
    }

    public ArrayDeque<Card> shuffle() {
        ArrayList<Card> shuffleTemp = new ArrayList<Card>(drawDeck);
        Collections.shuffle(shuffleTemp);
        return new ArrayDeque<Card>(shuffleTemp);
    }

    public Card draw() {
        Card tmpCard = this.drawDeck.pop();
        discardDeck.add(tmpCard);
        return tmpCard;
    }

    public ArrayList<Card> draw(int count) {
        ArrayList<Card> cardList = new ArrayList<Card>();
        for (int i = 0; i < count; i++) {
            Card tmpCard = drawDeck.pop();
            discardDeck.add(tmpCard);
            cardList.add(tmpCard);
        }
        return cardList;
    }

    public void debugDeck() {
        ArrayDeque<Card> debugDeck = new ArrayDeque<>(drawDeck);
        System.out.printf("\nThe size of the deck is: %d\n", debugDeck.size());
        for (int i = 0; i < drawDeck.size(); i++) {
            System.out.printf("%s ", debugDeck.pop().getValue());
        }
        System.out.println();
        System.out.println();
    }
}
