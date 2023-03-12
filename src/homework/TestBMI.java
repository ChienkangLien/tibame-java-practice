package homework;

public class TestBMI {
	public static void main(String[] args) {
		double weight = 65;
		double height = 175;
		double myBMI =  weight / (height * height * 0.0001);
		
//		System.out.println("BMI為:"+myBMI);
		System.out.printf("BMI為 %.2f%n", myBMI);  //System.out.printf，f代表format，%n代表換行
		
		
//		if (myBMI < 18.5) {
//			System.out.println("過瘦");
//		}else if(myBMI >= 18.5 && myBMI < 24) {
//			System.out.println("正常");
//		}else {
//			System.out.println("過胖");
//		}
		
		
		if (myBMI < 18.5) {
			System.out.println("過瘦");
		}else if(myBMI < 24) {
			System.out.println("正常");
		}else {
			System.out.println("過胖");
		}
		
//		if (myBMI < 18.5) {
//			System.out.println("過瘦");
//		}else if(myBMI >= 24) {
//			System.out.println("過重");
//		}else {
//			System.out.println("正常");
//		}
	}
}
