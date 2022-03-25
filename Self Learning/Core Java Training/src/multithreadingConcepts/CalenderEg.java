package multithreadingConcepts;

import java.util.Calendar;

public class CalenderEg {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("The current date = " + c.getTime());
		c.add(Calendar.DATE, -15);
		System.out.println("15 days ago = " + c.getTime());
	}

}
