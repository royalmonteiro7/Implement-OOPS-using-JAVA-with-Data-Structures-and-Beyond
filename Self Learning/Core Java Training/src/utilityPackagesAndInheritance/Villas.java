package utilityPackagesAndInheritance;

public class Villas extends HouseArchitecture {

	@Override
	float getprice() {
		// price of Villas house is 2 crores
		return 20000000;
	}

	@Override
	String getLoanBank() {
		return "ICICI, AXIS, HDFC";
	}

}
