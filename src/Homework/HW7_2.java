package Homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class HW7_2 {

	public static void main(String[] args) throws Exception {

		File data = new File("Data.txt");

		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 1000 + 1);
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
				}
			}

		}

		// 因為要寫出字元，所以用writer
		// true-->append時，新增的資料會保留，會接在舊資料的後面
		// 如果沒有寫true，預設是false，表示新增資料時，新增的會覆蓋掉舊有的資料
		FileWriter fw = new FileWriter(data, true);
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 0; i < num.length; i++) {
			bw.write(num[i] + " ");

		}
		bw.newLine();// 加入新的一行

		bw.close();
		fw.close();
	}
}
