package myPractice;

class OutClass {
	int a;

	OutClass() {
		a = 100;
	}

	public void printOut() {
		System.out.println(a);
	}

	class InnerClass {
		int b;

		public void printInner() {
			b = 1000;
			System.out.println(b);
		}
	}
}

public class InnerClassPractice {
	public static void main(String[] args) {
		OutClass.InnerClass out1 = new OutClass().new InnerClass();
		out1.printInner();

	}
}
