package myPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice1112 {

	public static void main(String[] args) {
//大樂透6個不重覆練習，利用集合的迭代器來取得元素
		Set set = new HashSet();

		while (set.size() != 6) {
			int random = (int) (Math.random() * 49) + 1;
			set.add(random);
		}

		Iterator objs = set.iterator();
		while (objs.hasNext()) {
			System.out.print(objs.next() + "  ");
		}

	}

}
