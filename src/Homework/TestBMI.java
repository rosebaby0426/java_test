package Homework;

public class TestBMI {

	public static void main(String[] args) {
		double weight = 65, height = 1.8 ;
		double bmi = weight / (height*height);
		System.out.println("BMI = " + bmi);
		
		 if (bmi < 18.5) {//假如bmi條件成立，執行下列指令
			 System.out.println("過瘦");
		 } else if (18.5 <= bmi && bmi < 24.0) {
			 //上列條件不成立，就執行地條件比對，若成立，就執行指令
			 System.out.println( "正常");
		 }
		 else {//上列所有條件不成立，就執行下列指令
			 System.out.println( "過胖");
		 }
		 
		 
		 
	}

}
