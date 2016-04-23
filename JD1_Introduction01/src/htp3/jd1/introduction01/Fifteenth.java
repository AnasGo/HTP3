package htp3.jd1.introduction01;

import java.util.Scanner;

public class Fifteenth extends Fourteen {
		public static void main(String[] args) {
			getValue(enterM(), enterY());
		}

		public static int getValue(int m, int y) {
			int d = 0;
			if (m == 2 && (y % 4 == 0 || y % 100 == 0)) {
				d = 29;
			} else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				d = 31;
			} else if (m == 2) {
				d = 28;
			} else {
				d = 30;
			}
			System.out.println("Количество дней - " + d);
			return d;
		}

		public static int enterY() {
			int y = 0;
			while (true) {
				System.out.print("Введите номер года: ");
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				if (sc.hasNextInt()) {
					y = sc.nextInt();
					if (y == 0) {
						System.out.println("Такого года не существует. Попробуйте еще раз.");
					} else {
						break;
					}
				} else {
					System.out.println("Введенные данные не соответствуют числовому типу. Попробуйте еще раз.");
				}
			}
			return y;
		}
	}


