package htp3.jd1.introduction01;

import java.util.Scanner;

public class NinthTenth {

	public static void main(String[] args) {
		checkX(enterX(), enterN(), enterM());

	}

	public static double enterM() {
		double m = 0;
		System.out.print("Введите m: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				m = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите m: ");
			}
		}
		return m;
	}

	public static double enterN() {
		double n = 0;
		System.out.print("Введите n: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				n = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите n: ");
			}
		}
		return n;
	}

	public static double enterX() {
		double x = 0;
		System.out.print("Введите x: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				x = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите x: ");
			}
		}
		return x;
	}

	public static boolean checkX(double x, double n, double m) {
		boolean a = true;
		if (m >= n) {
			a = false;
			System.out.println("Плоскость не существует.");
		} else if (x > m && x <= n) {
			a = true;
		} else {
			a = false;
		}
		System.out.println(a);
		return a;
	}
}
