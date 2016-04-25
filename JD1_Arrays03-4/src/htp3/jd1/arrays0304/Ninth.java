package htp3.jd1.arrays0304;

import java.util.Scanner;

public class Ninth {
	public static void main(String[] args) {
		int[] mas = new int[6];
		int[] arr = new int[5];
		enterMasFromConsole(mas);
		enterMasFromConsole(arr);
		printMas(compareArrays(mas, arr));

	}

	public static void enterMasFromConsole(int[] mas) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=> ");
			mas[i] = sc.nextInt();

		}
	}

	public static int[] compareArrays(int[] mas, int[] array) {
		int[] comparr = new int[mas.length + array.length];
		for (int j = 0; j < mas.length; j++) {
			comparr[j] = mas[j];
		}
		int i = mas.length;
		for (int j = 0; j < array.length; j++) {
			comparr[i] = array[j];
			i++;
		}
		for (int q = 0; q < comparr.length; q++) {
			int minIndex = q;
			for (int j = q + 1; j < comparr.length; j++) {
				if (comparr[j] < comparr[minIndex]) {
					minIndex = j;
				}
			}
			int m = comparr[q];
			comparr[q] = comparr[minIndex];
			comparr[minIndex] = m;
		}
		return comparr;
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}
