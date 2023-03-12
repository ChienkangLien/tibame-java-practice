package homework;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Homework10_2 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String regex = "^[1-3]$";

		tab: while (true) {
			System.out.println("請輸入數字");
			String str1 = sc.next();

			Double d;
			try {
				d = Double.valueOf(str1);
			} catch (NumberFormatException e) {
				System.out.println("輸入格式錯誤");
				continue;
			}

			while (true) {
				System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
				String str2 = sc.next();

				if (str2.matches(regex)) {
					if (str2.equals("1")) {
						int i = (str1.length() - str1.indexOf("."));
						String cross = "#";
						for (int j = 1; j < i; j++) {
							cross += "#";
						}
						DecimalFormat decimalFormat = new DecimalFormat("#,###" + "." + cross);
						System.out.println(decimalFormat.format(d)); // 要計算小數點後有幾位數，以免小數點後的數字被吃掉
//						System.out.printf("%,." + (i - 1) + "f", d); //
					} else if (str2.equals("2")) {
						int i = (str1.length() - str1.indexOf(".") - 3);
						String cross = "#";
						for (int j = 1; j < i; j++) {
							cross += "#";
						}
						DecimalFormat decimalFormat = new DecimalFormat("##." + cross + "%");
						System.out.println(decimalFormat.format(d)); // 要計算小數點後有幾位數，以免小數點後的數字被吃掉
					} else {
						int i = (str1.length());
						String cross = "#";
						for (int j = 1; j <= i; j++) {
							cross += "#";
						}
						DecimalFormat decimalFormat = new DecimalFormat("0." + cross + "E0");
						System.out.println(decimalFormat.format(d)); // 要計算總共幾位數，以免數字被吃掉
					}
					break tab;
				}
			}
		}
		sc.close();
	}
}
