package htp3.jd1.oop05.fraction;

public class Fraction extends FractionOperation {

	public static void main(String[] args) {
		CommonFraction cf1 = new CommonFraction(1, 2);
		CommonFraction cf2 = new CommonFraction(3, 4);
		fractionSum(cf1, cf2);
		fractionMultiplic(cf1, cf2);
		fractionSubtraction(cf1, cf2);
		fractionDivision(cf1, cf2);
		PrintConsole.print(cf1);
	}
}