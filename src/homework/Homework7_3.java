package homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Homework7_3 {
	
	public static void copyFile(String a,String b) {
		int i, j;
		
		try {
			File f1 = new File(a);
			i = (int) f1.length();
			
			FileInputStream fis = new FileInputStream(a);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			byte[] arr = new byte[i];
			
			while((j = bis.read(arr)) != -1) {
			;}
			
			bis.close();
			fis.close();
			
			FileOutputStream fos = new FileOutputStream(b);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			bos.write(arr);
			
			bos.flush();
			bos.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		copyFile("C:\\javawork\\copy1.txt", "C:\\javawork\\copy2.txt");
		
	}
}
