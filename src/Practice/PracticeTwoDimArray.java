package Practice;

public class PracticeTwoDimArray {

	public static void main(String[] args) {
		
		int[][] score = {
				{1,2,3},
				{4,5,6}  };
		for ( int x = 0; x < score.length ; x++) {
			for(int y = 0 ; y < score[x].length ; y++) {
				System.out.print(score[x][y] + "\t");
			}
			System.out.println();
		}
		
		//創建新的一維陣列
		int [] point = new int[6];//陣列裡的元素共有6個
		//利用迴圈跑出陣列元素的資料
		for(int i = 0; i<100 ; i++) {
			point[(int)(Math.random()*6)]++;
		}
	
		for(int i = 0; i< point.length ; i++) {
			System.out.println((i+1) +"點出現"+point[i]+"次");
		}
		
		//創建新的二維陣列
		int[][] arr = new int[2][];
		//陣列中的第一列(index=0)的參數設定
		arr[0] = new int[] {1,2,3};
		//陣列中的第二列(index=0)的參數設定
		arr[1] = new int[] {3,4,5,6};
		for(int[] row:arr) {
			for(int value:row) {
				System.out.printf("%2d",value);
			}
		}
		
		
		
	}
}
