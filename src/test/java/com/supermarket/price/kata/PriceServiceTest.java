package com.supermarket.price.kata;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import supermarket.price.kata.model.Discount;
import supermarket.price.kata.model.Price;
import supermarket.price.kata.model.Product;
import supermarket.price.kata.model.Shop;
import supermarket.price.kata.model.UnitPrice;
import supermarket.price.kata.model.UnitQuantity;
import supermarket.price.kata.service.PriceServiceImpl;


public class PriceServiceTest {
	
	PriceServiceImpl priceSrvice =new PriceServiceImpl();
	
	@Test
	public void calculePriceTest() {
		
		Shop shop = new Shop();
		Product product = new Product();
		product.setName("p1");
		product.setReference("ref1");
		product.setPrice(new UnitPrice(1.5));

		shop.setProduct(product);
		shop.setQuantity( new UnitQuantity(5.0));

		Discount discount = new Discount();
		discount.setDicountQuantity(new UnitQuantity(4.0));
		discount.setDiscountPrice(new Price(5.0));
		discount.setProduct(product);

		Double total = priceSrvice.calculePrice(shop, Arrays.asList(discount));
		assertEquals(new Double(6.5), total);
	}
}
