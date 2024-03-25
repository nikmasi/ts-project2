package testiranje;

import static org.junit.Assert.fail;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

import org.junit.Test;

import panels.ShapePanel;
import shapes.Poly;

public class Test_shapePanel {
	@Test
	public void shapePanel() {
		try {
		      ShapePanel sp=new ShapePanel();
		      JLabel l=sp.getShapes_label();
		      Dimension d=sp.getPreferredSize();
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
}
