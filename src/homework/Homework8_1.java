package homework;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Homework8_1 {
	public static void main(String[] args) {
		Collection collection = new LinkedList();
		collection.add(100);
		collection.add(3.14);
		collection.add(21L);
		collection.add(new Short("100"));
		collection.add(5.1);
		collection.add("Kitty");
		collection.add(100);
		collection.add(new Object());
		collection.add("Snoopy");
		collection.add(new BigInteger("1000"));

		// iterator方法印出
		Iterator it1 = collection.iterator();
		while (it1.hasNext()) {
			Object obj = it1.next();
			System.out.println(obj);
		}

		System.out.println("------------------------------");
		// 傳統for迴圈方法印出
		for (int i = 0; i < collection.size(); i++) {
			System.out.println(((List) collection).get(i));
		}

		System.out.println("------------------------------");
		// for-each方法印出
		for (Object obj : collection) {
			System.out.println(obj);
		}

		System.out.println("------------------------------");
		Iterator it2 = collection.iterator();
		while (it2.hasNext()) {
			Object obj = it2.next();
			if (!(obj instanceof Number)) {
				it2.remove();
			}
		}

		System.out.println(collection.toString());

	}
}
