package testiranje;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import shapes.Triangle;

public class Test16_Triangle {
	@Test
	public void t1() {
		Triangle t=new Triangle(1,2,3,4);
		org.junit.Assert.assertEquals(3*4/2.0, t.getArea(),0.0);
		
	}
}
