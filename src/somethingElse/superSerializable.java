package somethingElse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class superSerializable {
	public static void main(String[] args) throws Exception {
		C c1 = new C();
		
		System.out.println(c1.hashCode());
		
		File file = new File("C:\\javawork\\serializableTest.ser");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		C c2 = (C)ois.readObject();
		System.out.println(c2.hashCode());
		//沒有實作序列化的父類別，反序列化時會執行建構式
	}

	
}

class A {
	A(){
		System.out.println("A");
	}
}
class B extends A {
	B(){
		System.out.println("B");
	}
}
class C extends B implements Serializable {
	C(){
		System.out.println("C");
	}
}
