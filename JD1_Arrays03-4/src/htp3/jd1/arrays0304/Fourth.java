package htp3.jd1.arrays0304;

import java.util.*;

public class Fourth {

	public static void main(String[] args) {
		int[] mas = new int[10];
		enterMasFromConsole(mas);
		System.out.println("-----------------------------------------");
		printMas(findMas(mas));
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
			System.out.println("Num " + i + ": " + mas[i]);
		}
	}

	public static int[] findMas(int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (!(mas[i] == 0)) {
				count++;
			}
		}
		int[] massive = new int[count];
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (!(mas[i] == 0)) {
				massive[j] = mas[i];
				j++;
			}
		}
		return massive;
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Num " + i + ": " + mas[i]);
		}
	}
}
