package htp3.jd1.introduction01;

public class Eleventh extends Second {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = enterX();
		double xa = p1.x;
		p1.y = enterY();
		double ya = p1.y;
		Point p2 = new Point();
		p2.x = enterX();
		double xb = p2.x;
		p2.y = enterY();
		double yb = p2.y;
		findP(xa, ya, xb, yb);
	}

	public static class Point {
		double x = 0;
		double y = 0;
	}

	public static void findP(double xa, double ya, double xb, double yb) {
		double p1 = Math.sqrt(Math.pow(xa, 2) + Math.pow(ya, 2));
		double p2 = Math.sqrt(Math.pow(xb, 2) + Math.pow(yb, 2));
		if (p1 > p2) {
			System.out.println("Точка А находится дальше от начала координат.");
		} else if (p1 < p2) {
			System.out.println("Точка А находится ближе к началу координат.");
		} else {
			System.out.println("Точки находятся на равном расстоянии от начала координат.");
		}
	}
}