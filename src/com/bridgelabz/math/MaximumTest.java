package com.bridgelabz.math;

import org.junit.Test;

public class MaximumTest {

	@Test
	public void findIntMax() {
		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 1000);
		int c = (int) (Math.random() * 1000);

		System.out.println(Maths.findMax(a, b, c));
	}

	@Test
	public void findFloatMax() {
		float a = (float) (Math.random() * 1000);
		float b = (float) (Math.random() * 1000);
		float c = (float) (Math.random() * 1000);
		System.out.println(Maths.findMax(a, b, c));
	}
}