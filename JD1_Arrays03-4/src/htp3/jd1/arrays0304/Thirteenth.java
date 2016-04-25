package htp3.jd1.arrays0304;

import java.util.Scanner;

public class Thirteenth extends Eleventh {
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
				break;
			}
		}
		return n;
	}

	public static void masFromMatrix(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = mas[i].length - 1; j >= 0; j--) {
				if (j == mas[i].length - 1 - i) {
					mas[i][j] = 1;
				}
			}
		}
	}
}
