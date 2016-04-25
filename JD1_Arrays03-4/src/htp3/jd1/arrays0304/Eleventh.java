package htp3.jd1.arrays0304;

import java.util.Scanner;

public class Eleventh {
	public static void main(String[] args) {
		int n = enterN();
		int[][] mas = new int[n][n];
		masFromMatrix(mas);
		printMas(mas);
	}

	public static int enterN() {
		int n = 0;
		System.out.print("Введите размерность массива: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (!(sc.hasNextInt())) {
				System.out.println("Введенное значение не соответствует заданному типу.");
				System.out.print("Попробуйте еще раз. Введите x: ");
			} else {
				n = sc.nextInt();
				if (n% 2 == 0) {
					break;
				} else {
					System.out.println("Вы ввели нечетное число.");
					System.out.print("Попробуйте еще раз. Введите размерность массива: ");
				}
			}
		}
		return n;
	}

	public static void masFromMatrix(int[][] mas) {
		for (int i = 0; i < mas.length; i = i + 2) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = j + 1;
			}
		}
		for (int i = 1; i < mas.length; i = i + 2) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = mas.length - j;
			}
		}
	}

	public static void printMas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
