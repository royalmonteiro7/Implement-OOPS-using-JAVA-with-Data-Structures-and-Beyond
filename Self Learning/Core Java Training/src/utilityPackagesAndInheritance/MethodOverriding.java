package utilityPackagesAndInheritance;

class planet{
	void earth() {
		System.out.println("Earth is a Planet");
	}
}
class pluto extends planet{

	@Override
	void earth() {
		System.out.println("pluto is also a planet");
	}
	
}
public class MethodOverriding {
	public static void main(String[] args) {
		pluto obj=new pluto();
		obj.earth();
	}
}
