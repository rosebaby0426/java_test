package Homework;

public class HW9_Man implements Runnable {

	String name;
	Thread t;
	int bowl;

	HW9_Man(String manName) {
		name = manName;
		t = new Thread(this, name);
		System.out.println("參賽者" + manName);
		t.start();
	}

	public void run() {
		try {
			for (int bowl = 1; bowl <= 10; bowl++) {
				System.out.println(name + "吃第" + bowl + "碗飯");
				Thread.sleep((int) (Math.random() * 3000 + 1));
			}

		} catch (Exception e) {

		}
		System.out.println(name + "吃完了");
	}
}
