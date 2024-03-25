package testiranje;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.MyShape;

public class Test_mockMyShapeGetters {
	
	private MyShape myShape;
	
	@Before
	public void before() {
		System.out.println("before");
		myShape=mock(MyShape.class);
	}
	
	@After
	public void after() {
		System.out.println("after");
		myShape=null;
	}
	
	@Test
	public void myShapeX() {
		when(myShape.getX()).thenReturn(12.0);
		org.junit.Assert.assertEquals(myShape.getX(), 12.0, 0.0);
		doReturn(12.0).when(myShape).getX();
	}
	
	@Test
	public void myShapeY() {
		when(myShape.getY()).thenReturn(12.0);
		org.junit.Assert.assertEquals(myShape.getY(), 12.0, 0.0);
		doReturn(12.0).when(myShape).getY();
	}
	
	@Test
	public void myShapeWidth() {
		when(myShape.getWidth()).thenReturn(12.0);
		org.junit.Assert.assertEquals(myShape.getWidth(), 12.0, 0.0);
		doReturn(12.0).when(myShape).getWidth();
	}
	
	@Test
	public void myShapeHeight() {
		when(myShape.getHeight()).thenReturn(12.0);
		org.junit.Assert.assertEquals(myShape.getHeight(), 12.0, 0.0);
		doReturn(12.0).when(myShape).getHeight();
	}
}
