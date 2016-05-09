package htp3.jd1.practice06.tales;

import java.util.*;

public class Tales {
	
	
	public static void printTales(Collection<Tale> tales) {
		for (Tale tale : tales) {
			tale.printTale();
			System.out.println(" ");
		}
	}

	// генерация 50 сказок с рандомными рейтингами для проверки метода выбора
	// самой интересной сказки
	public static ArrayList<Tale> create50Tales() {
		ArrayList<Tale> tales = new ArrayList<Tale>(50);
		Random rand = new Random(50);
		for (Tale tale : tales) {
			tale = new Tale.TaleBuilder("Tale", "Shaherizada", 1502, "Content").setRate(rand.nextInt(100)).build();
			tales.add(tale);
		}
		return tales;

	}

	// выбор самой интересной сказки
	public Tale mostInterestTale(Collection<Tale> tales) {
		Tale mostInterest = new Tale.TaleBuilder(" ", " ", 0, " ").setRate(0).build();
		for (Tale tale : tales) {
			if (tale.getRate() > mostInterest.getRate()) {
				mostInterest = tale;
			}
		}
		return mostInterest;
	}

	// распечатка сказок, лимитированных по заданной длине печатных символов
	public void limitationLength(Collection<Tale> tales, int length) {
		for (Tale tale : tales) {
			if (tale.getContent().length() > length) {
				tale.printTale();
			}
		}
	}
}
