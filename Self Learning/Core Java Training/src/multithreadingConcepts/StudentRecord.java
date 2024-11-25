package multithreadingConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRecord implements Comparable<StudentRecord> {
	String name;
	int rollNumber;
	String address;

	// constructor to initialize student name, roll number and address
	public StudentRecord(String name, int rollNumber, String address) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.address = address;
	}

	// formatting roll number, name and address
	public String toString() {
		return this.rollNumber + " " + this.name + " " + this.address;
	}

	public static void main(String[] args) {
		List<StudentRecord> stud = new ArrayList<StudentRecord>();

		// adding student record here
		stud.add(new StudentRecord("Lahari", 5, "Bangalore"));
		stud.add(new StudentRecord("Amulya", 3, "Bangalore"));
		stud.add(new StudentRecord("Madhavi", 2, "Chennai"));
		stud.add(new StudentRecord("MadhuBabu", 6, "Bangalore"));
		stud.add(new StudentRecord("Varahalu", 4, "Rajamundry"));
		stud.add(new StudentRecord("Sarojini", 1, "Rajamundry"));
		stud.add(new StudentRecord("Hema Satish", 7, "Hyderbad"));

		// sorting the student data
		Collections.sort(stud);
//		System.out.println("The list after sorting : ");
//		System.out.println(stud);

//		sorting by roll number
		System.out.println("after sorting the roll number\n");
		for (int i = 0; i < stud.size(); i++) {
			System.out.println(stud.get(i));
		}

	}

	@Override
	public int compareTo(StudentRecord o) {
		return this.rollNumber - o.rollNumber;
	}

}
