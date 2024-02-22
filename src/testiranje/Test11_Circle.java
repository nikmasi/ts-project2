package testiranje;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import shapes.Circle;


public class Test11_Circle {
	
	private Circle circle;
	
	@Before
	public void setup() {
		circle=new Circle(1,2,3,4);
	}
	
	@Test
	public void t11() {
		//Circle 
		double expectedArea=Math.PI * circle.getWidth()* circle.getWidth();
		org.junit.Assert.assertEquals(expectedArea, circle.getArea(),0.0);
	}
}
