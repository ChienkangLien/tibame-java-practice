package homework;

import java.util.Iterator;

public class HelloEclipse {
	public static void main(String[] args) {
		C a = new C();
	}
}

class A {
	A() {
		System.out.println(1);
	}
}

class B extends A {
	B() {
		System.out.println(1);
	}
}

class C extends B {
	C() {
		System.out.println(1);
	}
}
