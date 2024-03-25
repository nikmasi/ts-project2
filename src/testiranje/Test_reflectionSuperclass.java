package testiranje;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.MyShape;
import shapes.Circle;
import shapes.Poly;
import shapes.Rect;
import shapes.Triangle;

public class Test_reflectionSuperclass {
	@Test
	public void circleSuperclass() {
		Circle s=new Circle(1,2,3,4);
	    Class<?> sClass = s.getClass();
	    Class<?> sSuperClass = sClass.getSuperclass();

	    assertEquals("MyShape", sSuperClass.getSimpleName());
	}
	
	@Test
	public void polySuperclass() {
		Poly s=new Poly(1,2,3,4);
	    Class<?> sClass = s.getClass();
	    Class<?> sSuperClass = sClass.getSuperclass();

	    assertEquals("MyShape", sSuperClass.getSimpleName());
	}
	
	@Test
	public void rectSuperclass() {
		Rect s=new Rect(1,2,3,4);
	    Class<?> sClass = s.getClass();
	    Class<?> sSuperClass = sClass.getSuperclass();

	    assertEquals("MyShape", sSuperClass.getSimpleName());
	}
	@Test
	public void triangleSuperclass() {
		Triangle s=new Triangle(1,2,3,4);
	    Class<?> sClass = s.getClass();
	    Class<?> sSuperClass = sClass.getSuperclass();

	    assertEquals("MyShape", sSuperClass.getSimpleName());
	}
}
