package testiranje;

import static org.mockito.Mockito.verify;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import shapes.Triangle;

public class Test_drawTriangle {
	@ParameterizedTest
	@ValueSource(ints = {2, 1}) 
	public void test30(int num){
		Graphics2D gMock = Mockito.mock(Graphics2D.class);
		
	    //expectations
		Triangle c=new Triangle(2,3,4,5);
		c.setBorderWidth(num);
		
		int borderThickness = c.getBorderWidth() == 1 ? 2 : c.getBorderWidth();

		gMock.setStroke(new BasicStroke(borderThickness));
		
		gMock.setColor(c.getBorderColor());
		gMock.setColor(c.getInsiderColor());
		c.draw(gMock);
		
		//int[] xPoints = new int[] {(int)((2 + 4) / 2), (int)(2 + 4), (int)2};
		//int[] yPoints = new int[] {(int)(3), (int)(3 + 6), (int)(3 + 6)};
		int[] xPoints = new int[] {(int)((c.getX() + c.getWidth()) / 2), (int)(c.getX() + c.getWidth()), (int)c.getX()};
		int[] yPoints = new int[] {(int)(c.getY()), (int)(c.getY() + c.getHeight()), (int)(c.getY() + c.getHeight())};
		
		verify(gMock).drawPolygon(xPoints, yPoints, 3);
	    verify(gMock).fillPolygon(xPoints, yPoints, 3);
	}
		
}
