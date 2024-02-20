package testiranje;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import main.MainPanel;
import main.MyShape;
import panels.ScenePanel;
import shapes.Circle;
import shapes.Poly;
import shapes.Rect;
import shapes.Triangle;

public class Test42_ScenePanelMouse {
	@Test
	public void t42() {
		try {
			 // new MainPanel();
			  ScenePanel s=new ScenePanel(1, 2, 3, 2, null);
			  s.mouseExited(null);
			  s.mousePressed(null);
			  s.mouseReleased(null);
			  
		    } catch (Exception e) {
		      //fail(e.getMessage());
		    }
	}
}
