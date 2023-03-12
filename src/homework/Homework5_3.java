package homework;

public class Homework5_3 {
	public int maxElement(int[][] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > result) {
					result = array[i][j];
				}
			}
		}
		return result;
	}
	public double maxElement(double[][] array) {
		double result = 0.0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > result) {
					result = array[i][j];
				}
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int[][] i = {{1,2,332},{31,5,6},{31,8,9}};
		double[][] j = {{12.1,22.3,3.7},{4.1,5.6,6.3},{7.6,8.7,9.8}};
		Homework5_3 a = new Homework5_3();
		System.out.println(a.maxElement(i));
		System.out.println(a.maxElement(j));
	}
}
