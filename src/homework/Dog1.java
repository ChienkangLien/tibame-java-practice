package homework;

public class Dog1 implements Weightable {
	private String name;
	private double weight;
	
	public Dog1() {
		super();
	}

	public Dog1(String name, double weight) {
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

	@Override
	public void getWeightTool() {
		System.out.println("體重計");
	}
	
	
	
	
}
