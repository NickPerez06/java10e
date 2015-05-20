/*This porgram will calculate the area and perimeter of a circle. The radius will be provided, no need from user input.
Nicholas Perez.
*/

public class Circle {
	public static void main(String [] args) {
		System.out.println("Area of circle:" + (5.5 * 5.5) * 4 * ( 1.0 + (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) ) );
		System.out.println("Perimeter of circle:" + 2 * 5.5 * 4 * ( 1.0 + (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) ) );
	}
}
