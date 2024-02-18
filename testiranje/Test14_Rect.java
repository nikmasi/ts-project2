package testiranje;

import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.Test;

import shapes.Poly;
import shapes.Rect;

public class Test14_Rect {
	@Test
	public void t14() {
		try {
		      new Rect(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE);
		      new Rect(1.2, 2.1, 3, 2, Color.BLACK, Color.WHITE,2.2);
		      new Rect(1.2, 2.1, 3, 2, Color.BLACK);
		      new Rect(1,2,3,4,4);
		      new Rect(1,2,3,4);
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
}
