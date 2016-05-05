package htp3.jd1.oop5.algo;

import java.util.Random;

public class SortSelect {
	// в большинстве случаев будет работать некорректно, так как является устойчивой и не меняет равные элементы
	public static void main(String[] args) {
		int[] mas = new int[50];
		enterMasFromRandom(mas);
		selectSort(mas);
		System.out.println("--------------------------------------------------------");
		printMas(mas);
	}

	public static int[] enterMasFromRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(5);
			System.out.print(" " + mas[i]);
		}
		System.out.println("");
		return mas;
	}

	public static int[] selectSort(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[j] < mas[minIndex]) {
					minIndex = j;
				}
				int temp = mas[i];
				mas[i] = mas[minIndex];
				mas[minIndex] = temp;
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