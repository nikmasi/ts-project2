package testiranje;

import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.Test;

import shapes.Circle;

public class Test12_Circle {
	@Test
	public void t12() {
		try {
		      Circle c1=new Circle(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE);
		      Circle c2=new Circle(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE,2);
		      new Circle(1.2, 2.1, 3, 2, Color.BLACK);
		      new Circle(1,2,3,4,4);
		      org.junit.Assert.assertNotNull("Circle c1 should not be null",c1);
		      org.junit.Assert.assertNotNull("Circle c2 should not be null", c2);
		      String m = null;
		  
		      org.junit.Assert.assertEquals(m, c1, c2);
	
		    } catch (Exception e) {
		      fail("Exception occurred: "+ e.getMessage());
		    }
	}

}
