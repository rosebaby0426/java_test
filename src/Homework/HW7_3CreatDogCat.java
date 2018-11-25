package Homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class HW7_3CreatDogCat {

	public static void main(String[] args) throws Exception {

		File aniFile = new File("C:\\data\\Object.dat");
		File dic = new File(aniFile.getParent());

		if (dic.exists() == false) {
			dic.mkdirs();
		}

		if (aniFile.exists() == false) {
			aniFile.createNewFile();
		}

		Cat c1 = new Cat("Kitty");
		Cat c2 = new Cat("Mini");
		Dog d1 = new Dog("Lifu");
		Dog d2 = new Dog("Dudu");

		FileOutputStream fos = new FileOutputStream(aniFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(c1);
		oos.writeObject(c2);
		oos.writeObject(d1);
		oos.writeObject(d2);

//		oos.flush();
		oos.close();
		fos.close();

	}

}
