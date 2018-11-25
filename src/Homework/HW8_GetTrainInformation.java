package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HW8_GetTrainInformation {

	public static void main(String[] args) {
		HW8_2Train t1 = new HW8_2Train();
		HW8_2Train t2 = new HW8_2Train();
		HW8_2Train t3 = new HW8_2Train();
		HW8_2Train t4 = new HW8_2Train();
		HW8_2Train t5 = new HW8_2Train();
		HW8_2Train t6 = new HW8_2Train();
		HW8_2Train t7 = new HW8_2Train();
		HW8_2Train t8 = new HW8_2Train();

		t1.setter(202, "普悠瑪", "樹林", "花蓮", 400);
		t2.setter(1254, "區間", "屏東", "基隆", 700);
		t3.setter(118, "自強", "高雄", "台北", 500);
		t4.setter(1288, "區間", "新竹", "基隆", 400);
		t5.setter(122, "自強", "台中", "花蓮", 600);
		t6.setter(1222, "區間", "樹林", "七堵", 300);
		t7.setter(1254, "區間", "屏東", "基隆", 700);
		t8.setter(116, "自強", "高雄", "台北", 500);

		// 因為物件可能會重複到，如果想要在增加物件時讓物件不要重複的話可以先用set來做集合
		Set set = new HashSet();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);

		// 取值方法一：迭代器
		Iterator t = set.iterator();
		while (t.hasNext()) {
			System.out.println(t.next());
		}

		System.out.println("======================");

		// 取值方法二：set轉list的傳統for迴圈
		List list = new ArrayList(set);

		// Collections裡sort排列方法只有list可以使用，如果要針對物件跟物件之間的比對，記得改寫comparaTo方法
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

		System.out.println("======================");
		LinkedList ls = new LinkedList(set);
		ls.addLast(t8);
		ls.addLast(t7);
		Collections.sort(ls);

		Iterator t11 = ls.iterator();
		while (t11.hasNext()) {
			System.out.println(t11.next());
		}

	}

}
