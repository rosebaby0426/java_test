package Homework;

public class HW9_Man2 extends Thread {
	// 因為要同時執行，所以繼承Thread
	String name;

	public HW9_Man2() {
	}

	public HW9_Man2(String manName) {
		name = manName;
		System.out.println("參賽者：" + name);

	}

	// Thread執行方法改寫
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
