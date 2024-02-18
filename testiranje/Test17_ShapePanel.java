package testiranje;

import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.Test;

import panels.ShapePanel;
import shapes.Poly;

public class Test17_ShapePanel {
	@Test
	public void t17() {
		try {
		      ShapePanel sp=new ShapePanel();
		      sp.getShapes_label();
		      sp.getPreferredSize();
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
}
