package homework;

public class Elephant extends Animal {
	private String name;

	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	public void speak() {
		super.speak();
		System.out.println("種類名稱:" + name);
	}
	
//	@Override  //JDK 5加入的Annotation(標註):給Java相關工具看的資訊(如編譯器、框架)
//	public void speak() {
//		// TODO Auto-generated method stub
//		super.speak();
//		System.out.println("種類名稱:" + name);
//	}
	
	public static void main(String[] args) {
		Animal john = new Animal(3, 8.0f);
		john.speak();
		
		Elephant emma = new Elephant(8, 1200.0f,"大象");
		emma.speak();
		
	}

}
