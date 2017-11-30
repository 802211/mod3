package abstract_classes.cities;

//Boston gets a bonus of $0.50 per person for having wicked cool accents.

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		double TAX = 0;
		double Bonus = population * growthRate;
		TAX = Bonus + population * 0.5;

		return TAX;
	}

}
