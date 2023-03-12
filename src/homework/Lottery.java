package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrNumber = new ArrayList<Integer>(); // 動態陣列

		while (true) {
			int n1 = sc.nextInt();
			if (n1 == 0 || n1 > 9) {
				System.out.println("請輸入1~9的數字");
			} else {

				int count = 0;

				for (int i = 1; i <= 46; i++) {
					if (i % 10 == n1 || i / 10 == n1) {
						continue;
					}
					System.out.print(i + " ");
					arrNumber.add(i);
					count++;
				}

				System.out.println("\n共有" + count + "個數字可選");

				int[] arrIndex = new int[6];

				for (int i = 0; i < 6; i++) {
					arrIndex[i] = (int) (Math.random() * count);
					for (int j = 0; j < i; j++) {
						if (arrIndex[i] == arrIndex[j]) {
							i--;
							break;
						}
					}
				}
				//將亂數取到的值放入arrIndex陣列，逐一比較有無重複，有重複就再給自己一次值，"拿自己跟其他數字比"
				//j<i代表拿自己跟之前的值比
				//i--因為跳出迴圈i會++，但要將原來數字重新給值所以要--，這樣亂數給值才會是同一個索引位置

				System.out.print("電腦選號為:");
				for (int i = 0; i < 6; i++) {
					System.out.print(arrNumber.get(arrIndex[i]) + " ");
				}

				break;
			}
		}
		sc.close();
	}
}
