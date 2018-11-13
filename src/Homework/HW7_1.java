package Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HW7_1 {

	public static void main(String[] args) {
		int i, count = 0;
		try {
			FileReader fr = new FileReader("C:\\CA106_Workspace\\HW\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((i = br.read()) != -1) {
				System.out.print((char) i);
				count++;
			}
			System.out.println();
			System.out.println(count);
			br.close();
			fr.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
