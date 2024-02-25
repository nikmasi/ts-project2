package testiranje;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.awt.Graphics;
import java.awt.Graphics2D;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import shapes.Circle;
import shapes.Triangle;

public class Test31_drawCircle {
	@ParameterizedTest
	@CsvFileSource(resources="/parametri.csv",numLinesToSkip=0)
	public void test30(int num){
		Graphics2D gMock = Mockito.mock(Graphics2D.class);
	    //expectations
		Circle c=new Circle(2,3,4,6);
		c.setBorderWidth(num);
		c.draw(gMock);
		verify(gMock).drawOval(2, 3, 4, 6);

	}
}
