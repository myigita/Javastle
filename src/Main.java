public class Main {
    public static void main(String[] args) {
        Card testCard = new Card("clubs", 8);
        Deck testDeck = new Deck();
        testDeck.debugDeck();
        System.out.println(testDeck.draw());
        testDeck.debugDeck();

    }
}
