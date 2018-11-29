package Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HW7_1 {

	public static void main(String[] args) {
		int i, count = 0, count1 = 0;
		String str;
		try {
			// 因為檔案是中文字檔，所以用Reader來讀取
			FileReader fr = new FileReader("C:\\CA106_Workspace\\HW\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((i = br.read()) != -1) {
				System.out.print((char) i);
				count++;
				System.out.flush();
			}
			System.out.println();
			System.out.println(count);
//
//			while ((str = br.readLine()) != null) {
////				System.out.println(str);
//				count1++;
//
//				System.out.println(count1);
//				System.out.flush();
//
//			}

			br.close();
			fr.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
