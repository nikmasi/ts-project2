package testiranje;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.MyShape;
import shapes.Circle;

public class Test52_CircleReflectionSuperclass {
	@Test
	public void test51() {
		Circle s=new Circle(0,0,0,0);
	    Class<?> sClass = s.getClass();
	    Class<?> sSuperClass = sClass.getSuperclass();

	    assertEquals("MyShape", sSuperClass.getSimpleName());
	}
}
