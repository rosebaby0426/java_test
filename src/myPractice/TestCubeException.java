package myPractice;

public class TestCubeException {

	public static void main(String[] args) {
		
		try {
			Cube c1 = new Cube(10);
			Cube c2 = new Cube();
			c2.setLength(-1);
			
		}catch(CubeException e) {
			System.out.println("請提供正確的邊長");
		}
	

	}

}
