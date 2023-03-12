package somethingElse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lottery1 {
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrNumber = new ArrayList(); // 動態陣列

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

				int[] arrResult = new int[6]; // 再一個陣列放要取的索引

				int n;
				for (int i = 0; i < arrResult.length; i++) {
					n = (int) (Math.random() * (count - i));
					arrResult[i] = arrNumber.get(n);
					for (int j = n; j < arrNumber.size() - 1; j++) {
						arrNumber.set(j, arrNumber.get(j + 1));
					}

				}
				//亂數取到的數字給到另一個陣列arrIndex中，arrNumber的數字要刪掉，且之後亂數取值的範圍要遞減
				//但陣列長度不能改變，替代方式是用其他數字取代掉該數字
				//亂數取值範圍遞減，相當於之後的尾巴會漸漸不被選到
				//那就讓被亂數取到的數字，之後所有數都被後一位的數字取代
				//count-1代表選取範圍遞減；size-1是避免get(j+1)超出陣列

				System.out.print("電腦選號為:" + Arrays.toString(arrResult));

				break;
			}
		}
	}
}
