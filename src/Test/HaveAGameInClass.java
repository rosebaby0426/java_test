package Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HaveAGameInClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("D:\\CA106\\ThreePeopleADay.dat");
		File Parent = new File(file.getParent());
//		int[] wantTopickOut;
//		int howMuch = 0;

		if (!Parent.exists()) {
			Parent.mkdirs();
			if (!Parent.isDirectory()) {
				new File(file.getParent() + "TheOtherOne").mkdirs();
			}
		}
		// 前置作業

		Scanner scanner = new Scanner(System.in);
		String instruction, doubleChack, newOneOrNot;
		List<Integer> AllNumber;
		System.out.println("如不讀取檔案請輸入NNN");
		newOneOrNot = scanner.nextLine();
		if (newOneOrNot.equals("NNN")) {
			AllNumber = newANewOne();
		} else {
			AllNumber = readData(file);
			speak(AllNumber);
		} // 讀檔與否

		// 23,31,34
		// 2,3,6,13

		qq: while (true) {
			System.out.println("choise:選出同學，init:物件初始化，pickOut:剔除元素，add:增加同學，save:儲存");
			instruction = scanner.nextLine();
			if (instruction.equals("init") || instruction.equals("pickOut")) {
				System.out.println("確認指令請輸入YYY");
				doubleChack = scanner.nextLine();
				if (doubleChack.equals("YYY")) {
					if (instruction.equals("init")) {
						System.out.println("請輸入同學數量");
						AllNumber = initialization(AllNumber, scanner);
						speak(AllNumber);
						continue qq;
					} else {
						AllNumber = pickOut(AllNumber, scanner);
						speak(AllNumber);
						continue qq;
					}

				} else {
					continue qq;
				}

			} // 處理 init與pickOut)
			else if (instruction.equals("choise")) {
				AllNumber = choise(AllNumber, scanner);
				speak(AllNumber);
				continue qq;
			} else if (instruction.equals("add")) {
				AllNumber = add(AllNumber, scanner);
				speak(AllNumber);
				continue qq;
			} else {
				if (instruction.equals("save")) {
					saveData(file, AllNumber);
					if (scanner != null) {
						scanner.close();
					}
					break;
				} // 處理存檔
			}
		}

	}

	static List<Integer> newANewOne() {
		return new LinkedList<Integer>();
	}

	static List<Integer> readData(File file) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		List<Integer> AllNumber = (List<Integer>) ois.readObject();
		System.out.println("讀取完成");

		ois.close();
		bis.close();
		fis.close();
		return AllNumber;
	}

	static void saveData(File file, List<Integer> AllNumber) throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(AllNumber);
		oos.close();
		bos.close();
		fos.close();
	}

	static void speak(List<Integer> AllNumber) {
		System.out.println("toString()=" + AllNumber);
		System.out.println("元素個數=" + AllNumber.size());

//		Iterator<Integer> Integer = AllNumber.iterator();
//		while (Integer.hasNext())
//			System.out.println(Integer.next());
	}

	static List<Integer> initialization(List<Integer> AllNumber, Scanner scanner) {
		int howMuch = 0;

		while (true) {
			if (scanner.hasNextInt()) {
				howMuch = scanner.nextInt();
				break;
			} else {
				System.out.println("輸入錯誤請重新輸入");
			}
			;
		}

		for (int i = 1; i < (howMuch + 1); i++) {
			AllNumber.add(i);
		}
		return AllNumber;
	}

	static List<Integer> pickOut(List<Integer> AllNumber, Scanner scanner) {
		int howMuch = 0;
		int[] wantTopickOut;
		System.out.println("請輸入欲移除元素數量");
		while (true) {
			if (scanner.hasNextInt()) {
				howMuch = scanner.nextInt();
				break;
			}
			;
		}
		wantTopickOut = new int[howMuch];
		for (int i = 0; i < howMuch; i++) {
			System.out.println("請輸入欲移除元素");
			if (scanner.hasNextInt()) {
				wantTopickOut[i] = scanner.nextInt();
			} else {
				System.out.println("輸入錯誤請重新輸入");
				i--;
			}
		}
		for (int i = 0; i < wantTopickOut.length; i++) {
			AllNumber.remove(new Integer(wantTopickOut[i]));
		}
		return AllNumber;
	}

	static List<Integer> add(List<Integer> AllNumber, Scanner scanner) {
		int howMuch = 0;
		int[] wantToAdd;
		System.out.println("請輸入欲增加元素數量");
		while (true) {
			if (scanner.hasNextInt()) {
				howMuch = scanner.nextInt();
				break;
			}
			;
		}
		wantToAdd = new int[howMuch];
		for (int i = 0; i < howMuch; i++) {
			System.out.println("請輸入欲增加元素");
			if (scanner.hasNextInt()) {
				wantToAdd[i] = scanner.nextInt();
			} else {
				System.out.println("輸入錯誤請重新輸入");
				i--;
			}
		}
		for (int i = 0; i < wantToAdd.length; i++) {
			AllNumber.add(new Integer(wantToAdd[i]));
		}
		Collections.sort(AllNumber);
		return AllNumber;
	}

	static List<Integer> choise(List<Integer> AllNumber, Scanner scanner) {
		Set<Integer> set = new HashSet<Integer>();
		int[] people;
		int quantity, the1;

		System.out.println("輸入欲選出數量");
		while (true) {
			if (scanner.hasNext()) {
				quantity = scanner.nextInt();
				break;
			}
			System.out.println("輸入有誤，請重新輸入");
		}
		people = new int[quantity];
		for (int i = 0; i < quantity; i = set.size()) {
			the1 = (int) (Math.random() * 39 + 1);
			if (AllNumber.contains(new Integer(the1))) {
				set.add(the1);
			}
		}

		Iterator<Integer> objs = set.iterator();

		while (objs.hasNext()) {
			System.out.println(the1 = objs.next());
			AllNumber.remove(new Integer(the1));
		}
		// 未將set資料轉入陣列

		return AllNumber;
	}
}
