package Homework;

import java.util.Scanner;

public class HW5_2 {

	/**
	 **請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	 */

	
	public  void randomNumber(int number) {
		int[] num = new int[number]; 
		for(int i=0 ; i<number ; i++) {
			num[i] = (int)(Math.random()*10);
			for (int j=0 ; j<i ; j++) {
				if(num[j] == num[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<number;i++) {
			System.out.print( num[i] + " ");
		}
		System.out.println();
		sumNumber(num, number);
	}
	
	public  void sumNumber(int[] num , int count) {
		int sum = 0 ;
		
		for(int i=0 ; i<num.length ; i++) {
			sum += num[i];
		}
		System.out.println("亂數總和=" + sum);
		randAvg(sum,count);
	}
	
	
	public  void randAvg(int sum,int count) {
		int avg = 0;
		avg = sum / count;
		System.out.println("平均值 = " + avg);
	}
	
	public static void main(String[] args) {
		HW5_2 object = new HW5_2();
		Scanner userKeyIn = new Scanner(System.in);
		object.randomNumber(userKeyIn.nextInt());
		
		userKeyIn.close();
	}
	
	
}
