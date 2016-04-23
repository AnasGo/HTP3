package htp3.jd1.introduction01;

import java.util.Scanner;

public class TwentyFirst {
	public static void main(String[] args) {
		findY(enterA(), enterB(), enterH(), enterX());
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
				System.out.println("Введенные данные не соответствуют числовому типу.");
				System.out.print("Попробуйте еще раз. Введите x:");
			}
		}
		return x;
	}

	public static double enterA() {
		double a = 0;
		System.out.print("Введите a:");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенные данные не соответствуют числовому типу.");
				System.out.print("Попробуйте еще раз. Введите a:");
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
				System.out.println("Введенные данные не соответствуют числовому типу.");
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
				System.out.println("Введенные данные не соответствуют числовому типу.");
				System.out.print("Попробуйте еще раз. Введите шаг:");
			}
		}
		return h;
	}

	public static double findY(double a, double b, double h, double x) {
		double y = 0;
		if ((a < b && (x < a || x > b)) || (a > b && (x > a || x < b))) {
			System.out.println("X лежит вне значений a-b");
		} else if (x == 0) {
			y = 0;
			System.out.println("x= " + x + " y= " + y);
		} else if (b > a) {
			for (a = x; x <= b; x = x + h) {
				y = x * Math.sin(x);
				System.out.println("x= " + x + " y= " + y);
			}
		} else if (a > b) {
			for (b = x; x <= a; x = x + h) {
				y = x * Math.sin(x);
				System.out.println("x= " + x + " y= " + y);
			}
		}
		return y;
	}
}
