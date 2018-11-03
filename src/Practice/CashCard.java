package Practice;

public class CashCard {
	
	String number;
	int balance;
	int bonus;
	
	public CashCard(String number,int balance,int bonus) {
		//建構子，沒有static，也沒有回傳的參數，更沒有回傳的類型
		//方便同樣的物件在創立時產生的同樣的步驟，所以把產生同樣的物件利用建構子的方式產生出來
		this.number = number;//因為名稱相同，避免JAVA看不懂要的參數是哪一個，所以用this來指定是要哪個同名參數
		this.balance = balance;
		this.bonus = bonus;	
	}

}
