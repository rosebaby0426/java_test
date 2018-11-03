package Practice;

import java.util.Scanner;

public class HWPractice {

	public static void main(String[] args) {
		//scanner的呼叫練習
////		
////		if (ans.hasNextInt(1)){			
//			System.out.println("答對了!答案就是1");
//			
//		}else {
//			System.out.println("猜錯囉!");
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		int i  = (int)(Math.random()*10);
//		int ans ; //= sc.nextInt();
//		System.out.println("請輸入數字");	
//		ans = sc.nextInt();
//			while(ans != i ) {			
//				System.out.println("猜錯");
//				System.out.println("請再輸入數字");
//				ans = sc.nextInt();
//				continue;
//			}
//				System.out.println("猜中了!答案就是" + i);
//		}
//			
//	
	
		Scanner sc = new Scanner(System.in);
		int i  = (int)(Math.random()*101);
		int ans ; //= sc.nextInt();
		System.out.println("請輸入數字");	
		ans = sc.nextInt();
			while(ans != i ) {			
				System.out.println("猜錯");
				if(ans > i) {
					System.out.println("你的答案大於正確答案");
				}else {
					System.out.println("你的答案小於正確答案");
				}
				System.out.println("請再輸入數字");
				ans = sc.nextInt();
				continue;
			}
				System.out.println("猜中了!答案就是" + i);
		
	
	
	
	
//		int i = 0;
//		
//		
//		
//			i = (int)(Math.random()*10)+1;
//			System.out.println(i);
		
		
		
		
//		
//		if(a==b && b==c) {
//			System.out.println("正三角形");
//		}
//		else if(a=b || a=c || b=c) {
//			System.out.println("等腰三角形");
//		}
//		else if(a=0 || b=0 || c=0) {
//			System.out.println("不是三角形");
//		}
//		else if(a!=b && a!=c) {
//			System.out.println("其他三角形");
//		}
		
		
		
		
		
	}
}
	

