package com.Bhagya.HCF;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testGCD {

	@Test
	void test() {
		GCD c = new GCD();
		int result = c.gcd(0,60);
		assertEquals(60,result);
	}

}
