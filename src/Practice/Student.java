package Practice;

public class Student {
	
	int score = 60;
	int height , weight ;
	String clothes ;

	public String play(int hours) {
		score -= hours;
		return "score";
	}
	
	public void study(int hours) {
		score += hours;
	}
	
	public void outclass(String x) {
		clothes = "便服";
	}
	
	public void inclass(String s) {
		clothes = "制服";		
	}
	
}
