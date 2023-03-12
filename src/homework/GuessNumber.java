package homework;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		System.out.println("開始猜數字吧");
		int i = (int) (Math.random() * 100 + 1);
//		System.out.println(i);
		Scanner sc = new Scanner(System.in);

//		if (i == n1) {
//			System.out.println("答對了!答案就是"+i);
//		}
//		while (i != n1) {
//			System.out.println("猜錯囉");
//			int n2 = (sc.hasNextInt()) ? sc.nextInt() : null;
//			if (n2 == i) {
//				System.out.println("答對了!答案就是" + i);
//				break;
//			}
//		}

		while (true) {  //無窮迴圈
			int n1 = sc.nextInt();
			if (n1 != i) {
				System.out.println("猜錯囉");
				if (n1 < i) {
					System.out.println("再大一點");

				} else {
					System.out.println("再小一點");
				}
			} else {
				System.out.println("答對了!答案就是" + i);
				break;
			}
		}
		sc.close();

	}

}
