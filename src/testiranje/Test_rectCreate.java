package testiranje;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import shapes.Poly;
import shapes.Rect;

public class Test_rectCreate {
	@Test
	public void constructor() {
		try {
		      new Rect(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE);
		      new Rect(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE,2.2);
		      new Rect(1.2, 2.1, 3, 2, Color.BLACK);
		      new Rect(1,2,3,4,4);
		      new Rect(1,2,3,4);
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorIllegal() {
		try {
			new Rect(-2,-2,-3,-1);
			// The constructor should throw IllegalArgumentException for a negative side
		}catch (Exception e) {
		      fail(e.getMessage());
		}
	}
	@ParameterizedTest
	@CsvFileSource(resources="/paramCreateZeros.csv",numLinesToSkip=0)
	public void rectZero(double x,double y) {
	
		assertThrows(IllegalArgumentException.class, () -> {
			new Rect(1,0,x,y);
	    });
	}
}
