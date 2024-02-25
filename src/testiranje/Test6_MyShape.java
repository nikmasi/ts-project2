package testiranje;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import main.MyShape;

public class Test6_MyShape {
	

	
	@ParameterizedTest
	@CsvFileSource(resources="/paramTest2.csv",numLinesToSkip=0)
	public void test(double d,double h) {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setGravity(2.0);
		ms.setHeight(h);
		ms.g(d);
	}
	
	@Test
	public void myShapeArea() {
		MyShape ms =new MyShape(1,2,3,4);
		ms.setWidth(3.3);
		ms.setHeight(2.2);
		org.junit.Assert.assertEquals(3.3*2.2, ms.getArea(),0.0);
	}
}
