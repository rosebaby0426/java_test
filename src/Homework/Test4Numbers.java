package Homework;


public class Test4Numbers {

	public static void main(String[] args) {
		int i = 0;
		for (; i <= 100 ; i++) {
			// i 代表是初始值，可以先宣告條件外面，方便後續資料取用
			// i<= 100 代表是條件
			// i++ 代表i每比對完一次條件後再+1次做循環比對直到不符合條件
			if(i % 4 == 0)
				//代表上列for裡的i值的限制條件
				System.out.print(i + " ");
		}
			
		System.out.println(" ");
		
	

	}

}
