package AlgorithmsandComplexities;

public class ArraySearch {
	public int search(String strToMatch, String[] strArray) {
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(strToMatch)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ArraySearch arraySearch = new ArraySearch();
		System.out.println(arraySearch.search("Alien", new String[] { "Interseller", "Primer", "Blade Runner","Alien" }));
	}
}
