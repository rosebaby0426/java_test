package Homework;


import java.util.Arrays;
import java.util.Scanner;

public class HW4Array_2 {

	public static void main(String[] args) {
		System.out.println("請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事\r\n" + "有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的\r\n"
				+ "員工編號: 25 19 27 共 3 人!」");

		Scanner keyin = new Scanner(System.in);
		System.out.println("請輸入你想要借的金額");
		// 設定個存放空間給輸入的資料方便後面使用
		int a = keyin.nextInt();
		// 題目顯示，以員工編號跟身上現金分類成兩個陣列
		int[][] num = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		// 但是因為要比對的是輸入的現金做比對
		// 所以要把上面的陣列分組改成以人跟金額做綁定，相依性原則
		// 所以要將舊的陣列做翻轉
		int[][] n = new int[5][2];
		// 新陣列的資料元素跟舊的資料元素是前後相反的
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				n[j][i] = num[i][j];
			}
		}
		//翻轉後陣列變成五個小陣列，以人為單位作為一個組合 =>人{編號,現金}

		int count = 0;
		for (int x = 0; x < n.length; x++) {
			//所以把輸入的金額跟陣列中的第二個元素做比對
			if (a <= n[x][1]) {
				System.out.print(n[x][0] + "\t");
				System.out.print(n[x][1] + "\t");
			} else {
				continue;
			}		
			System.out.println();
			count++;//符合上面條件就計算一次
		}
		System.out.println("共" + count + "人");
		keyin.close();
	}
}
