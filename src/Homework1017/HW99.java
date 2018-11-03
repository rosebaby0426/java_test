package Homework1017;

public class HW99 {

	public static void main(String[] args) {
		
		
		System.out.println("NineNineLoop1");
		int i , j ;

		for (i = 1; i <= 9; i++) {
			j = 1;
			while( j<=9) {
				System.out.println(i + "*" + j + "=" + i * j + "\t");
				j++;
				continue ;
			}
		}

		System.out.println("===================================");
		System.out.println("NineNineLoop2");
		
		int a , b ;
		for (a = 1; a <= 9; a++) {
			b = 1;
			do {
				System.out.println(a + "*" + b + "=" + a * b + "\t");
				b++;
			}while(b<=9);
		}
		
		System.out.println("===================================");
		System.out.println("NineNineLoop3");
		
		int x , y ;
		x = 1;
		while(x<=9){
			y = 1;
			do {
				System.out.println(x + "*" + y + "=" + x * y + "\t");
				y++;
			}while(y<=9);
			x++;
		}
		
		
	}

}
