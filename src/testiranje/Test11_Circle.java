package testiranje;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import shapes.Circle;


public class Test11_Circle {
	@Test
	public void t11() {
		Circle c=new Circle(1,2,3,4);
		double num=Math.PI*c.getWidth();
		org.junit.Assert.assertEquals(Math.PI*3, c.getArea(),0.0);
	}
}
