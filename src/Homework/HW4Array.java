package Homework;

import java.util.Arrays;//JAVA官方API:陣列的各個方法工具

public class HW4Array {

	public static void main(String[] args) {

		System.out.println(
				"1.有個一維陣列如下:\r\n" + "{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}\r\n" + "請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素");
		// 宣告一個一維陣列，如果有參數了，可以連同參數一同在後面宣告
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int avg = 0, sum = 0;
		// 將一維陣列把裡面的每個參數元素印出來，利用for迴圈表示
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "  ");// 印出陣列中的每個元素
			sum += x[i]; // 總和=陣列中的每個元素相加
		}
		System.out.println();
		avg = sum / x.length;// 陣列x的平均值=陣列中的元素總和/元素數量
		System.out.println("平均值：" + avg);// 印出平均值

		for (int k = 0; k < 10; k++) {
			// 將陣列中的每個元素跟avg做比對
			if (x[k] > avg) {
				System.out.println("大於平均值的元素：" + x[k]);
			}
		}
		System.out.println("============================================");
//////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("請建立一個字串,經過程式執行後,輸入結果是反過來的\r\n" + "例如String s = “Hello World”,執行結果即為dlroW olleH");

		// 建立字串的陣列
		String[] s = { "H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d" };
		// 顯示陣列裡元素的數量
		System.out.println("s的長度" + s.length);
		System.out.println("結果：");
		// 反向印出陣列中的元素,用for迴圈遞減方式
		for (int j = 10; j >= 0; j--) {
			System.out.print(s[j] + "  ");
		}
///////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("有個字串陣列如下 (八大行星):\r\n"
				+ "{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}\r\n"
				+ "請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)");
		// 建立字串陣列
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		// 字串陣列中的元素數量
		System.out.print("planet的長度" + planet.length);
		System.out.println();
		//把每個字元當作會出現的次數
		int a=0 , e=0 , i=0 , o=0 , u=0 ,sumChar;
			//把planet陣列中的元素拆解成一個字串
		for (int row1 = 0; row1 < planet.length; row1++) {
			for (int column = 0; column < planet[row1].length(); column++) {
				//把一個字串拆解成一個字母
				if (String.valueOf(planet[row1].charAt(column)).equals("a")) {
					//planet[row1].charAt(column)：planet陣列中的row1行的第column的字元
					//String.valueOf把字元回傳轉型成字串(String的方法之一)
					a++;
				} else if (String.valueOf(planet[row1].charAt(column)).equals("e")) {
					e++;
				} else if (String.valueOf(planet[row1].charAt(column)).equals("i")) {
					i++;
				} else if (String.valueOf(planet[row1].charAt(column)).equals("o")) {
					o++;
				} else if (String.valueOf(planet[row1].charAt(column)).equals("u")) {
					u++;
				} else {//if...else的條件判斷要完整
					
				}
			}
		}
		System.out.println("a出現" + a +"次");
		System.out.println("e出現" + e +"次");
		System.out.println("i出現" + i +"次");
		System.out.println("o出現" + o +"次");
		System.out.println("u出現" + u +"次");	
		sumChar = a+e+i+o+u ;
		System.out.println("總共出現：" + sumChar +"次");
		
		
		
	}

}
