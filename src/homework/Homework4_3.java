package homework;

public class Homework4_3 {
	public static void main(String[] args) {
		
	
	String [] planet = {"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
	int count = 0;
	
	for(int i = 0;i<planet.length;i++) {
		for(int j = 0;j<planet[i].length();j++) {
			switch(planet[i].charAt(j)) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			}
		}
	}
	
	System.out.println(count);

	}
}
