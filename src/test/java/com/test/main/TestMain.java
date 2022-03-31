package com.test.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.test.Main.Main;

public class TestMain {
	
	@Test
	public void testInputIsEven() {
		assertTrue(Main.checkIfInputIsAnEvenNumber(22));
	}
}
