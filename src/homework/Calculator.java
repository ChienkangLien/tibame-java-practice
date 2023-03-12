package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	// 方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。

	// 1. x與y同時為0,(產生自訂的CalException例外物件)
	// 2. y為負值,而導致x的y次方結果不為整數
	// 3. x與y皆正確情況下,會顯示運算後結果

	public void powerXY(int x, int y) throws CalException {

		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		} else {
			System.out.println(x + "的" + y + "次方等於" + (int) Math.pow(x, y));
		}

	}

}
