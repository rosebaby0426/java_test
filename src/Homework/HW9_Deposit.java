package Homework;

public class HW9_Deposit {
	private int totalMoney = 0;// 存款餘額

	synchronized public void moneyIn(int money) {
		while (totalMoney > 2000) { // 總存款>2000媽媽停止匯錢
			System.out.println("媽媽看到餘額還有2000以上喔，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		totalMoney += money;// 存款+每次存入的錢
		System.out.println("媽咪存了" + money + "元，存款還有" + totalMoney + "元");
		System.out.println("省點用阿 ~ 孩子!!!!");
		notify();// 通知兒子可以準備領錢
	}

	synchronized public void moneyOut(int money) {
		while (totalMoney < money) {// 餘額低於要領的錢
			System.out.println("\t\t\t\t兒子發現快沒錢了，暫停領錢");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		totalMoney -= money;// 存款-每次領的錢
		System.out.println("\t\t\t\t兒子領了" + money + "元，餘額還剩下" + totalMoney + "元");

		if (totalMoney < 1000) {//
			System.out.println("\t\t\t\t錢不夠了，媽媽幫我匯錢來");
			notify();// 通知媽媽準備匯錢
		}

	}
}

class Mom extends Thread {
	HW9_Deposit deposit;

	public Mom(HW9_Deposit deposit) {
		this.deposit = deposit;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			deposit.moneyIn(2000); // 每次存2000
			System.out.println("媽剩下:" + (10 - i) + "次");
		}
	}
}

class Son extends Thread {
	HW9_Deposit deposit;

	public Son(HW9_Deposit deposit) {
		this.deposit = deposit;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			deposit.moneyOut(1000); // 每次領1000
			System.out.println("\t\t\t\t兒子剩下:" + (10 - i) + "次");
		}
	}
}