package Practice;

public class TestOverloading {

	public static double areaMeasure(double radius) {
		return radius*radius*3.14;
	}
	public static double areaMeasure(double height,double width) {
		return height * width;
	}
	public static double areaMeasure(double upper,double bottom,double height) {
		return (upper+bottom)*height/2;
	}
	
	public static void main(String[] args) {
		double a = areaMeasure(2.2);
		double b = areaMeasure(10,12);
		double c = areaMeasure(3 , 2.2 , 5.2);
		System.out.println("圓面積 = " + a);
		System.out.println("長方形面積 = " + b);
		System.out.println("梯形面積 = " + c);
		
	}
}
