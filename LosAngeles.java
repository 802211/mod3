package abstract_classes.cities;

//Los Angeles gets a multiplication bonus of half the growthRate from the Hollywood Mafia.

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub

		double TAX = 0;
		double Bonus = growthRate * population * (growthRate * 0.5);

		TAX = Bonus * population;

		return Bonus;
	}

}
