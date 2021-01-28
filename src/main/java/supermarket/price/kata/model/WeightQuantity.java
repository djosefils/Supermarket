package supermarket.price.kata.model;

public class WeightQuantity extends Quantity {

	public WeightQuantity(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	private WeightUnit unit;

	public WeightUnit getUnit() {
		return unit;
	}

	public void setUnit(WeightUnit unit) {
		this.unit = unit;
	}

	public WeightQuantity(double value, WeightUnit unit) {
		super(value);
		this.unit = unit;
	}
	

}
