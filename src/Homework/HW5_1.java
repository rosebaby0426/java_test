package Homework;

import java.util.Scanner;

public class HW5_1 {
	
//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與
//	高時,即會印出對應的*長方形,如圖:
	
	int width = 0;
	int height = 0;
	
	/** 
	 * @param height 讓使用者輸入的高度參數
	 * @param width 讓使用者輸入的寬度參數
	 */
	public static void starSquare(int height,int width) {
		
		for (int i=0 ; i<height ; i++) {
			for(int j=0 ; j<width ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner userKeyIn = new Scanner(System.in);
		//因為方法是設定static,所以可以不用先建立物件就可以直接使用方法
		starSquare(userKeyIn.nextInt(), userKeyIn.nextInt());
		
		userKeyIn.close();				
	}
}
