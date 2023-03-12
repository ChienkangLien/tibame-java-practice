package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Homework7_5 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			while (true) {
				((CopyAnimal) ois.readObject()).speak();
			}
		}  catch (Exception e) {
			e.printStackTrace();
		}

	}
}
