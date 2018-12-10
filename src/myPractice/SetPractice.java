package myPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {

		Scanner concle = new Scanner(System.in);
		System.out.print("請輸入英文");

		Set words = tokenSet(concle.nextLine());
		System.out.printf("不重複的單字有%d個 : %s%n", words.size(), words);

		concle.close();
	}

	static Set tokenSet(String line) {
		String[] token = line.split(" ");
		return new HashSet(Arrays.asList(token));

	}
}
