package testiranje;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import shapes.Poly;
import shapes.Triangle;

public class Test_triangleCreate {
	@Test
	public void triangleConstructor() {
		try {
		      new Triangle(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE);
		      new Triangle(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE,2.2);
		      new Triangle(1.2, 2.1, 3, 2, Color.BLACK);
		      new Triangle(1,2,3,4,4);
		      new Triangle(1,2,3,4);
		 } catch (Exception e) {
		      fail(e.getMessage());
		 }
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void triangleIllegalCons() {
		try {
			new Triangle(-1,-2,-4,-2);
		}catch (Exception e) {
		      fail(e.getMessage());
		}
	}
	
	@ParameterizedTest
	@CsvFileSource(resources="/paramCreateZeros.csv",numLinesToSkip=0)
	public void triangleZero(double x,double y) {
	
		assertThrows(IllegalArgumentException.class, () -> {
	        // Your method invocation that should throw IllegalArgumentException
			new Triangle(1,0,x,y);
			System.out.println("Trougao sa visinom ili sirinom 0");
	    });
	}
}
