package Homework;

public class HomeWork2 {

	public static void main(String[] args) {
		
		System.out.println("用for迴圈+while迴圈寫99乘法表");
		int a, b ;
		for (a=1 ; a <= 9 ;a++) {
			b=1;
			while (b<=9) {
				if(b>=9) {
					System.out.println(a + "*" + b + "=" + (a*b));					
				}else {
					System.out.print(a + "*" + b + "=" + (a*b)+"\t");
				}
				b++;
			}			
		};						
		System.out.println("--------------------");
		System.out.println("用for迴圈+ do while迴圈寫99乘法表");
		int x,y;
		for (x=1;x<=9;x++) {
			y=1;
			do {
				if(y>=9) {
					System.out.println(x + "*" + y + "=" + (x*y));					
				}else {
					System.out.print(x + "*" + y + "=" + (x*y)+"\t");
				}
				y++;
			}while(y<=9);
		}				
		System.out.println("--------------------");
		System.out.println("用while迴圈+ do while迴圈寫99乘法表");
		int i , j;
		i = 1;
		while(i<=9){
			j= 1;
			do {
				if(j>=9) {
					System.out.println(i + "*" + j + "=" + (i*j));					
				}else {
					System.out.print(i + "*" + j + "=" + (i*j)+"\t");
				}
			j++;	
			}while(j<=9);
			i++;
		}		
		System.out.println("--------------------");
		System.out.println("1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)");
		int c ;
		int sum = 0;
		for(c = 1 ; c <=1000 ; c++) {
			if( c%2 == 0 ){
				sum = sum + c;			
			}
		}
		System.out.println("sum = " + sum);
				
		System.out.println("--------------------");
		System.out.println("2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)");
		
		int count = 1 ;
		for ( int z=1 ; z<=10 ; z++) {
			count = count*z;
		}
		System.out.println("cont =" + count);
						
		System.out.println("--------------------");
		System.out.println("3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)");
		
		int cont1 = 1, q = 1;
		while( q <= 10) {
			cont1 = cont1 * q;
			q++;
		}
		System.out.println("cont1 = " + cont1);
				
		System.out.println("--------------------");
		System.out.println("4.請設計一隻Java程式,輸出結果為以下:\r\n" + 
				"1 4 9 16 25 36 49 64 81 100");
		int out = 1 ;
		for( int p =1 ; p<=10 ; p++) {
			out = (int)Math.pow(p, 2);
			System.out.print("out = "+ out +"  ");
		}
		System.out.println();
			
		System.out.println("--------------------");
		System.out.println("阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。\r\n" + 
				"請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?");
		
		int sum1 = 0;
		for ( int lot = 1 ; lot<=49 ; lot++) {
			if( (lot/10)!=4  &&  (lot%10)!=4 ) {
				
				System.out.print(lot + " ");
				sum1++;
			}
		}
		System.out.println( "共" + sum1 + "個");
		
		System.out.println();
		System.out.println("以比對數字的字串內不含4的解法");
		
		for(int g=1; g<=49 ; g++){
			if(!String.valueOf(g).contains("4")){
			 System.out.print(g + " ");
			}
		}
		System.out.println();
		
		
		
		System.out.println("--------------------");
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
		int n1 = 0 , n2 = 0 ;
		for (n1 = 10 ; n1 > 0 ; n1--) {
			for (n2 = 1 ; n2 <= n1 ; n2++) {
				System.out.print(n2);
			}
			System.out.println(" ");
			
		}
		
		
		System.out.println("--------------------");
		System.out.println("請設計一隻Java程式,輸出結果為以下:\r\n" + 
				"A\r\n" + 
				"BB\r\n" + 
				"CCC\r\n" + 
				"DDDD\r\n" + 
				"EEEEE\r\n" + 
				"FFFFFF");
		System.out.println("");
		System.out.println("如圖");
		int g = 0 , h = 0 ;
		for (g = 1 ; g < 6 ; g++) {
			for (h = 1 ; h <= g ; h++) {
				int charNumber = 64;
				charNumber += g;
				System.out.print((char)(charNumber));
			}
			System.out.println(" ");
			
		}

	}

}
