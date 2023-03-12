package homework;

public class PracticeArray2 {

	public static void main(String[] args) {
		PracticeArray2 obj = new PracticeArray2();
		int[][]x=obj.getRandomArray();
		int[][]y=obj.getRandomArray();
		int[][]z=new int[3][3];
		
		for (int i=0; i<z.length;i++) {
			for (int j=0; j<z[i].length;j++) {
				z[i][j] = x[i][j]+y[i][j];
			}
		}

		obj.printArray(x);
		obj.printArray(y);
		obj.printArray(z);
		
	}

	// 用方法來設計
	public int[][] getRandomArray() {
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = (int) (Math.random() * 30 + 1);
			}
		}
		return data;

	}

	public void printArray(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===========================");

	}
}
