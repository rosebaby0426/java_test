package Practice;

public interface WeightTable {
	// 抽象的方法
	//很多物件都可能會有的相同動作，但是不見的會有血緣關西
	//所以把"相同方法"另外抽取出來另外寫
	//在製作物件的時候，遇到類似的方法就可以繼承方法並加以擴充改寫成各自物件所需要的方法
	//達到重複使用的功能，也可以避免同樣的方法重複寫

	void getWeightMethod();
	
}
