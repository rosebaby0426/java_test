package Practice;

public class CardApp {

	public static void main(String[] args) {
		CashCard[] cards= {//產生了CashCard新的陣列物件
				new CashCard("A001",500,0),//物件內容參考CashCard的建構子
				new CashCard("A002",300,0),
				new CashCard("A003",1000,1),
				new CashCard("A004",2000,2),
				new CashCard("A005",3000,3)
		};
		
		for(CashCard x : cards) {//for迴圈的增強寫法，形同一般for迴圈
			System.out.printf("(%s,%d,%d)%n",x.number,x.balance,x.bonus);
		}

	}

}
