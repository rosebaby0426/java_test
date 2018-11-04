package Homework;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {

		System.out.println("請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三\r\n" + "角形、其它三角形或不是三角形,如圖示結果:");
		// 宣告三個會用到的整數
		int a, b, c;
		// 告訴使用者輸入數字
		System.out.println("請輸入三個數字(以空白鍵分開)");
		// 將使用者輸入的數字儲存起來方便後續比對使用
		Scanner keyin = new Scanner(System.in);
		// 比對使用者輸入的數字是否為整數
		back://做個記號方便重新輸入數字做比對
		while (keyin.hasNextInt() == true) {
			// 如果是，將比對的數字再次儲存起來做後續比對
			a = keyin.nextInt();
			b = keyin.nextInt();
			c = keyin.nextInt();
			//開始比對abc三個值內是不是有0的值
			while (a != 0 && b != 0 && c != 0) {
				//abc三個值都沒有0，再比對以下條件
				if (a == b && b == c) {
					//a=b且b=c才符合
					System.out.println("正三角形");
					//符合答案後直接跳離迴圈
					break back;
				} else if (a == b || a == c || b == c) {
					//a=b或b=c或a=c三個條件符合其中一個
					System.out.println("等腰三角形");	
					break back;
				} else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
					//(a平方)+(b平方) =(c平方)
					System.out.println("直角三角形");	
					break back;
				} else {
					//以上都不符合
					System.out.println("其他三角形");	
					break back;
				}
				
			}
			//abc三個值其中有一個是0
			System.out.println("不是三角形");
			System.out.println("請重新輸入");
			//回到back的地方再重新比對
			continue back;
			
		}
		
		System.out.println("===================================");
		System.out.println("請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜\r\n" + "錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:");
		
		Scanner sc = new Scanner(System.in);
		//將使用者輸入的儲存起來
		int i = (int) (Math.random() * 10);
		//系統隨機產生正確答案
		int ans = sc.nextInt();
		//使用者輸入的答案儲存起來做以下比對
		while (ans != i) {
			System.out.println("猜錯");
			if (ans > i) {
				System.out.println("你的答案大於正確答案");
			} else {
				System.out.println("你的答案小於正確答案");
			}
			System.out.println("請再輸入數字");
			ans = sc.nextInt();
			//因為輸入錯誤再從新輸入回到回圈內
			continue;
		}
		System.out.println("猜中了!答案就是" + i);
		sc.close();
//
		System.out.println("===================================");
		System.out.println("阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,\r\n" + "但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文\r\n"
				+ "可以輸入他不想要的數字,畫面會顯示他可以選擇的號碼與總數,如\r\n" + "圖:");

		Scanner lot = new Scanner(System.in);
		System.out.println("請輸入不要的數字");
		int hate = lot.nextInt();
		//將使用者輸入的數字儲存起來方便後續使用
		int sum = 0;//所有使用者可以挑選的號碼加總先預設
		for (int co = 1; co <= 49; co++) {
			if ((co / 10) != hate && (co % 10) != hate) {

				System.out.print(co + " ");
				sum++;
			}
		}
		System.out.println("共" + sum + "個");
		lot.close();
	}

}
