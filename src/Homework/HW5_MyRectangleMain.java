package Homework;

public class HW5_MyRectangleMain {

	public static void main(String[] args) {
		
		HW5_MyRectangle a = new HW5_MyRectangle();
		a.setWidth(10);
		a.setDepth(20);
		System.out.println(a.getArea());
		
		HW5_MyRectangle b = new HW5_MyRectangle(10,20);
		System.out.println(b.getArea());
		
	}
}
