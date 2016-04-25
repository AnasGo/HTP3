package htp3.jd1.oop05.fraction;

class CommonFraction {
	private int numerator = 0;
	private int denominator = 0;

	public CommonFraction() {
	}

	public CommonFraction(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
	}

	public CommonFraction(int x) {
		this(x, x);
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
			this.denominator = denominator;
	}

	public int getDenominator() {
		return denominator;
	}
}