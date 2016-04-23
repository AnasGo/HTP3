package htp3.jd1.introduction01;

import java.util.Scanner;

public class Twenth {

	public static void main(String[] args) {
		findY(enterX(), enterA(), enterB(), enterH());
	}

	public static double enterA() {
		double a = 0;
		System.out.print("Введите а:");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите у:");
			}
		}
		return a;
	}

	public static double enterB() {
		double b = 0;
		System.out.print("Введите b:");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите b:");
			}
		}
		return b;
	}

	public static double enterH() {
		double h = 0;
		System.out.print("Введите шаг:");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				h = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите шаг:");
			}
		}
		return h;
	}

	public static double enterX() {
		double x = 0;
		System.out.print("Введите x:");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				x = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите x:");
			}
		}
		return x;
	}

	public static double findY(double x, double a, double b, double h) {
		double y = 0;
		if ((b > a && (x < a || x > b)) || (b < a && (x > a || x < b))) {
			System.out.println("X лежит вне отрезка а-b");
		} else if (b > a) {
			for (a = x; x <= b; x = x + h) {
				y = Math.tan(x);
				System.out.println("x= " + x + " y= " + y);
			}
		} else {
			for (b = x; x <= a; x = x + h) {
				y = Math.tan(x);
				System.out.println("x= " + x + " y= " + y);
			}
		}
		return y;
	}
}
