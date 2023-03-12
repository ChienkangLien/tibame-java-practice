package homework;

import java.io.Serializable;

public class Cat implements Serializable, CopyAnimal {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
