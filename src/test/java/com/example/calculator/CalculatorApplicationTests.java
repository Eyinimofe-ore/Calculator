package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CalculatorApplicationTests {

	private CalculatorService calculator = new CalculatorService();
	@org.junit.Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}

}
