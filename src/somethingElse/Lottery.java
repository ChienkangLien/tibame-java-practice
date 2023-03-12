package somethingElse;

import java.util.Arrays;

public class Lottery {
	public static void main(String[] args) {
		int[] num = new int[10]; // 長度為10的陣列
		System.out.print("數字: ");

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " "); // 給定十個數字1~10放到陣列num
		}

		System.out.print("\n隨機不重複產生5個亂數: ");

		int[] Array;

		Array = getRandom(num); // 呼叫getRandom方法，隨機取出五個數字

		System.out.print(Arrays.toString(Array));

		
		
	}

	public static int[] getRandom(int[] num) {
		int[] arr = new int[5]; // 宣告一個長度5的陣列，用來放置取的亂數
		int n;
		for (int i = 0; i < arr.length; i++) // 執行6次
		{
			n = (int) (Math.random() * (10 - i)); // 把取到的數字給到arr中，10-i是因為要讓每次取 num 陣列的範圍變小，以免取到尾巴重複的值
			arr[i] = num[n];
			for (int j = n; j < num.length - 1; j++) // 從取到的那個數開始，把後一位的數字給到前一位，-1是因為num[j+1] 就會超出陣列範圍
			{
				num[j] = num[j + 1];
			}
		}
		return arr;

	}
}
