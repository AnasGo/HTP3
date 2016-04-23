package htp3.jd1.introduction01;

public class Seventh extends Second {

	public static void main(String[] args) {
		coordinateXY(enterX(), enterY());
	}

	public static boolean coordinateXY(double x, double y) {
		boolean a = false;
		double b = Math.pow(x, 2) + Math.pow(y, 2);
		if (x < 0 || x > 5 || y > 4 || y < -5) {
			a = false;
		} else if (y > 0 && b <= 16) {
			a = true;
		} else if (y < 0 && b <= 25) {
			a = true;
		}
		System.out.println(a);
		return a;
	}
}
