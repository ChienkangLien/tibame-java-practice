package somethingElse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Lottery3 {

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
				break;
			}
		}

		TreeSet set = new TreeSet();

		while (set.size() < 6) {
			set.add((int) (Math.random() * arrNumber.size() + 1));
		}

		System.out.print("電腦選號為:");
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Integer num = (int) it.next();
			System.out.print(arrNumber.get(num) + " ");
		}

	}
}
