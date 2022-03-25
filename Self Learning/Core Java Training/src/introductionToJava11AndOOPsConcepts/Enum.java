package introductionToJava11AndOOPsConcepts;

//set of constant values
public class Enum {
	public enum colorsofrainbow {
		Voilet, Blue, Green, Red, Cyan, Purple, SkyBlue, White, Black, Pink, Gray
	}

	public static void main(String[] args) {
		
		for (colorsofrainbow m : colorsofrainbow.values())
			System.out.println(m);
	}
}
