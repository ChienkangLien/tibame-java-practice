package homework;

import java.util.Scanner;

public class Homework5_1 {
	private int width;
	private int height;

	public void starSquare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬高");
		width = sc.nextInt();
		height = sc.nextInt();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

	public static void main(String[] args) {
		Homework5_1 a = new Homework5_1();
		a.starSquare();
	}
}
