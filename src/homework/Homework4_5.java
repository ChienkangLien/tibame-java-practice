package homework;

import java.util.Scanner;

public class Homework4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y;
		int m;
		int d;

		System.out.println("請輸入西元年yyyy");
		int n1 = sc.nextInt();
		y = n1;

		while (true) {
			System.out.println("請輸入月份mm");
			int n2 = sc.nextInt();
			if (n2 <= 0 || n2 > 12) {
				System.out.println("請重新輸入");
			} else {
				m = n2;
				break;
			}
		}

		while (true) {
			System.out.println("請輸入日dd");
			int n3 = sc.nextInt();
			if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (n3 <= 0 || n3 > 31)) {
				System.out.println("請重新輸入");
			} else if ((m == 4 || m == 6 || m == 9 || m == 11) && (n3 <= 0 || n3 > 30)) {
				System.out.println("請重新輸入");
			} else if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) && (n3 <= 0 || n3 > 29)) {
				System.out.println("是閏年喔，請重新輸入");
			} else if (n3 <= 0 || n3 > 28) {
				System.out.println("是平年喔，請重新輸入");
			} else {
				d = n3;
				break;
			}
		}

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] daysFor4 = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int totals = 0;

		if (y % 4 != 0) {
			for (int i = 0; i < m; i++) {
				totals += days[i];
			}
		} else {
			for (int i = 0; i < m; i++) {
				totals += daysFor4[i];
			}
		}

		System.out.println("輸入日期為該年的第" + (totals + d) + "天");
		sc.close();
	}
}
