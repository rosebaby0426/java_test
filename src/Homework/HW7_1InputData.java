package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class HW7_1InputData {

	public static void main(String[] args) throws Exception {
		HW7_1InputData inputData = new HW7_1InputData();

		inputData.readData();
		inputData.readLine();

	}

	public void readData() throws Exception {
		// 讀入資料
		File readData = new File("C:\\CA106_Workspace\\HW\\Sample.txt");
		FileReader fir = new FileReader(readData);// read專門處理文字資料
		BufferedReader bir = new BufferedReader(fir);
		int i = 0;
		int count = 0;// 計算共幾個字

		while ((i = bir.read()) != -1) {
			count++;
			System.out.flush();
		}

		System.out.println("共有" + readData.length() + "個位元組");
		System.out.println("共有" + count + "個字元");
		bir.close();
		fir.close();

	}

	public void readLine() throws Exception {

		File readData = new File("C:\\CA106_Workspace\\HW\\Sample.txt");
		FileReader fir = new FileReader(readData);
		BufferedReader bir = new BufferedReader(fir);
		String str = null;
		int count = 0;

		while ((str = bir.readLine()) != null) {// 讀出一行
			count++;
			System.out.flush();
		}
		System.out.println("共" + count + "列資料");

		bir.close();
		fir.close();

	}
}
