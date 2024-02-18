package testiranje;

import static org.junit.Assert.fail;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;

import org.junit.Test;

import main.MainPanel;
import main.Window;

class Im extends Image{

	@Override
	public int getWidth(ImageObserver observer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight(ImageObserver observer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ImageProducer getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getProperty(String name, ImageObserver observer) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class Test25_MainPanel {
	@Test
	public void t25() {
		try {
			  Im i=new Im();i.getWidth(null);
			  i.getHeight(null);i.getSource();i.getGraphics();i.getProperty(null, null);
		      MainPanel m=new MainPanel();
		      m.dragImage=i;
		      m.getFeaturesPanel();
		      m.getScenePanel();
		      m.getShapePanel();
		      m.mouseMoved(null);
		      m.mouseEntered(null);
		      BufferedImage bi = new BufferedImage(2,3, BufferedImage.TYPE_INT_ARGB);
			  Graphics2D g2 = bi.createGraphics();
			  m.paint(g2);
			  //new Window();
			 
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
	
}
