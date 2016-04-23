package htp3.jd1.introduction01;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		findP(enterX());
	}

	public static int enterX() {
		int x = 0;
		System.out.print("Введите x: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (!sc.hasNextInt()) {
				System.out.println("Введенное значение не соответствует заданному типу.");
				System.out.print("Попробуйте еще раз. Введите x: ");
			} else {
				x = sc.nextInt();
				if (x / 10000 == 0) {
					break;
				} else {
					System.out.println("Вы ввели не четырехзначное число.");
					System.out.print("Попробуйте еще раз. Введите x: ");
				}
			}
		}
		return x;
	}

	public static int findP(int x) {
		int p = 0;
		if (!(x % 10 == 0 || x % 100 == 0 || x % 1000 == 0)) {
			int a = x / 1000;
			int b = x % 1000 / 100;
			int c = x % 100 / 10;
			int d = x % 10;
			p = c * d * a * b;
		}
		System.out.println("Произведение чисел = " + p);
		return p;
	}
}
