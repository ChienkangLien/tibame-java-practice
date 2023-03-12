package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Homework7_1 {

	public static void main(String[] args) {

		File f1 = new File("C:\\javawork\\Sample.txt");

		int i;
		String j;
		int countChar = 0;
		int countLine = 0;

		try {
			FileReader fr1 = new FileReader("C:\\javawork\\Sample.txt");
			FileReader fr2 = new FileReader("C:\\javawork\\Sample.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			while ((i = br1.read()) != -1) {
				countChar++;
			};

			while ((j = br2.readLine()) != null) {
				countLine++;
			}

			br1.close();
			br2.close();
			fr1.close();
			fr2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Sample.txt檔案共有" + f1.length() + "個位元組," + countChar + "個字元," + countLine + "列資料");
	}

}
