package myPractice;

import java.util.Arrays;

public class ArraySortPractice {

	public static void main(String[] args) {
	
	int[] number = {70,80,31,37,10,1,48,60,33,80};
	
	Arrays.sort(number);
	
	for(int x=0 ; x<number.length ; x++) {
		System.out.print(number[x]+ "  ");
	}
	
	
	}
}
