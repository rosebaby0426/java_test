package Homework1017;

public class HomeWorkP1 {
	
	public static void main(String[] args){
		
		System.out.println("1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)");
		
		int sum1 = 0;
		for(int i=1 ; i<=1000 ; i++) {
			if( i%2 == 0) {
				sum1 += i;
				System.out.println( "總和 = " + sum1);
			}
		}
			
		System.out.println("======================================");
		
		System.out.println("2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)");
		
		int sum2 = 1 ;
		for(int i2=1 ; i2<=10 ; i2++) {
			sum2 *= i2 ;
			System.out.println( "連乘積 = " + sum2 );
		}
		
		System.out.println("======================================");
		System.out.println("3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)");
		
		int sum3 = 1, i3 = 1;
		while (i3<=10) {
			sum3 = sum3 * i3 ;
			 i3++;
			System.out.println("連乘積 = " + sum3);
		}
		
		System.out.println("======================================");
		System.out.println("4.請設計一隻Java程式,輸出結果為以下:\r\n" + 
				"1 4 9 16 25 36 49 64 81 100");
			
		int sum4 = 1 ;
		for(int i4=3 ; sum4 <= 100 ; i4+=2) {
			System.out.println("sum4 =" + sum4 );
			sum4 += i4 ;
						
		}
		System.out.println("======================================");
		System.out.println("5.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。\r\n" + 
				"請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?");
		
		int lot ;
		for (lot = 1 ; lot<=49 ; lot++) {
			if( (lot/10)!=4  && (lot%10)!=4 ) {
				System.out.print(lot + " ");
			}
		}
		
		System.out.println();
		System.out.println("比對數字的字串內不含4的解法");
		
		for(int g=1; g<=49 ; g++){
			if(!String.valueOf(g).contains("4")){
			 System.out.print(g + " ");
			}
		}
		System.out.println();
		
		System.out.println("======================================");
		System.out.println("請設計一隻Java程式,輸出結果為以下:\r\n" + 
				"1 2 3 4 5 6 7 8 9 10\r\n" + 
				"1 2 3 4 5 6 7 8 9\r\n" + 
				"1 2 3 4 5 6 7 8\r\n" + 
				"1 2 3 4 5 6 7\r\n" + 
				"1 2 3 4 5 6\r\n" + 
				"1 2 3 4 5\r\n" + 
				"1 2 3 4\r\n" + 
				"1 2 3\r\n" + 
				"1 2\r\n" + 
				"1");
		
		System.out.println("如圖");
		int x = 0 , y = 0 ;
		for (x = 10 ; x > 0 ; x--) {
			for (y = 1 ; y <= x ; y++) {
				System.out.print(y);
			}
			System.out.println(" ");
			
		}
		System.out.println("======================================");
		
		
	}
}
