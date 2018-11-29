package Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HW10_PrimeNumber3 {

	public int randomNum() {
		int random = (int) (Math.random() * 99 + 2);
		return random;
	}

	public boolean isPrimOrNot(int random) {

		boolean isPrim = true;

		for (int factor = 2; factor < random; factor++) {

			if (random % factor == 0) {
				isPrim = false;
				break;
			}
		}
		return isPrim;
	}

	public static void main(String[] args) {

		HW10_PrimeNumber3 prim = new HW10_PrimeNumber3();
		Set<Integer> primNum = new HashSet<Integer>();

		int y = 0;

		if (primNum.isEmpty() == true) {
			for (int i = 0; i < 5; i++) {

				int x = prim.randomNum();// 把隨機產生的數字存起來

				if (prim.isPrimOrNot(x)) {// 隨機產生的數字來去做質數判斷
					primNum.add(x);
					if (y == primNum.size()) {
						i--;
					}
				} else {
					i--;
				}
				y = primNum.size();
			}
		}

		System.out.println("隨機產生出介於1~100之間的的5個質數整數，如下");
		Iterator objs = primNum.iterator();
		while (objs.hasNext()) {
			System.out.print(objs.next() + " ");
		}

	}
}
