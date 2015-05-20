/*This program will a population for the net five years starting with a population of 312,032,486 with
one brith every 7 seconds
one death every 13 seconds
one new immigrant every 45 seconds
Nicholas Perez
*/

public class Population {
	public static void main(String [] args) {
		System.out.println("1st year: " + (312032486 +  ((31536000.0/7) - (31536000.0/13) + (31536000.0/45)) ) );
		System.out.println("2nd year: " + (312032486 +  ((31536000.0/7) - (31536000.0/13) + (31536000.0/45)) ) * 2 );
		System.out.println("3rd year: " + (312032486 +  ((31536000.0/7) - (31536000.0/13) + (31536000.0/45)) ) * 3 );
		System.out.println("4th year: " + (312032486 +  ((31536000.0/7) - (31536000.0/13) + (31536000.0/45)) ) * 4 );
		System.out.println("5th year: " + (312032486 +  ((31536000.0/7) - (31536000.0/13) + (31536000.0/45)) ) * 5 );
	}
}




