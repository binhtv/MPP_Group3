package lab4.partc;

public enum TaxPercentage {
	FICA(0.23),
	STATE(0.05),
	LOCAL(0.01),
	MEDICARE(0.03),
	SOCIAL_SECURITY(0.075);
	
	private double value;
	
	private TaxPercentage(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
