package htp3.jd1.arrays0304;

import java.util.Scanner;

public class Second {
	public static void main (String[] args){
		int[] mas = new int[10];
		enterMasFromConsole(mas);
		findSum(mas);
	}
	
	public static void enterMasFromConsole (int[] mas){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=> ");
			mas[i] = sc.nextInt();
		}
	}
	
	public static int findSum (int[] mas){
		int sum = 0;
		for (int i = 0; i< mas.length; i++){
			if (i == mas[i]){
				sum= sum+mas[i];
			}
		}
		System.out.println(sum);
		return sum;
	}
}
