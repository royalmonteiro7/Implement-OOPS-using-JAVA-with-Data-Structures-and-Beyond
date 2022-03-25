package utilityPackagesAndInheritance;

public class EnterpriseCustomer extends Customer {
	// class variables
	String CustomerID;
	String CustomerName;
	String CustomerType;
	double amount;

	// constructor
	public EnterpriseCustomer(String custID, String custName, String custType, double amt) {
		super(custID, custName, custType);

		this.CustomerID = custID;
		this.CustomerName = custName;
		this.CustomerType = custType;
		this.amount = amt;
	}

	// method
	double get_final_amount(double interest, int year) {
		double simple_interest = this.amount * interest * year;
		double amount = this.amount + simple_interest;

		// flat 500 rupees discount for all enterprise customers
		amount = amount - 500;
		if (this.CustomerType == "SmallScale") {
			// for regular customer we are discounting 500 rupees
			return amount - 100;
		} else if (this.CustomerType == "BigScale") {
			// for business customer no discount
			return amount;
		}
		return amount;
	}

}
