package somethingElse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lottery2 {
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

				for (int i = 0; i < 6; i++) {
					int j = (int) (Math.random() * (count-i) + i);
					int temp = arrNumber.get(j);
					arrNumber.set(j, arrNumber.get(i));
					arrNumber.set(i, temp);
				}
				
				//只有一個陣列操作，將亂數取到的數字與[0]的數字換位子，將下一個亂數數字與第[1]個數字換位子，最後印出前六個數字
				//被換到前面的數字不能再被亂數取到，以實現不重複
				//要注意換完位子後取的亂數範圍會-1且開頭的索引值會+1，第一次取0~45(範圍長度46)、第二次取1~45(範圍長度45)...

				System.out.print("電腦選號為:");
				for (int i = 0; i < 6; i++) {
					System.out.print(arrNumber.get(i) + " ");
				}

				break;
			}
		}
	}

}
