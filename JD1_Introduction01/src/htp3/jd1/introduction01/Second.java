package htp3.jd1.introduction01;

import java.util.Scanner;

public class Second extends First {

	public static void main(String[] args) {
		printResult((findZ(enterX(), enterY())));

	}

	public static double enterY() {
		double y = 0;
		System.out.print("Введите y: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				y = sc.nextDouble();
				break;
			} else {
				System.out.println("Введенное значение не соответствует числовому типу.");
				System.out.print("Попробуйте еще раз. Введите y: ");
			}
		}
		return y;
	}

	public static double findZ(double x, double y) {
		double a = 0;
		double f = 1 + (Math.pow(x, 2) * Math.pow(y, 2));
		if (f == 0) {
			System.out.println("Знаменатель равен 0.");
		} else {
			a = 2 + Math.abs(x - (2 * x / f));
		}
		double b = Math.sin(x + y);
		double c = 1 + Math.pow(b, 2);
		double z = c / a;
		return z;
	}
}