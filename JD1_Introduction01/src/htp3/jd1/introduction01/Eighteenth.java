package htp3.jd1.introduction01;

public class Eighteenth extends Fifth {

	public static void main(String[] args) {
		checkTri(enterA(), enterB(), enterC());
	}

	public static void checkTri(double a, double b, double c) {
		if (a == b && b == c) {
			System.out.println("Равносторонний");
		} else {
			System.out.println("Не равносторонний");
		}
	}
}
