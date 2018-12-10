package myPractice;

class OutClass3 {
	int outA = 1;
	static int outB = 2;

	public static class InnerClass {
		int inA = 10;
		static int inB = 200;

		public void showIn() {
			System.out.println("inA = " + inA);
			System.out.println("inB = " + inB);
//			System.out.println("outA = " + outA);
			System.out.println("outB = " + outB);
		}
	}

	public void showOut() {
		System.out.println("outA = " + outA);
	}
}

public class TestStaticInnerClass {
	public static void main(String[] args) {
		OutClass3.InnerClass ic = new OutClass3.InnerClass();
		ic.showIn();
		ic.inA = 500;
		System.out.println("inA = " + ic.inA);
	}

}
