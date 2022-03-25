package utilityPackagesAndInheritance;

import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		Calendar objCalendar = Calendar.getInstance();
		// Displaying date and time components
		System.out.println("\n Date and Time Components");
		System.out.println("Year: " + objCalendar.get(Calendar.YEAR));
		System.out.println("Month: " + objCalendar.get(Calendar.MONTH));
		System.out.println("Date: " + objCalendar.get(Calendar.DATE));
		System.out.println("Hour: " + objCalendar.get(Calendar.HOUR));
		System.out.println("Minute: " + objCalendar.get(Calendar.MINUTE));
		System.out.println("Second: " + objCalendar.get(Calendar.SECOND));
		// Let us add 30 minutes to the current time
		objCalendar.add(Calendar.MINUTE, 30);
		Date objDate = objCalendar.getTime();
		System.out.println("\nDate and Time");
		System.out.println(objDate);
	}
}
