package Homework;

import java.util.Scanner;

public class HW5_2_2 {

	/**
	 **請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	 */

	/**
	 * 
	 * @param count 是亂數"個數"
	 * @return 回傳一個int的計算結果到main方法
	 */
	public  int randomNumber(int count) {
		int[] num = new int[count]; 
		for(int i=0 ; i<count ; i++) {
			num[i] = (int)(Math.random()*101);
			for (int j=0 ; j<i ; j++) {
				if(num[j] == num[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0 ; i<count ; i++) {
			System.out.print(num[i] + " ");
		}
				
		System.out.println();
		//這個方法執行完後將num跟count的值丟進sumNumber的方法裡再繼續執行，等到執行完結果才將結果丟回去
		return sumNumber(num, count);
	}
	
	/**
	 * 方法名稱：計算加總
	 * @param num 是透過上面randomNumber的方法所產生出來的陣列
	 * @param count 一開始的亂數數量
	 * @return 回傳一個int到randomNumber這個方法裡
	 */
	public  int sumNumber(int[] num , int count) {
		int sum = 0 ;
		
		for(int i=0 ; i<num.length ; i++) {
			sum += num[i];
		}
		System.out.println("亂數總和=" + sum);
		//這個方法執行完後將sum跟count繼續丟進randAvg這個方法裡去執行結果才回傳
		return randAvg(sum,count);
	}
	
	/**
	 * 方法名稱：計算平均值
	 * @param sum 是透過上面sumNumber方法所得到的加總
	 * @param count 一開始的亂數數量
	 * @return 回傳一個int最後平均值的計算結果到sumNumber的方法裡
	 */
	public  int randAvg(int sum,int count) {
		int avg = 0;
		avg = sum / count;
		//將這個方法執行完的結果回傳給上一個方法
		return avg;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//因為要使用HW5_2_2裡面所寫的非static方法，所以要先把HW5_2_2這個物件建立出來才能呼叫裡面的方法
		HW5_2_2 object = new HW5_2_2();
		Scanner userKeyIn = new Scanner(System.in);
		System.out.println("平均值=" + object.randomNumber(userKeyIn.nextInt()));
		
		userKeyIn.close();
	}
	
	
}
