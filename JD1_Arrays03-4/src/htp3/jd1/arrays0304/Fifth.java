package htp3.jd1.arrays0304;

import java.util.*;

public class Fifth {
	public static void main(String[] args) {
		String[] mas = new String[5];
		enterMasFromConsole(mas);
		printMas(mas);
		findDole(mas);
	}

	public static void enterMasFromConsole(String[] mas) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=> ");
			mas[i] = sc.next();
		}
	}
	public static void printMas(String[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Num " + i + ": " + mas[i]);
		}
	}

	public static void findDole(String[] mas) {
		double count1 = 0;
		double count2 = 0;
		double count3 = 0;
		double count4 = 0;
		double count5 = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].equals("олень")) {
				count1++;
			} else if (mas[i].equals("собака")) {
				count2++;
			} else if (mas[i].equals("лев")) {
				count3++;
			} else if (mas[i].equals("соня")) {
				count4++;
			} else if (mas[i].equals("саламандра")) {
				count5++;
			}
		}
		double j1 = (double)count1 / mas.length * 100;
		System.out.println("Доля ответа Пятнистый олень: " + j1);
		double j2 = (double)count2 / mas.length * 100;
		System.out.println("Доля ответа Енотовидная собака: " + j2);
		double j3 = (double)count3 / mas.length * 100;
		System.out.println("Доля ответа Морской лев: " + j3);
		double j4 = (double)count4 / mas.length * 100;
		System.out.println("Доля ответа Японская соня: " + j4);
		double j5 = (double)count5 / mas.length * 100;
		System.out.println("Доля ответа Саламандра: " + j5);
	}
}
