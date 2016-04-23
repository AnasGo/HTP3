package htp3.jd1.introduction01;

public class Fourth extends Second {

	public static void main(String[] args) {
		resultR(enterX(), enterY());
	}

	public static void resultR(double x, double y) {
		double p = x * y;
		double s = x + y;
		double r = Math.abs(x - y);
		double c = x / y;
		System.out.println("Сумма = " + s + ", разность = " +  r + ", произведение = "+ p +", частное = " + c);
	}
}