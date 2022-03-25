package utilityPackagesAndInheritance;

public class FarmHouse extends HouseArchitecture {

	@Override
	float getprice() {
		// price of Villas house is 10 crores
		return 100000000;
	}

	@Override
	String getLoanBank() {
		return "HDFC";
	}

}
