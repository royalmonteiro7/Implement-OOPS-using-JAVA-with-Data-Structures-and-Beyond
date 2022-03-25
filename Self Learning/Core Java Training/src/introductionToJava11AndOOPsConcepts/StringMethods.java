package introductionToJava11AndOOPsConcepts;

public class StringMethods {

	public static void main(String[] args) {
		String a1 = new String("Welcome to");
		System.out.println(a1.charAt(1));

		String a2 = new String(" Simplilearn");
		System.out.println(a1.compareTo(a2));

		System.out.println(a1.compareToIgnoreCase(a2));

		System.out.println(a1.concat(a2));

		System.out.println(a1.contains("to"));

		System.out.println(a1.contentEquals("Welcome to"));

		System.out.println(a1.endsWith("o"));

		System.out.println(a1.equals(a2));

		System.out.println(a1.equalsIgnoreCase(a2));

		System.out.println(String.format("name is %s", a1));

		System.out.println(a1.indexOf("l"));

		System.out.println(String.valueOf(a1));

		System.out.println(a1.lastIndexOf(a2));

		System.out.println(a1.length());

		System.out.println(a1.replace("Welcome", "Greetings"));

		System.out.println(a1.replaceAll("o", "e"));

		System.out.println(a1.replaceFirst("o", "e"));

		System.out.println(a1.split("e", 0).toString());

		// StartsWith()
		// subSequence
		// substring
		// tolowercase
		// tostring
		// touppercase
		// trim
	}

}
