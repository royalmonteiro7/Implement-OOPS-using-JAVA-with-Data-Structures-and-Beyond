package multithreadingConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEg2 {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date " + sdf.format(d));
	}
}
