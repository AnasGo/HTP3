package htp3.jd1.arrays0304;

import java.util.*;

public class First {
	public static void main(String[] args) {
		int mas[] = new int[10];
		enterMasFromConsole(mas);
		printMas(mas);
		System.out.println("------------------------------------");
		printMas(findMasNull(mas));

	}

	public static void enterMasFromConsole(int[] mas) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=>");
			mas[i] = sc.nextInt();
		}
	}

	public static void enterMasFromRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(2);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Num " + i + ": " + mas[i]);
		}
	}

	public static int[] findMasNull(int[] mas) {
		int c = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				c++;
			}
		}
		int[] masNull = new int[c];
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				masNull[j] = i;
				j++;
			}
		}
		if (j == 0) {
			System.out.println("Нулей в массиве нет.");
		}
		return masNull;
	}
}
