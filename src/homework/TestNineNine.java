package homework;

public class TestNineNine {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}

		System.out.println("==================================================");

		for (int k = 1; k <= 9; k++) {
			int l = 1;
			do {
				System.out.print(k + "*" + l + "=" + k * l + "\t");
				l++;
			} while (l <= 9);
			System.out.println();
		}

		System.out.println("==================================================");

		int m = 1;
		while (m <= 9) {
			int n = 1;
			do {
				System.out.print(m + "*" + n + "=" + m * n + "\t");
				n++;
			} while (n <= 9);
			m++;
			System.out.println();
		}
	}

}
