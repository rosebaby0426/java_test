package Practice;

public class TestStudent {

	public static void main(String[] args) {
		
		Student david = new Student();
		Student john = new Student();
		Student may = new Student();
		
		String x = david.play(2);
//		david.study(3);
		System.out.println(david.score);
		david.outclass("");
		System.out.println(x);
//		john.play(1);
//		john.study(4);
//		System.out.println(john.score);
		
//		may.study(5);
//		System.out.println(may.score);
	}
}
