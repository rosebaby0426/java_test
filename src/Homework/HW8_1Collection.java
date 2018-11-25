package Homework;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW8_1Collection {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		Object obj = null;
		// 利用傳統for迴圈取得list的元素
		for (int i = 0; i < list.size(); i++) {
			obj = list.get(i);
			System.out.print(obj + "/");
		}

		System.out.println();

		// 利用for-each增強迴圈取得list元素
		for (Object a : list) {
			System.out.print(a + "/");
		}
		System.out.println();

		// 利用迭代器來取得元素
		Iterator objs = list.iterator();
		while (objs.hasNext()) {
			System.out.print(objs.next() + "/");
		}
		System.out.println();

		// 利用Object陣列來取得元素
		Object a[] = list.toArray();
		int i = 0;
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "/");
		}

	}

}
