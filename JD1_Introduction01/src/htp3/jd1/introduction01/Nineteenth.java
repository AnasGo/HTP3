package htp3.jd1.introduction01;

public class Nineteenth extends First {

	public static void main(String[] args) {
		findR(enterX());
	}

	public static void findR(double x) {
		double sg = Math.pow(x, 2);
		System.out.println("Площадь грани = " + sg);
		double sf = sg * 6;
		System.out.println("Общая площадь поверхности куба = " + sf);
		double v = sg * x;
		System.out.println("Объем куба = " + v);
	}
}