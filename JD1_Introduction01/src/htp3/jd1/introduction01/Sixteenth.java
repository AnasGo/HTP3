package htp3.jd1.introduction01;

import java.util.Scanner;

public class Sixteenth {

	public static void main(String[] args) {
		markX(enterX());
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
				if (x / 1000 == 0 && x % 1000 >= 100) {
					break;
				} else {
					System.out.println("Вы ввели не трехзначное число.");
					System.out.print("Попробуйте еще раз. Введите x: ");
				}
			}
		}
		return x;
	}

	public static boolean markX(int x) {
		boolean mark = true;
		double p = Math.sqrt(x);
		int a = x / 100;
		int b = x % 10;
		int c = b / 10;
		double d = Math.pow((a + b + c), 3);
		if (!(d == p)) {
			mark = false;
		}
		System.out.println(mark);
		return mark;
	}
}
