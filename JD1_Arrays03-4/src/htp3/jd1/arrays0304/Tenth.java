package htp3.jd1.arrays0304;

public class Tenth extends Ninth {
	public static void main(String[] args) {
		int[] p = new int[5];
		int[] q = new int[5];
		enterMasFromConsole(p);
		enterMasFromConsole(q);
		findMas(p, q);
		printMas(p);

	}

	public static int[] findMas(int[] p, int[] q) {
		// находим общий знаменатель
		int pr = 1;
		for (int i = 0; i < q.length; i++) {
			pr = pr * q[i];
		}
		System.out.println("Знаменатель:" + pr);
		// приводим к общему знаменателю числители
		for (int i = 0; i < p.length; i++) {
			p[i] = p[i] * pr / q[i];
		}
		// сортируем массив
		for (int i = 0; i < p.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < p.length; j++) {
				if (p[j] < p[minIndex]) {
					minIndex = j;
				}
			}
			int m = p[i];
			p[i] = p[minIndex];
			p[minIndex] = m;
		}
		return p;
	}
}
