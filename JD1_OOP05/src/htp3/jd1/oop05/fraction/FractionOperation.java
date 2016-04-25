package htp3.jd1.oop05.fraction;

class FractionOperation extends CommonFraction {

	public FractionOperation() {
		super();
	}

	public FractionOperation(int numerator, int denominator) {
		super(numerator, denominator);
	}

	public FractionOperation(int x) {
		super(x);
	}

	public static CommonFraction fractionSum(CommonFraction obj1, CommonFraction obj2) {
		CommonFraction fractionSum = new FractionOperation();
		fractionSum.setDenominator(obj1.getDenominator() * obj2.getDenominator());
		fractionSum.setNumerator(
				(obj1.getNumerator() * obj2.getDenominator()) + (obj2.getNumerator() * obj1.getDenominator()));
		System.out.println("Сумма дробей: " + fractionSum.getNumerator()+ "/" + fractionSum.getDenominator());
		return fractionSum;
	}

	public static CommonFraction fractionMultiplic(CommonFraction obj1, CommonFraction obj2) {
		CommonFraction fractionMultiplic = new FractionOperation();
		fractionMultiplic.setDenominator(obj1.getDenominator() * obj2.getDenominator());
		fractionMultiplic.setNumerator(obj1.getNumerator() * obj2.getNumerator());
		System.out.println("Умножение дробей: " + fractionMultiplic.getNumerator()+ "/" + fractionMultiplic.getDenominator());
		return fractionMultiplic;
	}

	public static CommonFraction fractionSubtraction(CommonFraction obj1, CommonFraction obj2) {
		CommonFraction fractionSubtraction = new FractionOperation();
		fractionSubtraction.setDenominator(obj1.getDenominator() * obj2.getDenominator());
		fractionSubtraction.setNumerator(
				(obj1.getNumerator() * obj2.getDenominator()) - (obj2.getNumerator() * obj1.getDenominator()));
		System.out.println("Вычитание дробей: " + fractionSubtraction.getNumerator() + "/" + fractionSubtraction.getDenominator());
		return fractionSubtraction;
	}

	public static CommonFraction fractionDivision(CommonFraction obj1, CommonFraction obj2) {
		CommonFraction fractionDivision = new FractionOperation();
		fractionDivision.setNumerator(obj1.getNumerator() * obj2.getDenominator());
		fractionDivision.setDenominator(obj1.getDenominator() * obj2.getNumerator());
		System.out.println("Умножение дробей: " + fractionDivision.getNumerator() + "/" + fractionDivision.getDenominator());
		return fractionDivision;
	}
}