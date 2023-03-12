package homework;

import java.util.Scanner;

public class Homework4_4 {
	public static void main(String[] args) {
		int[][] arr = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		Scanner sc = new Scanner(System.in);
		int count = 0;

		System.out.println("阿文你想借多少錢");

		while (true) {
			int n1 = sc.nextInt();
			if (n1 <= 0) {
				System.out.println("你不是要借錢嗎");
			} else {

				System.out.println("可以借你錢的人是");
				for (int i = 0; i < arr[0].length; i++) {
					if (n1 <= arr[1][i]) {
						System.out.print("編號" + arr[0][i] + " ");
						count++;
					}
				}

				System.out.println("共" + count + "人");
				break;
			}
		}
		sc.close();
	}

}
