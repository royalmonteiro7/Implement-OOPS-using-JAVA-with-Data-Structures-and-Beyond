package introductionToJava11AndOOPsConcepts;

public class StringFunctions {
	public static void main(String[] args) {
		// initializing string with some string value
		String string_var1 = "string functions program";
		String string_var2 = "string functions";

		// commonly used string functions
		System.out.println("String operations are: ");

		// Getting character at specific function
		System.out.println(string_var1.charAt(5));

		// Getting unicode character at specific index
		System.out.println(string_var1.codePointAt(3));

		// Getting unicode character before specific index
		System.out.println(string_var1.codePointBefore(3));

		// counting number of unicode characters between the indexes given
		System.out.println(string_var1.codePointCount(0, 5));

		// compare two strings lexicographically i.e bases on unicode value
		System.out.println("\nstring comparison function");

		System.out.println(string_var1.compareTo(string_var2));

		// compare two strings lexicographically ignoring the case
		System.out.println(string_var1.compareToIgnoreCase(string_var2));

		// Appends a string with another
		System.out.println("\nConcatenated string");
		System.out.println(string_var1.concat(string_var2));

		// checks wheather a string contains another string
		System.out.println(string_var1.contains(string_var2));

		// checks wheather strings ends with specific characters
		System.out.println(string_var1.endsWith("gram"));

		// compare and return true if the strings are equal
		System.out.println(string_var1.equals(string_var2));

		// compare and return true if the strings are equal by ignoring the case
		System.out.println(string_var1.equalsIgnoreCase(string_var2));

		// hash code for a string is computed like this
		// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		System.out.println(string_var1.hashCode());

		// gets the position of first occurrence of specific characters
		System.out.println(string_var1.indexOf("program"));

		// verifies if strings are equal
		String string_var3 = "demo";
		System.out.println(string_var3.isEmpty());

		// gets position of last occurrence of specific characters
		string_var3 = "functions program functions";
		System.out.println("\nlast occurrence position");
		System.out.println(string_var3.lastIndexOf("functions"));

		// gets string length
		System.out.println(string_var1.length());

		// search string with specific value and replaces with it
		System.out.println(string_var3.replace("functions", "java"));

		// verifies if string starts with given string
		System.out.println(string_var1.startsWith("string"));

		// converts string into lower case
		string_var1 = "HELLO WORLD";
		System.out.println(string_var1.toLowerCase());

		// converts string into upper case
		System.out.println(string_var1.toUpperCase());

		// trims space before and all the string
		String string_var4 = "     Hello world";
		System.out.println(string_var4.trim());

	}
}
