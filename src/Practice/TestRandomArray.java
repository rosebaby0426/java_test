package Practice;

public class TestRandomArray {

	public static void main(String[] args) {
		
		//練習題：請分別建立x,y,z三個3*3的int陣列，然後再將x陣列跟y陣列的加總存放到z陣列，再將結果顯示出來
		
		int[][] x  = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
			
		for(int i = 0; i< x.length ; i++) {
			for(int j = 0 ; j < x[i].length ; j++) {
				int random = (int)(Math.random()*31);
				x[i][j] = random;
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		for(int i = 0; i < y.length ; i++) {
			for(int j = 0 ; j< y[i].length ; j++) {
				int random = (int)(Math.random()*31);
				y[i][j] = random;
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		for(int i = 0 ; i < z.length ; i++) {
			for(int j = 0 ; j < z[i].length ; j++) {
				z[i][j] = x[i][j] + y[i][j] ;
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
