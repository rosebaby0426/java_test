package Practice;

public class PracticeOneArray {

	public static void main(String[] args) {
		//10個學生分數	，用陣列表示
		int[] score = {88,81,74,68,78,76,77,85,95,93};
		//學生成績加總sum
		int sum = 0;//預設學生成績加總為0
		
		for(int i=0 ; i < score.length ; i++) {
			//i 代表學生順序(學生總數的元素數量用length來表示)
			//要重複執行，所以用迴圈，因為重複執行次數是確定的所以用for迴圈
			System.out.print(score[i] + "\t");
			//每次執行顯示出第i順序的學生成績
			sum = sum + score[i];
			//成績加總=每位學生成績相加
			
		}
		//顯示成績加總分數
		System.out.println("總分數 = " + sum);
	}
}
