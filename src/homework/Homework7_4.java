package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Homework7_4 {
	
	public static void main(String[] args) {
		
		CopyAnimal[] arr = new CopyAnimal[4];
		
		arr[0] = new Dog("Eric");
		arr[1] = new Dog("Gary");
		arr[2] = new Cat("Amy");
		arr[3] = new Cat("Judy");
		
		File dir = new File("C:\\data");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		File f1 = new File("C:\\data\\Object.ser");
		try {
			FileOutputStream fos = new FileOutputStream(f1);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for (int i = 0;i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
			oos.flush();
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
