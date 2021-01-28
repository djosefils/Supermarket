package supermarket.price.kata.model;

public class WeightPrice extends Price {

	private WeightUnit unit;

	public WeightPrice(double value) {
		super(value);
	}

	public WeightPrice(double value, WeightUnit unit) {
		super(value);
		this.unit = unit;
	}

	public WeightUnit getUnit() {
		return unit;
	}

	public void setUnit(WeightUnit unit) {
		this.unit = unit;
	}
}
