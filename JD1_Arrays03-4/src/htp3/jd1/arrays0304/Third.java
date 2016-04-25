package htp3.jd1.arrays0304;

import java.util.*;

public class Third {
	public static void main(String[] args) {
		int[] mas = new int[10];
		enterMasFromConsole(mas);
		printMas(mas);
		findPercent(mas);
	}

	public static void enterMasFromConsole(int[] mas) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=> ");
			mas[i] = sc.nextInt();
		}
	}

	public static void enterMasFromRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt();
			System.out.println("mas[" + i + "]=> " + mas[i]);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Num " + i + ": " + mas[i]);
		}
	}

	public static double findPercent(int[] mas) {
		double count = 0;
		int m = mas.length;
		for (int i = 0; i < m; i++) {
			if (mas[i] % 2 == 0) {
				count++;
			}
		}
		double percent = (count / m) * 100;
		System.out.println(percent);
		return percent;
	}
}
