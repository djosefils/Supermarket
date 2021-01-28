package supermarket.price.kata.utils;

import java.util.function.Function;

import supermarket.price.kata.model.WeightUnit;

public class Util {

	public static Function<Double, Double> convertWeight(WeightUnit inputUnit, WeightUnit outputUnit) {
		if (outputUnit == inputUnit) {
			return weight -> weight;
		}
		switch (inputUnit) {
		case OUNCE:
			return weight -> weight / 16;
		case POUND:
			return weight -> weight * 16;
		}
		return weight -> weight;
	}
}
