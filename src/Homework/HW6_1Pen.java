package Homework;

public abstract class HW6_1Pen {

	private String brand;
	private double price;
	
	public HW6_1Pen() {}
	
	public HW6_1Pen(String brand , double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("品牌 = " + brand);
		System.out.println("價格 = " + price);
	}
	
//	public abstract void write();
	
	
}
