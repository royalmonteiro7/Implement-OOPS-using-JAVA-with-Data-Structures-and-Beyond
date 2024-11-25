package AlgorithmsandComplexities;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeFactors {
	public List<Long> primeFactors(long x) {
		ArrayList<Long> result = new ArrayList<Long>();
		long factor = 2;
		while (x > 1) {
			if (x % factor == 0) {
				result.add(factor);
				x = x / factor;
			} else {
				factor = factor + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FindPrimeFactors findPrimeFactors = new FindPrimeFactors();
		//System.out.println(findPrimeFactors.primeFactors(2100078577L));
		System.out.println(findPrimeFactors.primeFactors(30));
	}
}
