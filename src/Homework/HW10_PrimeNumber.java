package Homework;

public class HW10_PrimeNumber {

	public static void main(String[] args) {

		int[] num = new int[5];

		for (int ele = 0; ele < num.length; ele++) {
			boolean isPrim = true;
			int random = (int) (Math.random() * 99 + 2);// 隨機產生數字
			num[ele] = random;

			for (int factor = 2; factor < num[ele]; factor++) {

				if (num[ele] % factor == 0) {
					isPrim = false;
					break;
				}
			}

			if (isPrim == false) {
				ele--;
			} else if (isPrim == true) {
				System.out.print(num[ele] + " ");
			}
		}
	}
}
