package designPatterns;

//https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
class Singletonsample {
	private static Singletonsample s_instance = null;

	public String data;

	private Singletonsample() {
		data = "Example program for singleton class";
	}

	public static Singletonsample getInstance() {
		if (s_instance == null)
			s_instance = new Singletonsample();
		return s_instance;
	}
}

public class Singleton {
	public static void main(String[] args) {
		Singletonsample data1 = Singletonsample.getInstance();
		Singletonsample data2 = Singletonsample.getInstance();
		System.out.println("In Upper Case : ");
		data1.data = data1.data.toUpperCase();
		System.out.println("String from data1 is "+data1.data);
		System.out.println("In Lower Case : ");
		data2.data = data2.data.toLowerCase();
		System.out.println("String from data1 is "+data2.data);
	}

}
