package testiranje;

import static org.mockito.Mockito.verify;

import java.awt.Graphics2D;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import main.MyShape;

public class Test_drawMyShape {
	@ParameterizedTest
	@ValueSource(ints = {2, 1}) 
	public void test33(int num){
		Graphics2D gMock = Mockito.mock(Graphics2D.class);

		MyShape c=new MyShape(2,3,4,6);
		c.setBorderWidth(num);
		c.draw(gMock);
		
		verify(gMock).drawRect(2,3,4,6);
	}
}
