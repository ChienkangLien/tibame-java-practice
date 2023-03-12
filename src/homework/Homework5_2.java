package homework;

public class Homework5_2 {
	public void randAvg() {
		int r;
		int sum = 0;
		System.out.println("本次亂數結果");
		for (int i = 1; i <= 10; i++) {
			r = (int) (Math.random() * 101);
			System.out.print(r + " ");
			sum += r;
		}
		System.out.println();
		System.out.println("平均值為:"+ (sum / 10.0));
	}

	public static void main(String[] args) {
		Homework5_2 a = new Homework5_2();
		a.randAvg();
	}
}
