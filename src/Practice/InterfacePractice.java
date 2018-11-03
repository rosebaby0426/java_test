package Practice;

public class InterfacePractice {

	public static void main(String[] args) {
		
		//我是GITHUB測試
		
		//介面也可以當成一種特殊的資料類型
		WeightTable[] wei = new WeightTable[3];
		
		wei[0] = new Dog("dudu",4.5);
		wei[1] = new Plane("戰鬥機",10000.0);
		wei[2] = new Powder("黃色粉末",50.0);
		
		for(int i=0 ; i<wei.length ; i++) {
			wei[i].getWeightMethod();
		}
		
		
		

	}

}
