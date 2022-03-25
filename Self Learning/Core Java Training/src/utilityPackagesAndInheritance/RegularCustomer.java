package utilityPackagesAndInheritance;

public class RegularCustomer extends Customer {
	// class variables
	String CustomerID;
	String CustomerName;
	String CustomerType;
	double amount;

	// constructor
	public RegularCustomer(String custID, String custName, String custType, double amt) {
		super(custID, custName, custType);

		this.CustomerID = custID;
		this.CustomerName = custName;
		this.CustomerType = custType;
		this.amount = amt;
	}

	@Override
	double get_final_amount(double interest, int year) {
		double simple_interest = this.amount * interest * year;
		double amount = this.amount + simple_interest;

		if (this.CustomerType == "Domestic") {
			// for regular customer we are discounting 500 rupees
			return amount - 500;
		} else if (this.CustomerType == "Business") {
			// for business customer no discount
			return amount;
		}
		return amount;
	}
}