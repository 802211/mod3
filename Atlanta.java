package abstract_classes.cities;

//Atlanta gets a multiplication bonus of twice the growthRate because their airport is just so darn huge!

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub

		double TAX;
		double Bonus = growthRate * 2;

		TAX = Bonus * population;

		return TAX;
	}

}
