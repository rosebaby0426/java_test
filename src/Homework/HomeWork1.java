package Homework;

public class HomeWork1 {
	public static void main(String[] args) {
		
		System.out.println("第一題：計算12,6這兩個數值得和與積");
		int a = 12 , b = 6 ;
		System.out.println("a+b = " + (a+b));
		System.out.println("a*b = " + a*b);
		System.out.println("==============================");
		
		System.out.println("第二題：200顆蛋共幾打幾顆蛋?(一打12顆)");
		System.out.println("dozen = " + 200/12 + '打');
		//共16打
		System.out.println("egg = " + 200%12 + '顆');
		//8顆蛋
		System.out.println("==============================");
		
		System.out.println("第三題：計算256559秒為多少天、多少小時、多少分、多少秒");
		System.out.println("sec = " + 256559%60);
		System.out.println("min = " + 256559/60%60);
		System.out.println("hr = " + 256559/60/60%24);
		System.out.println("day = " + 256559/60/60/24);
		System.out.println("==============================");
		
		System.out.println("第四題：請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長");
		final double PI = 3.1415; int c = 5;
		System.out.println("圓面積 = " + c*c*PI);
		System.out.println("圓周長 = " + c*2*PI);
		System.out.println("==============================");
		
		System.out.println("第五題：某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請計算10年後，本金加利息共多少錢?");
		double money = 1500000.0;
		for (int i = 1 ; i <=10 ; i++) {
			money = money * Math.pow(1.02, 10);
		}
		System.out.println(money + "元");
		System.out.println("==============================");		
		
		/*第六題：請寫一支程式利用System.out.println()印出以下三個運算式結果
			5+5
			5+'5'
			5+"5"
			並用註解說明答案 的產生原因
		*/
		
		System.out.println(5+5);//數字的5+5
		System.out.println(5+'5');//數字5+ Unicode的53
		System.out.println(5+"5");//數字5+字串的5
		
	}
}
