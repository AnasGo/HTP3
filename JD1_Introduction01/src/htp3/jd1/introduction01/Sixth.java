package htp3.jd1.introduction01;

public class Sixth extends Second {

	public static void main(String[] args) {
		coordinateXY(enterX(), enterY());
	}

	public static boolean coordinateXY(double x, double y) {
		boolean a = false;
		if (y < -3 || y > 4 || x < -4 || x > 4) {
			System.out.println(a);
		} else if (y > 0 && (x > 2 || x < -2)) {
			System.out.println(a);
		} else if (y < 0 && (x > 4 || x < -4)) {
			System.out.println(a);
		} else {
			a = true;
			System.out.println(a);
		}
		return a;
	}
}