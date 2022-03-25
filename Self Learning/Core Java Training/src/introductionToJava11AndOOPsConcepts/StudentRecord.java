package introductionToJava11AndOOPsConcepts;

class Students {
	int regNumber;
	String studentName;

	Students(int reg_no, String name) {
		this.regNumber = reg_no;
		this.studentName = name;
	}

}

public class StudentRecord {

	public static void main(String[] args) {
		Students[] arr;

		// declaring an array of integers
		arr = new Students[5];

		arr[0] = new Students(12341, "Manish");
		arr[1] = new Students(12342, "Aravind");
		arr[2] = new Students(12343, "Satish");
		arr[3] = new Students(12344, "Hari");
		arr[4] = new Students(12344, "Ahmed");

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

//		System.out.println(arr[0]);
		for (int i = 0; i < arr.length; i++)
			System.out.println("Students with Registration Number " + arr[i].regNumber + " is:" + arr[i].studentName);
	}

}
