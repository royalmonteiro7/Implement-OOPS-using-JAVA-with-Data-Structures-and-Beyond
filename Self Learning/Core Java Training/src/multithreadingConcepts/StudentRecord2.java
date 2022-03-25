package multithreadingConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentRecord2 {
	public static void main(String[] args) {
		ArrayList<Learner> arr = new ArrayList<Learner>();

		arr.add(new Learner(7, "Python", "US"));
		arr.add(new Learner(6, "Java", "India"));
		arr.add(new Learner(2, "Python for Data Science", "Australia"));
		arr.add(new Learner(3, "Python doe ML", "US"));
		arr.add(new Learner(1, "Data Science using R", "UK"));
		arr.add(new Learner(4, "Business Analytics", "Italy"));
		arr.add(new Learner(5, "R", "Rome"));

		System.out.println("Data Before Soring...");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		// data after sorting
		Collections.sort(arr, new SortByrollno());
		System.out.println("Data After Soring...");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}

//class which represents enrolled student data
class Learner {
	int rollNo;
	String coarseName;
	String location;

	public Learner(int rollNo, String coarseName, String location) {
		this.rollNo = rollNo;
		this.coarseName = coarseName;
		this.location = location;
	}

	@Override
	public String toString() {
		return this.rollNo + " " + this.coarseName + " " + this.location;
	}

}

class SortByrollno implements Comparator<Learner> {

	@Override
	public int compare(Learner a, Learner b) {
		return a.rollNo - b.rollNo;
	}
}
