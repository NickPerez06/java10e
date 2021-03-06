/*This program will show the current time in GMT, however it will ask the user for the offset representing the
user time zone.
Nicholas Perez.
*/

import java.util.Scanner;

public class ShowCurrentTime2 {
	public static void main(String [] args) {

		//obtain the total milliseconds since midnight, jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		//Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds/1000;

		//compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		//obtain the total minutes	
		long totalMinutes = totalSeconds / 60;

		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		//Obtain the total hours
		long totalHours = totalMinutes / 60;

		//compute the current hours
		long currentHour = totalHours % 24;

	
		//asking user for the offset for their time zone
		int offset;
		Scanner time = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		offset = time.nextInt();

		System.out.println("The Current time is " + (currentHour + (offset) ) +":"+ currentMinute +":"+ currentSecond);
	}
}
