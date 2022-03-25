package utilityPackagesAndInheritance;

public class Apartments extends HouseArchitecture {

	@Override
	float getprice() {
		// price of Apartment house is 80 lakhs
		return 8000000;
	}

	@Override
	String getLoanBank() {
		return "ICICI, AXIS, HDFC, SBI, ANDHRA BANK, MYSORE BANK";
	}

}
