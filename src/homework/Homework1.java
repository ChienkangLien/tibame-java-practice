package homework;

public class Homework1 {
	public static void main(String[] args) {
		int n1 = 12, n2 = 6;
		System.out.println("第一題");
		System.out.println("12、6的和為:" + (n1 + n2));
		System.out.println("12、6的積為:" + (n1 * n2));

		System.out.println("===========================================");

		int eggs1 = 200 / 12;
		int eggs2 = 200 % 12;
		System.out.println("第二題");
		System.out.println("200顆雞蛋共是:" + eggs1 + "打又" + eggs2 + "顆");

		System.out.println("===========================================");

		int times = 256559;
		int seconds = times % 60;
		int minutes = (times / 60) % 60;
		int hours = (times / 60 / 60) % 24;
		int days = times / 60 / 60 / 24;

//		System.out.println(seconds);
//		System.out.println(minutes);
//		System.out.println(hours);
//		System.out.println(days); 
		System.out.println("第三題");
		System.out.println("256559秒等同於:" + days + "天又" + hours + "小時又" + minutes + "分" + seconds + "秒");

		System.out.println("===========================================");

		final double PI = 3.1415;
		double radio = 5.0;
		double area = Math.pow(radio, 2) * PI;
		double perimeter = radio * 2 * PI;

		System.out.println("第四題");
		System.out.printf("面積為:%.4f\n", area);
		System.out.printf("周長為:%.3f\n", perimeter);

		System.out.println("===========================================");

		int money = 1500000;
		double rate = 0.02;
		int period = 10;

		System.out.println("第五題");
		System.out.printf("本金加利息共為: %.0f \n", money * Math.pow((1 + rate), period));

		System.out.println("===========================================");

//		int i = ('5');
//		System.out.println(i);

		System.out.println("第六題");
		System.out.println(5 + 5); // 這兩個5都是整數型別(int)，相加自然等於10
		System.out.println(5 + '5'); // '5'是字元型別(char)，遇到整數運算時會取對應的Unicode數值做轉型，'5'對應的整數為53
		System.out.println(5 + "5"); // "5"是字串型別(String)，遇到加法運算子時Java會做字串串接，將整數5也視為字串

		
	}

}
