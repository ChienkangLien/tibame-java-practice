package homework;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Homework7_2 {

	public static int random() {
		return (int) (Math.random() * 1000 + 1);
	}

	public static void main(String[] args) {

		File f1 = new File("c:\\javawork\\Data.txt");

		try {
			if (f1.length() != 0) {
				FileOutputStream fos1 = new FileOutputStream(f1);
				BufferedOutputStream bos1 = new BufferedOutputStream(fos1);
				PrintStream ps1 = new PrintStream(bos1);

				ps1.print("");

				fos1.flush();
				ps1.close();
				bos1.close();
				fos1.close();

			}

			FileOutputStream fos2 = new FileOutputStream("c:\\javawork\\Data.txt", true);
			BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
			PrintStream ps2 = new PrintStream(bos2);

			for (int i = 0; i < 10; i++)
				ps2.println(random());

			fos2.flush();
			ps2.close();
			bos2.close();
			fos2.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
