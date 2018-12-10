package Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HW10_PrimeNumber2 {

	public int[] isPrimOrNot() {

		int[] num = new int[5];
		for (int ele = 0; ele < num.length; ele++) {

			boolean isPrim = true;
			int random = (int) (Math.random() * 99 + 2);// 隨機產生數字
			num[ele] = random;
			for (int factor = 2; factor < random; factor++) {

				if (random % factor == 0) {
					isPrim = false;
					break;
				}

			}
			if (isPrim == false) {
				ele--;
			} else if (isPrim == true) {
//				System.out.print(num[ele] + " ");
			}
		}
		return num;
	}

	public static void main(String[] args) {
		HW10_PrimeNumber2 prim = new HW10_PrimeNumber2();

		Set primNum = new HashSet();

		int[] numberS = prim.isPrimOrNot();

		for (int i = 0; i < 5; i++) {
			primNum.add(numberS[i]);
		}

		Iterator objs = primNum.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());
		}

	}
}
