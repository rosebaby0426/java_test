package myPractice;

public class MathPractice {

	public static void main(String[] args) {
		int var;
		int counter = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				var = i % j;
				if (var == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				System.out.print(i + " ");
			}
			counter = 0;
		}
	}

}
