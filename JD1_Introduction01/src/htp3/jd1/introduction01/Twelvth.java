package htp3.jd1.introduction01;

public class Twelvth extends First {

	public static void main(String[] args) {
		printResult(functionX(enterX()));
	}

	public static double functionX(double x) {
		double f = 0;
		if (x >= 0 && x <= 3) {
			f = Math.pow(x, 2);
		} else {
			f = 4;
		}
		return f;
	}
}
