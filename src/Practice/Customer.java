package Practice;

public class Customer {

	String id;
	String name;
	String add;
	String phone;
	String email;
	
	public void showInfo(){
		System.out.println("客戶編號:" + id);
		System.out.println("客戶姓名:" + name);
		System.out.println("地址:" + add);
		System.out.println("電話:" + phone);
		System.out.println("Email:" + email);

		
	}
	
	public static void main(String[] args) {

		Customer david = new Customer();
		david.id = "Q123456789";
		david.name = "David";
		david.add = "台中市大明街581巷415號";
		david.phone = "0939-123123";
		david.email = "david@sss.com.tw";
		
		david.showInfo();
	}
}
