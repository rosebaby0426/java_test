package Homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class HW7_3CallOutCatDog {

	public static void main(String[] args) throws Exception {
		File aniFile = new File("C:\\data\\Object.dat");

		FileInputStream fis = new FileInputStream(aniFile);
		ObjectInputStream ois = new ObjectInputStream(fis);

		((Cat) ois.readObject()).speak();
		((Cat) ois.readObject()).speak();
		((Dog) ois.readObject()).speak();
		((Dog) ois.readObject()).speak();

		ois.close();
		fis.close();
	}

}
