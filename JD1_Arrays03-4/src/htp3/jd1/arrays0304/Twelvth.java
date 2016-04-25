package htp3.jd1.arrays0304;

public class Twelvth extends Eleventh {
	public static void main(String[] args) {
		// определяем размерность матрицы, исп. метод род. класса 11
		int n = enterN();
		int[][] mas = new int[n][n];
		// заполняем матрицу по образцу, исп. метод masFromMatrix
		masFromMatrix(mas);
		// распечатка матрицы, исп. метод род. класса 11
		printMas(mas);
	}

	public static void masFromMatrix(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i][0] = 1;
			mas[i][mas.length - 1] = 1;
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 || i == mas.length - 1) {
					mas[i][j] = 1;
				}
			}
		}
	}
}
