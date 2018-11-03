package Practice;

public class MybikeTest {

	public static void main(String[] args) {
		
		Bike mybike;//建立新的物件，類別是Bike，但是Bike這個類別已經建立出來所以可以當作一個類別型態
		mybike = new Bike("abc");//給物件新的儲存空間
		
		mybike.addspeed();
		mybike.addspeed(123);
		mybike.speed=10;
//		System.out.println(mybike.speed);
//		
//		mybike.speed = 10;
//		System.out.println(mybike.speed);
//
//		mybike.addspeed();//
//		mybike.reducespeed();
//		System.out.println(mybike.speed);
	}

}
