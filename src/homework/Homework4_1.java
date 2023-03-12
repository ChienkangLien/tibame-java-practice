package homework;

public class Homework4_1 {
	public static void main(String[] args) {
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			count++;
		}
		int avg = sum / count;
		System.out.println("平均值為" + avg);
		System.out.print("比平均值大的數字有:");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
