package testiranje;

import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.Test;

import shapes.Poly;
import shapes.Triangle;

public class Test15_Triangle {
	@Test
	public void t15() {
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
}
