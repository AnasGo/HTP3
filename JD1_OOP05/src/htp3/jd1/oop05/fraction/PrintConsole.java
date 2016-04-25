package htp3.jd1.oop05.fraction;

import java.util.List;

class PrintConsole {

	public static void print(CommonFraction obj) {
		System.out.println("Дробь " + obj.getNumerator() + "/" + obj.getDenominator());
	}

	public static void print(CommonFraction[] mas) {
		for (int i = 0; i < mas.length; i++) {
			print(mas[i]);
		}
	}

	public static void print(List<CommonFraction> list) {
		for (int i = 0; i < list.size(); i++) {
			print(list.get(i));
		}
	}
}