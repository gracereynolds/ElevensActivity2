/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] r1 = {"Ace", "2", "3", "4", "5","6","7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] s1 = {"Hearts", "Spades", "Diamonds", "Clubs"};
        int[] p1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck d1 = new Deck(r1, s1, p1);
		System.out.println(d1.deal().toString());
		System.out.println(d1.toString());
    }
}
