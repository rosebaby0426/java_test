package Homework;

public class HW9_EatGame {

	public static void main(String[] args) {

		System.out.println("大胃王快食比賽開始");
		// 建立參賽者類別(有繼承Thread)
		HW9_Man2 bob = new HW9_Man2("Bob");
		HW9_Man2 john = new HW9_Man2("John");
		// 兩位參賽者開始執行run方法
		bob.start();
		john.start();

		try {
			// 為了讓main執行緒不要立馬結束，所以利用join讓main方法等待建立出來的執行緒跑完再結束
			bob.join();
			john.join();
		} catch (Exception e) {
		}
		System.out.println("比賽結束");
	}

}
