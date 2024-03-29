package testiranje;

import static org.mockito.Mockito.verify;

import java.awt.Graphics2D;

import org.junit.Test;
import org.mockito.Mockito;

import shapes.Poly;

public class Test_drawPoly {

	@Test
	public void test() {
		Poly p=new Poly(1.0, 2.0, 3.0, 4.0);
		Graphics2D gMock = Mockito.mock(Graphics2D.class);
		p.draw(gMock);
		verify(gMock).drawRect(1, 2, 3, 4);
	}
}
