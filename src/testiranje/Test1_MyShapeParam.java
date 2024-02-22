package testiranje;

import static org.junit.Assert.assertEquals;


import java.awt.Color;


import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import main.MyShape;



public class Test1_MyShapeParam {
	/*
	private MyShape ms;
	
	@BeforeEach
	public void before() {
		System.out.println("before");
		ms=new MyShape(1,2,3,4);
	}
	
	@AfterEach
	public void after() {
		ms=null;
	}
	*/
	@ParameterizedTest
	@CsvFileSource(resources="/paramTest1.csv",numLinesToSkip=0)
	public void t1(int a,int b,int c,int d,boolean vr) {
		MyShape ms=new MyShape(1,2,3,4);
		//System.out.println(vr);
		//System.out.println(ms);

		assertEquals(vr,ms.intersects(a,b,c,d));
	}
	
	@Test
	public void setGetX() {
		MyShape ms=new MyShape(1,2,3,4);
		
		ms.setX(2);
		System.out.println("Actual X: " + ms.getX());
		org.junit.Assert.assertEquals(2, (double)ms.getX(),0.0);
	}
	
	@Test
	public void setGetY() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setY(3);
		org.junit.Assert.assertEquals(3, (double)ms.getY(),0.0);
	}
		
	@Test
	public void setGetWidth() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setWidth(4);
		org.junit.Assert.assertEquals(4, (double)ms.getWidth(),0.0);
	}
	
	@Test
	public void setGetHeight() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setHeight(5);
		org.junit.Assert.assertEquals(5, (double)ms.getHeight(),0.0);
	}
	
	@Test
	public void setGetBorderColor() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setBorderColor(Color.BLUE);
		org.junit.Assert.assertEquals(Color.BLUE,ms.getBorderColor());
	}
	
	@Test
	public void setGetInsiderColor() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setInsiderColor(Color.BLUE);
		org.junit.Assert.assertEquals(Color.BLUE,ms.getInsiderColor());
	}
	
	@Test
	public void setGetBorderWidth() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setBorderWidth(30);
		org.junit.Assert.assertEquals(30, (double)ms.getBorderWidth(),0.0);
	}
		
	@Test
	public void setGetArea() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setArea(30);
		org.junit.Assert.assertEquals(30, (double)ms.getArea(),0.0);
	}
	
	@Test
	public void setGetGravity() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setGravity(2.2);
		org.junit.Assert.assertEquals(2.2, (double)ms.getGravity(),0.0);
	}
	
	@Test
	public void setGetBounce() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setBounce(30);
		org.junit.Assert.assertEquals(30, (double)ms.getBounce(),0.0);
	}
	
	@Test
	public void setGetMass() {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setMass(30);
		org.junit.Assert.assertEquals(30, (double)ms.getMass(),0.0);
	}

}
