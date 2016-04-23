package htp3.jd1.introduction01;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		findDesc(enterA(), enterB(), enterC());
	}

	public static double enterA() {
		double a = 0;
		System.out.print("Введите a: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите a: ");
			}
		}
		return a;
	}

	public static double enterB() {
		double b = 0;
		System.out.print("Введите b: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите b: ");
			}
		}
		return b;
	}

	public static double enterC() {
		double c = 0;
		System.out.print("Введите c: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите c: ");
			}
		}
		return c;
	}

	public static double findDesc(double a, double b, double c) {
		double x = 0;
		double y = 0;
		double d = Math.pow(b, 2) - 4 * a * c;
		if (d > 0) {
			x = (Math.sqrt(d) / 2 * a) - b;
			System.out.println("Корень x = " + x);
			y = -b - (Math.sqrt(d) / 2 * a);
			System.out.println("Корень y = " + y);
		} else if (d == 0) {
			x = y = -b / (2 * a);
			System.out.println("Корень x = " + x);
		} else {
			System.out.println("Дискриминант меньше 0, корней нет.");
		}
		return x;

	}
}
