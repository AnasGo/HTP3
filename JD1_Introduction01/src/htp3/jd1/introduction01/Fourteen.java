package htp3.jd1.introduction01;

	import java.util.*;

	public class Fourteen {

		public static void main(String[] args) {
			monthX(enterM());
		}

		public static int enterM() {
			int m = 0;
			while (true) {
				System.out.print("Введите номер месяца: ");
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				if (sc.hasNextInt()) {
					m = sc.nextInt();
					if (m > 12 || m <= 0) {
						System.out.println("Такого месяца не существует. Попробуйте еще раз.");
					} else {
						break;
					}
				} else {
					System.out.println("Введенные данные не соответствуют числовому типу. Попробуйте еще раз.");
				}
			}
			return m;
		}

		public static void monthX(int m) {
			switch (m) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("Jule");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			}
		}
	}

