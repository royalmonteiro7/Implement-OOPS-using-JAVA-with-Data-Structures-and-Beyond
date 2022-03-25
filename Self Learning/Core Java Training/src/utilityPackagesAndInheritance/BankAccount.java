package utilityPackagesAndInheritance;

public class BankAccount {
	public static void main(String[] args) {
		RegularCustomer regCustomer1 = new RegularCustomer("R123", "Krishna", "Domestic", 10000);
		RegularCustomer regCustomer2 = new RegularCustomer("R345", "Satish", "Business", 10000);

		EnterpriseCustomer entCustomer1 = new EnterpriseCustomer("E789", "Madhu", "SmallScale", 10000);
		EnterpriseCustomer entCustomer2 = new EnterpriseCustomer("E379", "Lahari", "BigScale", 10000);

		// regular customer
		regCustomer1.showCustomerDetails();
		System.out.println("Final amount " + regCustomer1.get_final_amount(5, 8));
		regCustomer2.showCustomerDetails();
		System.out.println("Final amount " + regCustomer2.get_final_amount(5, 8));
		// enterprise customer
		entCustomer1.showCustomerDetails();
		System.out.println("Final amount " + entCustomer1.get_final_amount(5, 8));
		entCustomer2.showCustomerDetails();
		System.out.println("Final amount " + entCustomer2.get_final_amount(5, 8));
	}
}
