package Homework;

public class HW6_1InkBrush extends HW6_1Pen implements HW6_1ICanWrite{

	public HW6_1InkBrush() {}
	
	public HW6_1InkBrush(String brand , double price) {
		super(brand , price);
		
	}
	
	public void write() {
		System.out.println("沾墨汁再寫 ");
	}
}
