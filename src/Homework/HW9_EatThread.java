package Homework;

public class HW9_EatThread {

	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		HW9_Man man1 = new HW9_Man("dudu");
		HW9_Man man2 = new HW9_Man("kitty");
		System.out.println("大胃王快食比賽開始");

		try {
			man1.t.join();
			man2.t.join();
		} catch (Exception e) {

		}
		System.out.println("大胃王快食比賽結束");
	}

}
