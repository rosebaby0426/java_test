package myPractice;

class Pen1 {
	void write() {
		System.out.println("123");
	}
}

class penAnonymous1 extends Pen1 {
	@Override
	public void write() {
		System.out.println("怎麼寫");
	}
}

public class TestAnonymousInnerClass2 {

	public static void main(String[] args) {
		Pen1 bluePen = new Pen1() {
			public void write() {
				System.out.println("bluePen用藍色原子筆寫");
			}
		};
		bluePen.write();

		Pen1 bluePen2 = new penAnonymous1();
		bluePen2.write();
	}
}
