package homework;

public class Animal {

	private int age;
	private float weight;

	public Animal() {
		//因為宣告建構子，無參數的建構子就會被移除，所以通常我們會再宣告回來
		//無參數建構子也是為了給日後搭配的工具(框架)使用
	}
	
	public Animal(int age, float weight) {
		this.age = (age > 0) ? age : this.age;
		this.weight = (weight > 0.0) ? weight : this.weight;
	}

	public void speak() {
		System.out.println("年紀:" + age + "歲");
		System.out.println("體重:" + weight + "公斤");
	}

	public void setAge(int age) {
		this.age = (age > 0) ? age : this.age;
	}

	public void setWeight(int weight) {
		this.weight = (weight > 0.0) ? weight : this.weight;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}
	

	public static void main(String[] args) {
		Animal john = new Animal(2, 5.0f);
//		john.speak();
		System.out.println(john);
		
	}

}
