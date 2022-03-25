package multithreadingConcepts;

import java.util.*;

public class LocaleEx {
	public static void main(String[] args) {
		Locale l = new Locale("EN", "INDIA");
		System.out.println("Locale = " + l);
		System.out.println("Language = " + l.getDisplayLanguage());
		System.out.println("Countery Name = " + l.getDisplayCountry());
		System.out.println("Hashcode = " + l.hashCode());
	}
}
