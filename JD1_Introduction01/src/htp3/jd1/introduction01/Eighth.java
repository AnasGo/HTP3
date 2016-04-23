package htp3.jd1.introduction01;

public class Eighth extends Fifth {

	public static void main(String[] args) {
		existT(enterA(), enterB(), enterC());
	}

	public static void existT(double a, double b, double c) {
		if ((a + b > c) && (b + c > a) && (c + a > b)) {
			System.out.println("С такими сторонами треугольник построить можно.");
		} else {
			System.out.println("С такими сторонами треугольник построить нельзя.");
		}
	}
}