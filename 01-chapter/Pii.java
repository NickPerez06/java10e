/*This program will approximate pii in two ways. Note: Will use two print statments to do so.
Nicholas Perez
*/

public class Pii {
	public static void main(String [] args) {
		System.out.println("First Pii approximation: " + 4 * ( 1.0 + (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) ) );
		System.out.println("Second Pii approximation: " + 4 * ( 1.0 + (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13) ) );
	}
}
