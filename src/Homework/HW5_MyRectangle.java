package Homework;

public class HW5_MyRectangle {

	double width , depth ;
	
	public HW5_MyRectangle() {
		
	}
	
	public HW5_MyRectangle(double width,double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}
	
	double getArea() {
		double area = width * depth;
		return area;
	}
	
}
