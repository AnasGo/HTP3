package htp3.jd1.practice06.tales;

import java.util.*;

public class Testing {

	public static void main(String[] args) {
		/*
		 * Tale tale1 = new Tale.TaleBuilder("Tale", "Shaheri", 1503,
		 * "Content").setRate(65).build(); Tale tale2 = new
		 * Tale.TaleBuilder("Tale", "Shaheriz", 1503,
		 * "Content").setRate(5).build(); Tale tale3 = new
		 * Tale.TaleBuilder("Tale", "Shaheriza", 1503,
		 * "Content").setRate(15).build(); Tale tale4 = new
		 * Tale.TaleBuilder("Tale", "Shaherizad", 1503,
		 * "Content").setRate(12).build(); Tale tale5 = new
		 * Tale.TaleBuilder("Tale", "Shaherizada", 1503,
		 * "Content").setRate(11).build(); Tale tale6 = new
		 * Tale.TaleBuilder("Tale", "Shaher", 1504,
		 * "Content").setRate(4).build(); Tale tale7 = new
		 * Tale.TaleBuilder("Tale", "Shaher", 1505,
		 * "Content").setRate(88).build(); Tale tale8 = new
		 * Tale.TaleBuilder("Tale", "Shaher", 1506,
		 * "Content").setRate(94).build(); Tale tale9 = new
		 * Tale.TaleBuilder("Tale", "Shaher", 1507,
		 * "Content").setRate(99).build(); Tale tale10 = new
		 * Tale.TaleBuilder("Tale", "Shaher", 1508,
		 * "Content").setRate(50).build(); tale1.printTale(); HashSet<Tale>
		 * shaherizada = new HashSet<Tale>(10); shaherizada.add(tale1);
		 * shaherizada.add(tale2); shaherizada.add(tale3);
		 * shaherizada.add(tale4); shaherizada.add(tale5);
		 * shaherizada.add(tale6); shaherizada.add(tale7);
		 * shaherizada.add(tale8); shaherizada.add(tale9);
		 * shaherizada.add(tale10); Tales.printTales(shaherizada);
		 */

		ArrayList<Tale> shaherizada1 = Tales.create50Tales();
		Tales.printTales(shaherizada1);
	}
}
