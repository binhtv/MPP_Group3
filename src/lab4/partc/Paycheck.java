package lab4.partc;

public final class Paycheck {
	private final double grossPay;
	private final double fica;
	private final double state;
	private final double local;
	private final double medicare;
	private final double socialSecurity;

	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double ss) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = ss;
	}

	public void print() {
		System.out.println("\tGross Pay: " + grossPay);
		System.out.println("\tFica: " + fica);
		System.out.println("\tState: " + state);
		System.out.println("\tLocal: " + local);
		System.out.println("\tMedicare: " + medicare);
		System.out.println("\tSocialSecurity: " + socialSecurity);
		System.out.println("\t----------------------------------");
		System.out.println("\tNet Pay: " + getNetPay());
	}

	public double getNetPay() {
		return grossPay - (fica + state + local + medicare + socialSecurity);
	}
}
