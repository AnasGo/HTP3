package htp3.jd1.oop5.algo;

import java.util.Random;
import java.util.Scanner;

public class SortInsert {
	public static void main(String[] args) {
		int[] mas = new int[10];
		enterMasFromConsole(mas);
		insertSort(mas);
		System.out.println("--------------------------------------------------------");
		printMas(mas);
	}

	public static int[] enterMasFromRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(16);
			System.out.print(" " + mas[i]);
		}
		System.out.println("");
		return mas;
	}

	public static int[] enterMasFromConsole(int[] mas) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas [" + i + "] => ");
			mas[i] = sc.nextInt();
			System.out.println(" ");
		}
		return mas;
	}

	public static int[] insertSort(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			int x = mas[i];
			for (int j = i - 0; j >= 0 && mas[j] > x; j--) {
				mas[j + 1] = mas[j];
				mas[j + 1] = x;
			}
		}
		return mas;
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
	}
}
