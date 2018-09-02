package com.sujan.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StraightLineCalculationTest {
	
	private static StraightLineCalculation StLineCalc;

	@Before
	public void setUp() throws Exception {
		StLineCalc = new StraightLineCalculation();
	}

	@Test
	public void testgrad() {
	//	fail("Not yet implemented");
		double x1 = 0;
		double y1 = 2;
		double x2 = 4;
		double y2 = 5;

		double res = (y2 - y1)/(x2 - x1);
		//compare to calculate java
		assertEquals(res, StLineCalc.grad(0, 2, 4, 5), 0.001);
		
	}
	@Test
	public void testdist() {
		//fail("Not yet implemented");
		double x1 = 2;
		double y1 = 4;
		double x2 = 6;
		double y2 = 8;

		double res = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		//compare to calculate java
		assertEquals(res, StLineCalc.dist(2, 4, 6, 8), 0.001);
		
	}@Test
	public void testequ() {
		//fail("Not yet implemented");
		double x1 =2;
		double y1=4;
		double grad =1;
		double output = y1 - (grad*x1);
		
		String res= "y -"+grad+"x =" +output;
		assertEquals(res, StLineCalc.equ(x1, y1, grad));
		
	}
}
