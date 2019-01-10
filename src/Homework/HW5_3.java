package Homework;

public class HW5_3 {

	/**
	 * 利用Overloading,設計兩個方法double maxElement(int x[][])與doublemaxElement(double
	 * x[][]), 可以找出二維陣列的最大值並回傳,如圖:
	 */

	public static void main(String[] args) {

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };

		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		HW5_3 w = new HW5_3();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));

	}

	public double maxElement(double[][] doubleArray) {
		double a = 0;// 設定一個初始值給陣列中的元素做比較
		// 利用迴圈先跑出陣列的元素
		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				if (a < doubleArray[i][j]) {// 把前面一開始設定的做比較
					a = doubleArray[i][j];// 如果上面條件成立然後把陣列元素指定給a
				} else {
				}
			}
		}
		// a就會等到迴圈跑完才會跳出來
		return a;
	}

	public int maxElement(int[][] intArray) {
		int b = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				if (b < intArray[i][j]) {
					b = intArray[i][j];
				} else {
				}
			}
		}
		return b;
	}

}
