package myPractice;

import java.util.StringTokenizer;

public class StringTokenizerPractice {

	public static void main(String[] args) {
		String s1 = "This is a book. That is a book. I am Bob.";
		String s2 = "This is a book. That is a book.\nI am\tBob.";
		StringTokenizer stk = new StringTokenizer(s1);
		StringTokenizer stk2 = new StringTokenizer(s2);

		while (stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
		// 預設值是空白、換行、換列
		System.out.println("================================");
		while (stk2.hasMoreElements()) {
			System.out.println(stk2.nextElement());
		}
	}

}
