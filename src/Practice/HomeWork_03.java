package Practice;

import java.util.Scanner;

public class HomeWork_03 { // ('2018-10-23','yyyy-mm-dd')

	public static void main(String[] args) {
		// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形:

//		Scanner san = new Scanner(System.in);
//		System.out.println("請輸入三個整數以判斷是否為三角形：");
//		int l1 = san.nextInt();
//		int l2 = san.nextInt();
//		int l3 = san.nextInt();
//		if (l1 <= 0 || l2 <= 0 || l3 <= 0) {	//皆須大於0
//			System.out.println("不是三角形");
//		} else if (l1 == l2 && l2 == l3 && l3 == l1) {
//			System.out.println("正三角形");
//		} else if (l1 == l2 || l2 == l3 || l3 == l1) {
//			System.out.println("等腰三角形");
//		} else if (((l1 * l1) + (l2 * l2)) == (l3 * l3) || ((l3 * l3) + (l2 * l2)) == (l1 * l1)
//				|| ((l1 * l1) + (l3 * l3)) == (l2 * l2)) {
//			System.out.println("直角三角形");
//		} else
//			System.out.println("其他三角形");
//
//		// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息:
//
//		int i = (int) (Math.random() * 10);
//		Scanner ran = new Scanner(System.in);
//		System.out.println("開始猜數字囉！");
//		System.out.println("請輸入一個0~9的整數：");
//		int g = ran.nextInt();
//		while (g != i) {
//			System.out.println("你猜錯了！");
//			System.out.println("請輸入一個0~9的整數：");
//			g = ran.nextInt();
//			continue;
//		}
//		System.out.println("猜對了！答案就是" + i);
//		System.out.println("遊戲結束。");
//
//		// 進階挑戰:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
//
//		int i2 = (int) (Math.random() * 101);
//		Scanner ran2 = new Scanner(System.in);
//		System.out.println("開始猜數字囉！");
//		System.out.println("請輸入一個0~100的整數：");
//		int gu = ran2.nextInt();
//		while (gu != i2) {
//			System.out.println("你猜錯了！");
//			if (gu > i2) {
//				System.out.println(gu + "大於正確答案");
//			} else if (gu < i2) {
//				System.out.println(gu + "小於正確答案");
//			}
//			System.out.println("請輸入一個0~100的整數：");
//			gu = ran2.nextInt();
//			continue;
//		}
//		System.out.println("答對了！答案就是" + i2);
//		System.out.println("遊戲結束。");

		// 設計一隻程式,讓阿文可以輸入他不想要的數字,畫面會顯示他可以選擇的號碼與總數
		Scanner ran49 = new Scanner(System.in);
		System.out.println("電腦選號系統開始！");
		System.out.println("請輸入一個不想要的數字(1~9)：");
		int hate = ran49.nextInt();
		int sum = 0;
		System.out.println("你可以選擇的號碼為：");
		for (int l = 1; l <= 49; l++) { 	// 可選數字
			if ((l % 10) != hate && l < (hate * 10)) {
				System.out.print(l + " ");
				sum++;
			} else if ((l % 10) != hate && (hate * 10 + 9) < l) {
				System.out.print(l + " ");
				sum++;
			}
		}
		System.out.println("\n可選擇的號碼共有" + sum + "個");
		// 進階挑戰
//		System.out.println("電腦選出的六個號碼為：");
//		int[] ucc = new int[sum]; 			// 將可選數字填入陣列長度
//		int j = 0;
//		for (int l = 1; l <= 49; l++) {
//			if ((l % 10) != hate && l < (hate * 10)) {
//				ucc[j] = l;					//將數字按順序填入陣列
//				j++;
//			} else if ((l % 10) != hate && (hate * 10 + 9) < l) {
//				ucc[j] = l;
//				j++;
//			}
//		}
//		int uc1, uc2, uc3, uc4, uc5, uc6;
//		do { 								// 隨機六個數字
//			uc1 = (int) (Math.random() * sum);
//			uc2 = (int) (Math.random() * sum);
//			uc3 = (int) (Math.random() * sum);
//			uc4 = (int) (Math.random() * sum);
//			uc5 = (int) (Math.random() * sum);
//			uc6 = (int) (Math.random() * sum);
//		} while (uc1 == uc2 || uc1 == uc3 || uc1 == uc4 || uc1 == uc5 || uc1 == uc6 || uc2 == uc3 || uc2 == uc4
//				|| uc2 == uc5 || uc2 == uc6 || uc3 == uc4 || uc3 == uc5 || uc3 == uc6 || uc4 == uc5 || uc4 == uc6
//				|| uc5 == uc6); 			// 六個隨機的數字需不相等
//		System.out.println(ucc[uc1] + " " + ucc[uc2] + " " + ucc[uc3] + " " + ucc[uc4] + " " + ucc[uc5] + " " + ucc[uc6]);
	}
}
