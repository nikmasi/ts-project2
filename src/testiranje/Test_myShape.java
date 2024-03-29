package testiranje;

import static org.junit.Assert.assertEquals;


import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import main.MyShape;



public class Test_myShape {
	
	private MyShape ms;
	
	@Before
	public void before() {
		ms=new MyShape(1,2,3,4);
	}
	
	@After
	public void after() {
		ms=null;
	}
	
	@ParameterizedTest
	@CsvFileSource(resources="/paramTest1.csv",numLinesToSkip=0)
	public void t1(int a,int b,int c,int d,boolean vr) {
		MyShape myShape=new MyShape(1,2,3,4);
		assertEquals(vr,myShape.intersects(a,b,c,d));
	}
	
	@Test
	public void setGetX() {
		ms.setX(2);
		System.out.println("Actual X: " + ms.getX());
		org.junit.Assert.assertEquals(2, (double)ms.getX(),0.0);
	}
	
	@Test
	public void setGetY() {
		ms.setY(3);
		org.junit.Assert.assertEquals(3, (double)ms.getY(),0.0);
	}
		
	@Test
	public void setGetWidth() {
		ms.setWidth(4);
		org.junit.Assert.assertEquals(4, (double)ms.getWidth(),0.0);
	}
	
	@Test
	public void setGetHeight() {
		ms.setHeight(5);
		org.junit.Assert.assertEquals(5, (double)ms.getHeight(),0.0);
	}
	
	@Test
	public void setGetBorderColor() {
		ms.setBorderColor(Color.BLUE);
		org.junit.Assert.assertEquals(Color.BLUE,ms.getBorderColor());
	}
	
	@Test
	public void setGetInsiderColor() {
		ms.setInsiderColor(Color.BLUE);
		org.junit.Assert.assertEquals(Color.BLUE,ms.getInsiderColor());
	}
	
	@Test
	public void setGetBorderWidth() {
		ms.setBorderWidth(30);
		org.junit.Assert.assertEquals(30, (double)ms.getBorderWidth(),0.0);
	}
		
	@Test
	public void setGetArea() {
		ms.setArea(30);
		org.junit.Assert.assertEquals(30, (double)ms.getArea(),0.0);
	}
	
	@Test
	public void setGetGravity() {
		ms.setGravity(2.2);
		org.junit.Assert.assertEquals(2.2, (double)ms.getGravity(),0.0);
	}
	
	@Test
	public void setGetBounce() {
		ms.setBounce(30);
		org.junit.Assert.assertEquals(30, (double)ms.getBounce(),0.0);
	}
	
	@Test
	public void setGetMass() {
		ms.setMass(30);
		org.junit.Assert.assertEquals(30, (double)ms.getMass(),0.0);
	}
	
	@ParameterizedTest
	@ValueSource(booleans= {false,true})
	public void setGetSelected(boolean v) {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setSelected(v);
		assertEquals(v,ms.getSelected());	
	}

}
