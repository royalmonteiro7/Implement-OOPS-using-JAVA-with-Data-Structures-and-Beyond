package utilityPackagesAndInheritance;

public class PolymorphismProgram {

	public static void main(String[] args) {
		HouseArchitecture ha;

		ha = new Villas();
		System.out.println("Average price of Villas are: " + String.format("%.0f", ha.getprice()));
		System.out.println("Banks who can provide loan are: " + ha.getLoanBank());

		ha = new FarmHouse();
		System.out.println("Average price of FarmHouse are: " + String.format("%.0f", ha.getprice()));
		System.out.println("Banks who can provide loan are: " + ha.getLoanBank());

		ha = new Apartments();
		System.out.println("Average price of Apartments are: " + String.format("%.0f", ha.getprice()));
		System.out.println("Banks who can provide loan are: " + ha.getLoanBank());
	}

}
