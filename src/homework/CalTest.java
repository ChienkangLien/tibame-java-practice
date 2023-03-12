package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("請輸入x的值");
				int x = sc.nextInt();

				System.out.println("請輸入y的值");
				int y = sc.nextInt();

				c.powerXY(x, y);
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException ie) {
				System.out.println("輸入格式不正確");
				sc = new Scanner(System.in);  //重新指向新物件
//				sc.next();   //Returns:the next token，不加這一句的話、格式錯誤的字串會一直存在
				             //且沒辦法被sc.nextInt()給回傳，導致無窮迴圈
			}
		}

		sc.close();

	}

}
