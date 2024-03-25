package testiranje;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import shapes.Circle;
import shapes.Poly;
import shapes.Triangle;

public class Test_polyCreate {

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
	@ParameterizedTest
	@CsvFileSource(resources="/paramCreateZeros.csv",numLinesToSkip=0)
	public void polyZero(double x,double y) {
	
		assertThrows(IllegalArgumentException.class, () -> {
			new Poly(1,0,x,y);
	    });
	}
	
	
}
