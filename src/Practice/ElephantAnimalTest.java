package Practice;

public class ElephantAnimalTest {

	public static void main(String[] args) {
		
		AnimalSet ani1 = new AnimalSet(3,8.0f);
		Elephant baby = new Elephant(8,1200.0f,"elep1");

		ani1.speak();//呼叫AnimalSet 跟 Elephant 的speak方法
		baby.speak();//呼叫AnimalSet 跟 Elephant 的speak方法
		
	}

}
