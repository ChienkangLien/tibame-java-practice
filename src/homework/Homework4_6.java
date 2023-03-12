package homework;

import java.util.Arrays;

public class Homework4_6 {
	public static void main(String[] args) {
		int[][] grades = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[][] gradesSort = new int[grades.length][];
		int[] topWho = new int[grades.length];

		for (int i = 0; i < grades.length; i++) {
			gradesSort[i] = grades[i].clone(); // 複製原本的陣列拿來做排序
		}

		for (int i = 0; i < grades.length; i++) {
			Arrays.sort(gradesSort[i]);
			for (int j = 0; j < grades[i].length; j++) {
				if (gradesSort[i][gradesSort[i].length - 1] == grades[i][j]) {
					topWho[i] = j;
				}
			}
		}
		System.out.println(Arrays.toString(topWho));

		int[] times = new int[8];

		for (int i = 0; i < topWho.length; i++) {
			switch (topWho[i]) {
			case 0:
				times[0]++;
				break;
			case 1:
				times[1]++;
				break;
			case 2:
				times[2]++;
				break;
			case 3:
				times[3]++;
				break;
			case 4:
				times[4]++;
				break;
			case 5:
				times[5]++;
				break;
			case 6:
				times[6]++;
				break;
			case 7:
				times[7]++;
				break;
			}
		}

		for (int i = 0; i < times.length; i++) {
			System.out.println(i + 1 + "號同學考最高分的次數是" + times[i] + "次");
		}

	}

}
