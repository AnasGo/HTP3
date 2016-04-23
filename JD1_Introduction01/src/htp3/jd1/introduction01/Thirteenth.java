package htp3.jd1.introduction01;

public class Thirteenth extends First {

	public static void main(String[] args) {
		printResult(functionX(enterX()));
	}

	public static double functionX(double x) {
		double f = 0;
		if (x <= 3) {
			f = Math.pow(x, 3) + 3 * x + 9;
		} else {
			f = Math.sin(x) / (Math.pow(x, 2) - 9);
		}
		return f;
	}
}