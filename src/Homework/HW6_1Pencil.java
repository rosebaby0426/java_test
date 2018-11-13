package Homework;

public class HW6_1Pencil extends HW6_1Pen implements HW6_1ICanWrite{
	
	public HW6_1Pencil() {}
	
	public HW6_1Pencil(String brand , double price) {
		super(brand,price);		
	}
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
}
