package htp3.jd1.arrays0304;

import java.util.Random;
import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		int[] mas = new int[10];
		enterMasFromRandom(mas);
		printMas(mas);
		printMas(reenterMas(mas));
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
			mas[i] = rand.nextInt(50);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println(" ");
	}

	public static int[] reenterMas(int[] mas) {
		for (int i = 0; i < mas.length - 1 - i; i++) {
			int m = mas[i];
			mas[i] = mas[mas.length - 1 - i];
			mas[mas.length - 1 - i] = m;
		}
		return mas;
	}
}
