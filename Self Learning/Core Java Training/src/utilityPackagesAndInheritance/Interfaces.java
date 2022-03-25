package utilityPackagesAndInheritance;

interface GamePrizes {
	static final String FIRSTPRIZE = "Gold";
	static final String SECONDPRIZE = "Silver";
	static final String THIRDPRIZE = "Bronze";
}

public class Interfaces implements GamePrizes {
	public void winner() {
		medal = FIRSTPRIZE;  // no need of putiing gameprize.firstprice ==> directly we can use it
		System.out.println(medal);
	}

	private String medal;

	public static void main(String[] args) {
		Interfaces i = new Interfaces();
		i.winner();
	}

}
