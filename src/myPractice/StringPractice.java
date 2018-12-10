package myPractice;

public class StringPractice {

	public static void main(String[] args) {
		byte[] b1 = { 97, 98, 99, 100 };// ASCII的代碼
		String str = new String(b1, 0, b1.length);
		System.out.println(str);
	}

}
