package Homework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HW8_TrainTreeSet {

	public static void main(String[] args) {
		HW8_2Train t1 = new HW8_2Train();
		HW8_2Train t2 = new HW8_2Train();
		HW8_2Train t3 = new HW8_2Train();
		HW8_2Train t4 = new HW8_2Train();
		HW8_2Train t5 = new HW8_2Train();
		HW8_2Train t6 = new HW8_2Train();
		HW8_2Train t7 = new HW8_2Train();

		t1.setter(202, "普悠瑪", "樹林", "花蓮", 400);
		t2.setter(1254, "區間", "屏東", "基隆", 700);
		t3.setter(118, "自強", "高雄", "台北", 500);
		t4.setter(1288, "區間", "新竹", "基隆", 400);
		t5.setter(122, "自強", "台中", "花蓮", 600);
		t6.setter(1222, "區間", "樹林", "七堵", 300);
		t7.setter(1254, "區間", "屏東", "基隆", 700);

		// 為了要讓物件可以達到不重複又可以有排列順序，可以用TreeSet
		Set set = new TreeSet();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);

		// 迭代器取值
		Iterator train = set.iterator();
		while (train.hasNext()) {
			System.out.println(train.next());
		}

	}
}
