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
		Product product1 = new Product();
		product1.setName("A");
		product1.setReference("ref-A");
		product1.setPrice(new Price(1.66));

		Product product2 = new Product();
		product2.setName("B");
		product2.setReference("ref-B");
		product2.setPrice(new UnitPrice(3.8));

		shop.setProduct(product1);
		shop.setQuantity(new UnitQuantity(5.0));

		Discount discount = new Discount();
		discount.setDicountQuantity(new UnitQuantity(4.0));
		discount.setDiscountPrice(new Price(5.0));
		discount.setProduct(product2);

		Double total = priceSrvice.calculePrice(shop, Arrays.asList(discount));
		assertEquals(new Double(0.0), total);
	}
}
