package entities;

public class Individual extends Taxpayers{

	private Double healthSpendings;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, Double healthSpendings) {
		super(name, annualIncome);
		this.healthSpendings = healthSpendings;
	}


	public Double getHealthSpendings() {
		return healthSpendings;
	}

	public void setHealthSpendings(Double healthSpendings) {
		this.healthSpendings = healthSpendings;
	}

	@Override
	public Double tax() {
		if (getAnnualIncome() <= 20000.00) {
			return getAnnualIncome() * 0.15 - (healthSpendings * 0.5);
		}
		else {
			return getAnnualIncome() * 0.25 - (healthSpendings * 0.5);
		}
	}

}
