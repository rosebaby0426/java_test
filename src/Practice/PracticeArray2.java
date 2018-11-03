package Practice;

import java.util.Arrays;//引用別的Package的方法

public class PracticeArray2 {

	public static void main(String[] args) {
//		int[] ai = {88,81,74,68,78,76,77,85,95,93};
//		int[] x = ai;
//		//ai陣列跟x陣列是同一個陣列 ，因為是使用同一個 "位置"
//		int i = x.length;
//		for(int j = 0 ; j < i ; j++) {
//			int k = x[j];
//			System.out.print(k + "\t");
//		}
//		
//		int[] score1 = {88,81,74};
//		//score2複製score1 引用Arrays的copyOf方法，因為是引用別的套件方法，上面類別創建後要記得匯入copyOf的資料來源，用import的
//		//copyOf方法裡的表示方式為(參考的陣列名稱,參考的陣列元素數量(可以自己定義元素數量))
//		int[] score2 = Arrays.copyOf(score1,score1.length);
//		
//		for (int score:score2) {
//			System.out.printf("%3d",score);
//		}
//		System.out.println();
//		score2[0] = 99;
//		//因為上面的score2是用copyOf的方法新增元素，所以後面再給score2裡的第一個索引值[0]定義值的時候不會覆蓋score1的第一個元素值
//		for(int score :score1) {
//			System.out.printf("%3d",score);
//		}
//		
		//字串池
//		StringBuffer sb = new StringBuffer();
//		sb.append("planet的長度").append(planet.length);
//		System.out.println(sb.toString());
	}
}
