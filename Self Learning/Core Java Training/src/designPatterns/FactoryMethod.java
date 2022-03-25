package designPatterns;

//https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
abstract class Person {
	protected String name;

	Person(String name) {
		this.name = name;
	}

	abstract String getSalutation();

	abstract String getNameAndSalutation();
}

class Male extends Person {

	Male(String name) {
		super(name);
	}

	@Override
	String getSalutation() {
		return "Mr.";
	}

	@Override
	String getNameAndSalutation() {
		return this.getSalutation() + " " + name;
	}

}

class Female extends Person {

	Female(String name) {
		super(name);

	}

	@Override
	String getSalutation() {
		return "Miss/Mrs.";
	}

	@Override
	String getNameAndSalutation() {
		return this.getSalutation() + " " + name;
	}

}

public class FactoryMethod {
	public static class EmpFactory {
		public static Person getEmp(String name, String gender) {
			if (gender.equals("M")) {
				return new Male(name);
			} else if (gender.equals("F")) {
				return new Female(name);
			}
			return null;
		}
	}

	public static void main(String[] args) {
		Person man = EmpFactory.getEmp("John", "M");
		System.out.println(man.getNameAndSalutation());

		Person woman = EmpFactory.getEmp("Mary", "F");
		System.out.println(woman.getNameAndSalutation());
	}
}
