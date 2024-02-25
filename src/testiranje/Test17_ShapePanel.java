package testiranje;

import static org.junit.Assert.fail;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

import org.junit.Test;

import panels.ShapePanel;
import shapes.Poly;

public class Test17_ShapePanel {
	@Test
	public void t17() {
		try {
		      ShapePanel sp=new ShapePanel();
		      JLabel l=sp.getShapes_label();
		      Dimension d=sp.getPreferredSize();
		      System.out.println("Get shapes label: "+l.getText());
		      System.out.println("Get preferred size:  height= "+d.getHeight()+ " width="+d.getWidth());
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
}
