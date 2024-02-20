package testiranje;

import static org.mockito.Mockito.verify;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;

import main.MainPanel;
import main.MyShape;
import panels.ScenePanel;
import shapes.Poly;



public class Test41_ScenePanelPaint {

	@Test
	public void test41(){
	    MainPanel mp=new MainPanel();

		Poly p=new Poly(2,3,4,5);
	    ArrayList<MyShape> a=new ArrayList<>();
	    a.add(p);

	    Field field;
	    try {
			field = ScenePanel.class.getDeclaredField("shapes");
			field.setAccessible(true);
		    field.set(mp.getScenePanel(), a);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {}
	    
		//mp.getScenePanel().shapes=a;
		
		BufferedImage bi = new BufferedImage(2,3, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = bi.createGraphics();
		mp.getScenePanel().paint(g2);
		g2.dispose();	
	}
}
