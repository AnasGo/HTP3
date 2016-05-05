package htp3.jd1.oop5.algo;

import java.util.Random;

public class SortBubble {
	// отсортировывает равные элементы, является устойчивой 
	public static void main(String[] args) {
		int[] mas = new int[50];
		enterMasFromRandom(mas);
		bubbleSort(mas);
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

	public static int[] bubbleSort(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = mas.length - 1; j > i; j--) {
				if (mas[j] < mas[j - 1]) {
					int big = mas[j - 1];
					mas[j - 1] = mas[j];
					mas[j] = big;
				}
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
