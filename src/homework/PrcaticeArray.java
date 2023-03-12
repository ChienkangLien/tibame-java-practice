package homework;

import java.util.Arrays;

public class PrcaticeArray {
	public static void main(String[] args) {
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		for (int i=0; i<x.length;i++) {
			for (int j=0; j<x[i].length;j++) {
				x[i][j] = (int)(Math.random()*30+1);
				y[i][j] = (int)(Math.random()*30+1);
				z[i][j] = x[i][j]+y[i][j];
			}
		}
		
//		for (int i=0; i<y.length;i++) {
//			for (int j=0; j<y[i].length;j++) {
//				y[i][j] = (int)(Math.random()*30+1);
//			}
//		}
//		
//		for (int i=0; i<z.length;i++) {
//			for (int j=0; j<z[i].length;j++) {
//				z[i][j] = x[i][j]+y[i][j];
//			}
//		}
		
		System.out.println(Arrays.deepToString(x));
		System.out.println(Arrays.deepToString(y));
		System.out.println(Arrays.deepToString(z));

	}
	
	
	
}
