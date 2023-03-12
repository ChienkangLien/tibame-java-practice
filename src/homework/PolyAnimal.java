package homework;

public class PolyAnimal {
	public static void main(String[] args) {
		Animal[] a = new Animal[2];

		a[0] = new Animal(3, 10.0f);
		a[1] = new Elephant(3, 20.0f, "大象");

		for (int i = 0; i < a.length; i++) {
			a[i].speak();
		}

	}
}
