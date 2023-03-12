package homework;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework10_3 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String regex1 = "^(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)$";
		String regex2 = "^[1-3]$";

		tab: while (true) {
			System.out.println("請輸入日期(年月日,例如:20110131)");
			String str1 = sc.next();

			if (str1.matches(regex1)) {
				while (true) {
					System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年三選一");
					String str2 = sc.next();

					if (str2.matches(regex2)) {
						if (str2.equals("1")) {
							SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd"); //傳入的日期格式
							try {
								Date date = ft.parse(str1);  //會拋出例外ParseException
								Format sfm1 = new SimpleDateFormat("yyyy/MM/dd"); //欲輸出的日期格式
								System.out.println(sfm1.format(date));  // 會拋出例外IllegalArgumentException
							} catch (ParseException e) {
								e.getStackTrace();
							}
						} else if (str2.equals("2")) {
							SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
							try {
								Date date = ft.parse(str1);
								Format sfm2 = new SimpleDateFormat("MM/dd/yyyy");
								System.out.println(sfm2.format(date));
							} catch (ParseException e) {
								e.getStackTrace();
							}
						} else {
							SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
							try {
								Date date = ft.parse(str1);
								Format sfm3 = new SimpleDateFormat("dd/MM/yyyy");
								System.out.println(sfm3.format(date));
							} catch (ParseException e) {
								e.getStackTrace();
							}
						}
						break tab;
					}
				}
			} else {
				System.out.println("請再輸入一次");
			}

		}
		sc.close();
	}
}
