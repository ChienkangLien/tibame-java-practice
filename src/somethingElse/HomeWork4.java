package somethingElse;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// 第一題
		hw1(29, 100, 39, 41, 50, 8, 66, 77, 95, 15);
		// 第二題
		hw2("Hello World");
		// 第三題
		hw3("mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune");
		// 第四題
		hw4();
		// 第五題
		hw5();
		// 第六題
		hw6();

	}

	public static void hw6() {
//		• 班上有8位同學,他們進行了6次考試結果如下:
//		  請算出每位同學考最高分的次數
		int[][] a = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] num = new int[8];

		for (int i = 0; i < a.length; i++) {
			int max = 0;
			for (int j = 1; j < a[i].length; j++) {
				if (a[i][j] > a[i][max])
					max = j;
			}
			num[max]++;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "號" + num[i] + "次\t");
		}
		System.out.println();
		System.out.println("==============================================");
	}

	public static void hw5() {
//		• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int count = 0;
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((num1 % 4 == 0 && num1 % 100 != 0) || num1 % 400 == 0)
			month[1] = 29;

		if (num1 < 1 || num2 < 1 || num2 > 12 || num3 < 1 || num3 > month[num2 - 1]) {
			System.err.println("error");
			return;
		}

		for (int i = 0; i < num2 - 1; i++) {
			count += month[i];
		}
		count += num3;
		System.out.println("輸入的日期為該年第" + count + "天");
		System.out.println("==============================================");
	}

	public static void hw4() {
//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
		Scanner sc = new Scanner(System.in);
		int[][] a = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int count = sc.nextInt();
		int result = 0;
		System.out.print("有錢可借的員工編號: ");
		for (int i = 0; i < a[1].length; i++) {
			if (a[1][i] >= count) {
				System.out.print(a[0][i] + " ");
				result++;
			}
		}
		System.out.println("共" + result + "人");
		System.out.println("==============================================");
	}

	public static void hw3(String... c) {
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length(); j++) {

				switch (c[i].charAt(j)) {
				case 'a' -> count++;
				case 'e' -> count++;
				case 'i' -> count++;
				case 'o' -> count++;
				case 'u' -> count++;
				}
			}
		}
		System.out.println(count + "個");
		System.out.println("==============================================");
	}

	public static void hw2(String s) {
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("==============================================");
	}

	public static void hw1(int... a) {
//		• 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count += a[i];
		}
		count /= a.length;
		System.out.println("平均值為: " + count);
		System.out.print("大於平均值的元素: ");

		for (int i = 0; i < a.length; i++) {
			if (a[i] > count)
				System.out.print(a[i] + "\t");
		}
		System.out.println();
		System.out.println("==============================================");
	}

}
