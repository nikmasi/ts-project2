package testiranje;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.MyShape;
import shapes.Circle;

public class Test51_ReflectionPckName {
	@Test
	public void test51() {
		MyShape s=new MyShape(0,0,0,0);
	    Class<?> sClass = s.getClass();
	    Package pkg = sClass.getPackage();

	    assertEquals("main", pkg.getName());
	}
	
	@Test
	public void CirclePck() {
		Circle c=new Circle(0,0,0,0);
	    Class<?> sClass = c.getClass();
	    Package pkg = sClass.getPackage();

	    assertEquals("shapes", pkg.getName());
	}

}
