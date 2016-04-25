package htp3.jd1.arrays0304;
import java.util.*;

public class Eighth {
	public static void main(String[] args) {
		int[] mas = new int[20];
		int[] massive = new int[5];
		enterMasFromRandom(mas);
		enterMasFromRandom(massive);
		printMas(joinMasK(mas, massive, enterK()));
	}

	public static void enterMasFromRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(20);
			System.out.print(mas[i] + " ");
		}
		System.out.println(" ");
	}

	public static void enterMasFromConsole(int[] mas) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=> ");
			mas[i] = sc.nextInt();
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int enterK() {
		int k = 0;
		System.out.print("Введите k: ");
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				k = sc.nextInt();
				break;
			} else {
				System.out.println("Введенное значение не соответствуют числовому типу.");
				System.out.print("Попробуйте еще раз. Введите k: ");
			}
		}
		return k;
	}

	public static int[] joinMasK(int[] mas, int[] massive, int k) {
		int[] joinmas = new int[mas.length + massive.length];
		int g = 0;
		for (int j = 0; j <= k; j++) {
			joinmas[g] = mas[j];
			g++;
		}
		g = k + 1;
		for (int j = 0; j < massive.length; j++) {
			joinmas[g] = massive[j];
			g++;
		}

		g = k + 1 + massive.length;
		for (int j = k + 1; j < mas.length; j++) {
			joinmas[g] = mas[j];
			g++;
		}
		return joinmas;
	}
}

