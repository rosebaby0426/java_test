package Practice;



public class Dog implements WeightTable{
	private String name;
	private double weight;
	
	@Override
	public void getWeightMethod() {
		System.out.println("用體重計");
	}
	
	public Dog() {
		super();
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	
	
	
	
}
