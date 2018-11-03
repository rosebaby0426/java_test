package Practice;

public class Bike {
	//新的類別
	double speed;
	//類別定義
	Bike(String x){//此物件類別的初始值定義
		speed = 7;
		System.out.println("x : "+ x );
	}
	
	//此類別的方法設定，沒有需要回傳值，所以用void
	 void addspeed() {
		 
		System.out.println("我沒有帶參數");
	}	
	 void addspeed(int a) {
		 
		 System.out.println("我有帶參數 : "+a);
//		 speed *=1.2;
	 }	
	
	 void reducespeed() {
		speed *=0.7;
	}
}
