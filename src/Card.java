import java.util.ArrayList;
import java.util.List;

public class Card {

    String suit; // accepted values: clubs, hearts, spades, diamonds

    // list to check accepted values
    String[] acceptedSuitsRecipe = new String[]{"clubs", "hearts", "spades", "diamonds"};
    ArrayList<String> acceptedSuits = new ArrayList<String>(List.of(acceptedSuitsRecipe));

    int rank; // accepted values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 (jack), 12 (queen), 13 (king)
    String value; // c6 = six of clubs, d12 = queen of diamonds etc.

    public Card(String suit, int rank) throws IllegalArgumentException{
        if (!acceptedSuits.contains(suit.toLowerCase()) || rank > 13) {
            throw new IllegalArgumentException("Illegal argument when initializing a card!");
        }
        this.suit = suit;
        this.rank = rank;
        this.value = String.valueOf(suit.toCharArray()[0]) + String.valueOf(rank);
//        System.out.println(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
