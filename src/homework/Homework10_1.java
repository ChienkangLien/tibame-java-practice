package homework;

import java.math.BigInteger;

public class Homework10_1 {
	public static void main(String[] args) {
//		for (int j = 0; j < 5; j++) {
//			boolean isPrime = true;
//			int i = ((int) ((Math.random() * 100) + 1));
//			for (int m = 2; m < i; m++) {
//				if (i % m == 0) {
//					System.out.println(i + "不是質數");
//					isPrime = false;
//					break;
//				}
//			}
//			if (isPrime) {
//				System.out.println(i + "是質數");
//			}
//		} //暴力解法

		for (int j = 0; j < 5; j++) {
			Integer i = ((int) ((Math.random() * 100) + 1));
			BigInteger bi = new BigInteger(i.toString());

			System.out.println(bi.isProbablePrime(Integer.MAX_VALUE) ? bi + "是質數" : bi + "不是質數");
		}
		// BigInteger.isProbablePrime(int certainty)判斷是否可能為質數，代表有誤差
		// 為值數的概率超過 (1 - 1/2的certainty次方)，避免結果不如預期、傳入參數越大越好
	}
}
