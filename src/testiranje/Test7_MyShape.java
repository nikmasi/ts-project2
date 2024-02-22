package testiranje;

import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;

import main.MyShape;

public class Test7_MyShape {
	
	private MyShape ms =new MyShape(1,2,3,4);
	
	@Test
	public void myShapeSetters() {
		ms.setWidth(3.3);
		ms.setHeight(2.2);
		org.junit.Assert.assertEquals(3.3*2.2, ms.getArea(),0.0);
		
	}
}
