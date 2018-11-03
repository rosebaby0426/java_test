package myPractice;

import java.util.Scanner;

public class FindArrayIndexNumber {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int keyin = sc.nextInt();
		int[] number = {1,10,31,33,37,48,60,70,80};
		
		for (int i=0 ; i<number.length ; i++) {
			if (keyin == number[i]) {
				System.out.print( i +"  ");
			}else {
				System.out.print("-1" + "  ");
			}
		}
		sc.close();
	}

}
