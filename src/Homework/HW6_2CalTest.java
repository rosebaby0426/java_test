package Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW6_2CalTest {

	public double powerXY(int x, int y) {
		double result = Math.pow(x, y);
		return result;
	}

	public static void main(String[] args) throws HW6_2CalException {

		boolean c = true;
		Scanner keyin = new Scanner(System.in);
		try {
			while (c) {

				try {
					HW6_2CalTest test = new HW6_2CalTest();
					double result = 0;
					System.out.println("請輸入x值");
					int x = keyin.nextInt();
					System.out.println("x值=" + x);
					System.out.println("請輸入y值");
					int y = keyin.nextInt();
					System.out.println("y值=" + y);

					if ((x == 0) && (y == 0)) {
						throw new HW6_2CalException("0的0次方沒有意義，請輸入正確數字");
					} else if (y < 0) {
						throw new HW6_2CalException("次方為負值，結果回傳不為整數，請重新輸入正確數字");

					} else {
						result = Math.pow(x, y);
						System.out.println("x的y次方=" + result);
						break;
					}

				} catch (HW6_2CalException msg1) {
					System.out.println(msg1.getMessage());
					keyin.next();
					continue;

				} catch (InputMismatchException msg) {
					System.out.println("輸入格式不正確，請重新輸入");
					keyin.next();
					continue;
				}
			}
		} finally {
			keyin.close();
		}

	}
}
