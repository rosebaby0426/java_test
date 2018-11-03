package Practice;

public class Elephant extends AnimalSet {

	private String name;

	public void speak() {
		super.speak();
		System.out.println("姓名: " + name);
	}

	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}

}
