/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] r1 = {"Ace", "2", "3"}, r2 = {"4", "5", "6"};
        String[] s1 = {"Hearts", "Spades"}, s2 = {"Diamonds", "Clubs"};
        int[] p1 = {1, 2, 3}, p2 = {4, 5, 6};
		Deck d1 = new Deck(r1, s1, p1);
		Deck d2 = new Deck(r2, s2, p2);
		Deck d3 = new Deck(r1, s2, p1);
		System.out.println(d1.deal().toString());
		System.out.println(d1.toString());
        System.out.println(d2.deal().toString());
        System.out.println(d2.toString());
        System.out.println(d3.deal().toString());
        System.out.println(d3.toString());
    }
}
