package htp3.jd1.arrays0304;

import java.util.Random;
import java.util.Scanner;

public class ArraysEnterConsoleRandom {
	public static void enterMasFromConsole(int[][] mas) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print("mas[" + i + "] " + "[" + j + "] => ");
				mas[i][j] = sc.nextInt();
			}
		}
	}

	public static void enterMasFromRandom(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt();
				System.out.print("mas [" + i + "] " + "[" + j + "] => " + mas[i][j]);
			}
		}
	}
}
