package Practice;

public class AnimalSet {
	//這個"動物物件"內含的屬性，為了不讓別人隨意更動初始資料，所以屬性設為private
	private int age;
	private float weight;
	
	
	public AnimalSet() {//預設建構子(如果在沒有任何參數下所使用的建構子)
	}
	
	//這個"動物物件"會因為輸入的參數不同產生不同的"動物"(方便創建新的動物，所以會擁有自己的建構子)
	public AnimalSet(int age, float weight) {
		this.age = age;
		this.weight = weight; 
	}
	
	
	//這個"動物物件"擁有的行為方法
	//為了能取得這個物件裡的資料，所以設定公開的方法來得到資料
	public void speak() {
		System.out.println("年紀" + age + "歲");
		System.out.println("體重" + weight + "公斤");
	}
	
	//為了方便取用動物的這個物件的屬性，透過 "這個動物物件的方法 " 來存入物件資料
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	//利用方法來 "取得" 物件的真正資料
	public int getAge() {
		return age;
	} 
	
	public float getWeight() {
		return weight;
	}
	
	
	
}
