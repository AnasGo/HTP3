package htp3.jd1.introduction01;

import java.util.*;

public class First {

	public static void main(String[] args) {
		printResult((findY(enterX())));
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

	public static double findY(double x) {
		double y = x - (Math.pow(x, 3) / 3) + (Math.pow(x, 5) / 5);
		return y;
	}

	public static void printResult(double y) {
		System.out.println("Значение выражения = " + y);
	}
}
