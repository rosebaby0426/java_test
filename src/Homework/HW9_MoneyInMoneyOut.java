package Homework;

public class HW9_MoneyInMoneyOut {

	public static void main(String[] args) {
		HW9_Deposit deposit = new HW9_Deposit();

		Mom mom = new Mom(deposit);
		Son son = new Son(deposit);
		mom.start();
		son.start();

	}

}
