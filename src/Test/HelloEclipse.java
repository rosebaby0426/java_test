package Test;

import java.util.Scanner;

public class HelloEclipse {
	//專案分類的開頭
	public static void main(String[] args) {
		//程式的起始點
		System.out.println("Hello!");
		//程式輸出，()中間的有""表示會直接顯示引號裡的字元
		//""雙引號內可放2個字元以上，單引號只能放一個字元
		//每行程式打完要加;作結束
		System.out.println("================");
		
		//基本型態 ~ 整數
		byte byte1 = 1;
		System.out.println("byte1 :" +byte1);
		
		short short1 = 2;
		System.out.println("short1 : "+short1);
		
		int int1 = 3;
		System.out.println("int1 :" +int1);
		
		long long1 = 4;
		System.out.println("long1 : " +long1);
		//位階由小到大，程式碼右邊的位階不能大於左邊的位階
		
		int int2 = 0x7d;
		System.out.println("int2 : "+int2);
		//0x代表使用16進位去計算數值，利用0x後面的值計算
		//int數值都是用十進位表示法
		//0x後面的數值算出來後相加就是int的值
		//e=14(代表第一個值)*16的0次方
		//8(代表第二個值)=8*16的1次方
		
		int int3 = 0b0010;//二進位表示
		System.out.println("int3 : "+int3);
		
		int int4 = 1_000_000;
		System.out.println("int4 : "+int4);
		//JDK7以後可以利用_(但是輸出時電腦不會顯示)把數字隔開
		
		System.out.println("===========");
		
		//基本型態 ~ 浮點數(小數點)
		float float_ = 1.0f;//float類型小數點
		System.out.println("float_ : " +float_);
		
		double double_ = 2.0;//預設型態，可存的小數點最多
		System.out.println("double :" + double_);
		
		float float_1 = 1234567890;
		System.out.println("float_1 :" + float_1);
		//E代表著前面的值乘後面的10的次方數
		
		double double1 = 1234567890;
		System.out.println("double1 :"+double1);
		//輸出的值同float的計算方法
		//數值計算出來精準度會有落差
		
		double v1 = 1.23e3;
		System.out.println("v1 : " +v1);
		//位階double>float
		
		double x = int2;
		System.out.println("x:"+x);
		
		System.out.println("==========");
		
		
		//其他特殊型態
		
		boolean boolean1 = true;//是否，真假，對錯代表意思
		System.out.println("boolean1 :"+ boolean1);
		
		char ch1 = 'A';
		System.out.println("ch1 :"+ch1);
		
		char ch2 = '我';//單個字元
		System.out.println("ch2 :"+ch2);
		
		String s1 = "JAVA";//兩個字元以上中文英文字串都可以
		System.out.println("s1 :"+s1);
		
		String s2 = "文字串";
		System.out.println("s2 :"+s2);
		
		String s3 = "謝謝\n你好嗎";
		System.out.println("s3 :"+s3);
		//  \n代表在字串中間使用時是代表直接換行
		
		String s4 = "謝謝\\你";
		System.out.println("s4 :"+s4);
		//  字串中間+ \\代表顯示 \的意思
		
		String s5 = "\"你好\"";
		System.out.println("s5 :"+s5);
		//在字串的前後加上 \"代表顯示  "  的意思
		
		String s6 = "\'我\'";
		System.out.println("s6 :"+s6);
		
		
		String s7 = "\\我\\";
		System.out.println("s7 :"+s7);
		
		String s8 = "\t我";
		System.out.println("s8 :"+s8);
		
		String s9 = "你 \f我";//???????
		System.out.println("s9 :"+s9);
		
		String s10 = "\r我";
		System.out.println("s10:"+s10);
		// \r代表enter鍵換行的意思
		
		Scanner scanner = new Scanner(System.in);
		
		String aa = scanner.nextLine();
		System.out.println("aa : "+aa );
		
		Test_method method = new Test_method();
		System.out.println(method.test(12, 23));
//		System.out.println(test(2,3));
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	
	
		
	}
	
	

}
