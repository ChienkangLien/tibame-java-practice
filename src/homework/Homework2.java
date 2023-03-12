package homework;

public class Homework2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("第一題");
		System.out.println("1~1000的偶數和:" + sum);

		System.out.println("==================================================");

		int result_for = 1;
		for (int j = 1; j <= 10; j++) {
			result_for *= j;
		}
		System.out.println("第二題");
		System.out.println("1~10的連乘積:" + result_for);

		System.out.println("==================================================");

		int result_while = 1;
		int k = 1;
		while (k <= 10) {
			result_while *= k;
			k++;
		}
		System.out.println("第三題");
		System.out.println("1~10的連乘積:" + result_while);

		System.out.println("==================================================");

		System.out.println("第四題");
		for (int l = 1; l <= 10; l++) {
			System.out.print(l * l + " ");
		}

		System.out.println();
		System.out.println("==================================================");

		System.out.println("第五題");
		int count = 0;
		for (int m = 1; m <= 46; m++) {
			if (m % 10 == 4 ) {
				continue;
			}else if(m / 10 == 4) {
				continue;
			}else {
			System.out.print(m + " ");
			count++;
			}
		}
		System.out.println("\n以上為阿文可以選擇的數字共有" + count + "個");
		System.out.println("==================================================");

		System.out.println("第六題");
		for (int n = 10; n >= 1; n--) {
			for (int o = 1; o <= n; o++) {
				System.out.print(o + " ");
			}
			System.out.println();
		}

		System.out.println("==================================================");
//		
//		System.out.println((int)'A');
//		System.out.println((int)'B');
//		System.out.println((int)'C');
//		System.out.println((int)'D');
//		System.out.println((int)'E');
//		System.out.println((int)'F');

		System.out.println("第七題");
		for (int p = 65; p <= 70; p++) {
			for (int q = 65; q <= p; q++) {
				System.out.print((char) p);

			}
			System.out.println();
		}

//		String arr[] = { "A", "B", "C", "D", "E", "F" };
//		for (int r = 0; r < arr.length; r++) {
//			for (int s = 0; s <= r; s++) {
//				System.out.print(arr[r]);
//			}
//			System.out.println();
//		}
	
	}
}
