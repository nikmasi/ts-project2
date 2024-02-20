package testiranje;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import main.MyShape;

public class Test60_MockMyShape {
	@Test
	public void t1() {
		MyShape ms=mock(MyShape.class);
		
		when(ms.getX()).thenReturn(12.0);
		
		org.junit.Assert.assertEquals(ms.getX(), 12.0, 0.0);
		
		doReturn(12.0).when(ms).getX();
	}
	
	@Test
	public void t2() {
		MyShape ms2=mock(MyShape.class);
		
		when(ms2.getY()).thenReturn(12.0);
		
		org.junit.Assert.assertEquals(ms2.getY(), 12.0, 0.0);
		
		doReturn(12.0).when(ms2).getY();
	}
	
	@Test
	public void t3() {
		MyShape ms3=mock(MyShape.class);
		
		when(ms3.getWidth()).thenReturn(12.0);
		
		org.junit.Assert.assertEquals(ms3.getWidth(), 12.0, 0.0);
		
		doReturn(12.0).when(ms3).getWidth();
	}
}
