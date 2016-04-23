package htp3.jd1.introduction01;

import java.util.*;

public class Seventeenth {

	public static void main(String[] args) {
		checkN(enterN());
	}

	public static int enterN() {
		int n = 0;
		System.out.print("Введите N: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (!(sc.hasNextInt())) {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите x: ");
			} else {
				n = sc.nextInt();
				if (!(n / 10 >= 10 || n / 10 == 0)) {
					break;
				} else {
					System.out.println("Вы ввели не двухзначное число.");
					System.out.print("Попробуйте еще раз. Введите x: ");
				}
			}
		}
		return n;
	}

	public static void checkN(int n) {
		if (n % 2 == 0) {
			System.out.println("Четное");
		} else {
			System.out.println("Нечетное");
		}
	}
}
