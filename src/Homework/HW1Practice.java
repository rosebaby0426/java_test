package Homework;

public class HW1Practice {

	public static void main(String[] args) {
		System.out.println("第一題：計算12,6這兩個數值得和與積");
		int a=12, b=6;
		
		System.out.println("和=" + (a+b));
		System.out.println("積=" + a*b);
///////////////////////////////////////////////////////////////////////
		System.out.println("===========================================");
		System.out.println("第二題：200顆蛋共幾打幾顆蛋?(一打12顆)");
		int egg = 200;
		int dozzen = 12;
		
		System.out.print("共" + egg/dozzen + "打");
		System.out.println(egg%dozzen + "顆蛋");
		
//////////////////////////////////////////////////////////////////////
		System.out.println("===========================================");
		System.out.println("第三題：計算256559秒為多少天、多少小時、多少分、多少秒");
		
		int day=0, hr=0, min=0 , sec=0;
		//1day=24hr , 1hr=60min , 1min=60sec
		day = 256559/60/60/24;//直接取相除後的整數
		hr = 256559/60/60%24;//取相除後的餘數(小時)
		min = 256559/60%60;//取相除後的餘數(分鐘)
		sec = 256559%60;//取相除後的餘數(秒數)
		System.out.println("256559秒為" + day + "天" + hr + "小時" + min + "分" + sec + "秒");
///////////////////////////////////////////////////////////////////////
		System.out.println("===========================================");
		System.out.println("第四題：請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長");
		
		double circleArea = 0 , circlePerimeter = 0;
		int radius = 5;
		final double PI = 3.1415;
		
		circleArea = radius*radius* PI;
		circlePerimeter = radius*2*PI;
		System.out.println("圓面積=" + circleArea );
		System.out.println("圓周長=" + circlePerimeter);
///////////////////////////////////////////////////////////////////////
		System.out.println("===========================================");	
		System.out.println("第五題：某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請計算10年後，本金加利息共多少錢?");
		
		double money = 150 , interestRate = 0.02 ;
		
		for(int y=0 ; y<10 ; y++) {
			money = money * (interestRate+1);
		}
		System.out.println("10年後存款本金+利息共" + money + "萬元");
///////////////////////////////////////////////////////////////////////
		System.out.println("===========================================");	
		System.out.println("第六題：請寫一支程式利用System.out.println()印出以下三個運算式結果");
		System.out.println("5+5");
		System.out.println("5+'5'");
		System.out.println("5+\"5\"");
		System.out.println("並用註解說明答案 的產生原因");
	
		System.out.println(5+5);//數字的相加
		System.out.println(5+'5');//數字5跟ASCII的5相加
		System.out.println(5+"5");//數字5跟字串5串接在一起
	}

}
