package JavaDeepDiveInterfacesandCollections;

import java.util.Scanner;

public class ValidationEmailId {
	public boolean validation(String emailIds[], String userInput) {
		for (int i = 0; i < emailIds.length; i++) {
			if (emailIds[i].equals(userInput)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ValidationEmailId validationEmailId = new ValidationEmailId();
		String emailIds[] = { "dtresler0@technorati.com", "scharlton1@vimeo.com", "ccarmichael2@admin.ch",
				"rmackaig3@blogs.com", "gtebbet4@unblog.fr", "yguyer5@va.gov", "tsidebottom6@gmpg.org",
				"dpiffe7@nasa.gov", "donians8@pagesperso-orange.fr", "hgoomes9@walmart.com" };
		System.out.println("enter email");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		boolean validation = validationEmailId.validation(emailIds, userInput);
		if (validation)
			System.out.println("Email is valid");
		else
			System.out.println("email not valid");
		sc.close();
	}
}
