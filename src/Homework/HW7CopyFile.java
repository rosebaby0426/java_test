package Homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HW7CopyFile {

	public void copycopy(File copyin, File copyout) throws Exception {
		// 複製檔案方法，把File當成參數傳入
		FileInputStream fis = new FileInputStream(copyin);
		FileOutputStream fos = new FileOutputStream(copyout);
		int i = 0;

		if (copyout.exists() == false) {
			copyout.createNewFile();
		}

		while ((i = fis.read()) != -1) {
			fos.write(i);
			System.out.flush();
		}

		fis.close();
		fos.close();
	}

	public static void main(String[] args) throws Exception {
		// 將已存在檔案A複製到另一個存在檔案B裡
		File copy1 = new File("copytest1.txt");
		File copy2 = new File("copytest2.txt");

		HW7CopyFile hf = new HW7CopyFile();
		hf.copycopy(copy1, copy2);

	}

}
