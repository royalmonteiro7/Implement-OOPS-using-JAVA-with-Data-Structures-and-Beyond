package AlgorithmsandComplexities;

public class ConvertToDecimal {
	public int convertToDecimal(String binary) {
		int conversion = 1;
		int result = 0;
		for (int i = 1; i <= binary.length(); i++) {
			if (binary.charAt(binary.length() - i) == '1') {
				result = result + conversion;
			}
			conversion = conversion * 2;
		}
		return result;
	}

	public int convertToDecimalAlt(String binary) {
		int result = 0;
		for (int i = 1; i <= binary.length(); i++) {
			if (binary.charAt(binary.length() - i) == '1')
				result = (int) (result + Math.pow(2, i - 1));
		}
		return result;
	}

	public static void main(String[] args) {
		ConvertToDecimal bd = new ConvertToDecimal();
		System.out.println(bd.convertToDecimal("10110"));
		System.out.println(bd.convertToDecimalAlt("10110"));
	}
}
