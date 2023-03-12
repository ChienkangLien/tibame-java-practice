package homework;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		String regex = "^[A-Z][12][0-9]{8}$";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an ID:");
		String id = sc.next();
		String upperStr = id.toUpperCase();
		
		if (upperStr.matches(regex)) {
			System.out.println("OK");
		} else {
			System.out.println("No good");
		}
	}

	
}
