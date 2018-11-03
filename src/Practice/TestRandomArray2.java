package Practice;

public class TestRandomArray2 {

	public static void main(String[] args) {
		TestRandomArray2 tra = new TestRandomArray2();
		int[][] x = tra.getRandomArray();
		int[][] y = tra.getRandomArray();
		int[][] z = new int[3][3];
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		tra.printRandomArray(x);
		tra.printRandomArray(y);
		tra.printRandomArray(z);
		
	}
	
	
	public int[][] getRandomArray() {
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				int random = (int)(Math.random() * 31);
				data[i][j] = random;
			}
		}
		return data;
	}
	
	public void printRandomArray(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
	}
	
	
}
