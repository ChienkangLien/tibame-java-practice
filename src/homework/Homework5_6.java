package homework;

public class Homework5_6 {
	// 設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,
	// 此驗證碼內容包含了英文大小寫與數字的亂數組合
	public void genAuthCode() {
		char[] arr = new char[62];

		for (int i = 0; i < 62; i++) {
			if (i <= 25) {
				arr[i] = (char) (i + 65);
			}
			if (i > 25 && i <= 51) {
				arr[i] = (char) (i + 71);
			}
			if (i > 51 && i <= 61) {
				arr[i] = (char) (i - 4);
			}
		}

		System.out.println("本次隨機產生驗證碼為");
		for (int i = 0; i < 8; i++) {
			System.out.print(arr[(int)(Math.random()*62)]);

		}
	}

	public static void main(String[] args) {
		Homework5_6 g = new Homework5_6();
		g.genAuthCode();
	}

}
