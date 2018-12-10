package myPractice;

interface Pen {
	void write();
}

class penAnonymous implements Pen {
	@Override
	public void write() {
		System.out.println("怎麼寫");
	}

}

public class TestAnonymousInnerClass {

	public static void main(String[] args) {
		Pen bluePen = new Pen() {
			public void write() {
				System.out.println("bluePen用藍色原子筆寫");
			}
		};
		bluePen.write();

		Pen bluePen2 = new penAnonymous();
		bluePen2.write();

	}
}
