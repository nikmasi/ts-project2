package testiranje;

import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.Test;

import shapes.Circle;
import shapes.Poly;

public class Test13_Poly {

	@Test
	public void testConstructorPoly() {
		try {
		      new Poly(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE);
		      new Poly(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE,2.2);
		      new Poly(1.2, 2.1, 3, 2, Color.BLACK);
		      new Poly(1,2,3,4,4);
		      new Poly(1,2,3,4);
		} catch (Exception e) {
		      fail(e.getMessage());
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorIllegal() {
		try {
			new Poly(-2,-2,-3,-1);
			// The constructor should throw IllegalArgumentException for a negative side
		}catch (Exception e) {
		      fail(e.getMessage());
		}
	}
	
}
