package homework;

public class Homework4_2 {
	public static void main(String[] args) {
		String s = "Hello World";
//		char [] reverse=new char[s.length()];
//		int n = 0;
//		
//		
//		for(int i = s.length()-1;i>=0;i--) {
//			reverse[n]=s.charAt(i);
//			n++;
//		}
//		
//		for (int i = 0;i<reverse.length;i++) {
//			System.out.print(reverse[i]);
//		}

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}
}
