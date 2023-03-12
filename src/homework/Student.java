package homework;

public class Student {
	int score = 60;

	public void play(int hours) {
		score -= hours;
		score = (score < 0) ? 0 : score;
		System.out.println(score);

//		score -= hours;
//		if (score < 0) {
//			score = 0;
//			System.out.println(score);
//		} else {
//			System.out.println(score);
//		}
	}

	public void study(int hours) {
		score += hours;
		score = (score > 100) ? 100 : score;
		System.out.println(score);
		
//		score += hours;
//		if (score > 100) {
//			score = 100;
//			System.out.println(score);
//		} else {
//			System.out.println(score);
//		}
	}
	
	public static void main(String[] args) {
		
		Student david = new Student();
		david.play(41);

		Student andy = new Student();
		andy.study(50);
		andy.play(1);

//		System.out.println(david.score);
//		System.out.println(andy.score);
		
	}

}
