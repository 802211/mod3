package abstract_classes.cities;

public class SanDiego extends City {

	// San Diego gets a flat bonus of $1,000,000 for being the best city ever.

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub

		double TAX = 0;

		TAX = population * growthRate + 1000000;

		return TAX;
	}

}
