package myPractice;

import java.util.Scanner;

public class RegexPractice {

	public static void main(String[] args) {

		Scanner keyin = new Scanner(System.in);
		System.out.println("請輸入身份證字號");
		String id = keyin.nextLine();

		// 身分證驗證
		if (id.matches("^[A-Za-z][1-2][0-9]{8}$")) {
			System.out.println(id);
		} else {
			System.out.println("輸入錯誤");
		}

		keyin.close();
	}
}
