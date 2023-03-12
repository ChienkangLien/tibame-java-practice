package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Homework8_2 {
	public static void main(String[] args) {
		Train tArr[] = new Train[7];
		tArr[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		tArr[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		tArr[2] = new Train(118, "自強", "高雄", "台北", 500);
		tArr[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		tArr[4] = new Train(122, "自強", "台中", "花蓮", 600);
		tArr[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		tArr[6] = new Train(1254, "區間", "屏東", "基隆", 700);

		//印出不重複的Train物件
		System.out.println("印出不重複的Train物件");
		HashSet set1 = new HashSet();
		for (Train t : tArr) {
			set1.add(t);
		}
		
		//iterator方法印出
		Iterator it1 = set1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("------------------------------");
		// for-each方法印出
		for (Object t : set1) {
			System.out.println(t);
		}

		//讓Train物件印出時,能以班次編號由大到小印出
		System.out.println("讓Train物件印出時,能以班次編號由大到小印出");
		ArrayList set2 = new ArrayList();
		for (Train t : tArr) {
			set2.add(t);
		}
		
		Collections.sort(set2);
		
		// iterator方法印出
		Iterator it2 = set2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("------------------------------");
		// 傳統for迴圈方法印出
		for (int i = 0;i<set2.size();i++) {
			System.out.println(set2.get(i));
		}
		
		System.out.println("------------------------------");
		// for-each方法印出
		for(Object t : set2) {
			System.out.println(t);
		}

		// 不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		System.out.println("不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件");
		TreeSet set3 = new TreeSet();
		for (Train t : tArr) {
			set3.add(t);
		}

		// iterator方法印出
		Iterator it3 = set3.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}

		System.out.println("------------------------------");
		// for-each方法印出
		for (Object t : set3) {
			System.out.println(t);
		}

	}

}
