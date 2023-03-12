package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		n1 = (sc.hasNextInt()) ? sc.nextInt() : null;
		n2 = (sc.hasNextInt()) ? sc.nextInt() : null;
		n3 = (sc.hasNextInt()) ? sc.nextInt() : null;

		if ((n1 <= 0 || n2 <= 0) || n3 <= 0) {
			System.out.println("不是三角形");
		} else if (n1 == n2 && n1 == n3) {
			System.out.println("正三角形");
		} else if ((n1 == n2 || n1 == n3) || n2 == n3) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("一般三角形");
		}

		int[] arrayTr = { n1, n2, n3 };
		Arrays.sort(arrayTr);

		if ((n1 <= 0 || n2 <= 0) || n3 <= 0) {
		} else if ((arrayTr[0] * arrayTr[0] + arrayTr[1] * arrayTr[1]) == arrayTr[2] * arrayTr[2]) {

			System.out.println("也是直角三角形");
		}
		sc.close();

	}

}
