package testiranje;

import static org.junit.Assert.fail;

import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.MainPanel;
import main.MyLabel;
import main.MyShape;
import panels.ScenePanel;
import shapes.Triangle;

public class Test_scenePanelMouse {
	
	MainPanel mp;
	Triangle t;
	ArrayList<MyShape> a;
	ScenePanel sp;
	
	@Before
	public void before() {
		mp = new MainPanel(); 
        t=new Triangle(3,3,3,4);
	    a=new ArrayList<>();
	    a.add(t);
	    
        sp=new ScenePanel(1, 2, 3, 4, a);
	}
	
	@After
	public void after() {
		mp=null;
		t=null;
		a=null;
		sp=null;
	}

	@Test
	public void testMouseClicked() {
        
        MouseEvent mockEvent=new MouseEvent(mp.getScenePanel(), 0, 0, 0, 3, 3, 0, false);
        ScenePanel sp2=mp.getScenePanel();
        
        Field field;
		try { 
			field = ScenePanel.class.getDeclaredField("shapes");
			field.setAccessible(true);
		    field.set(sp2, a);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {}
	    
        mp.getScenePanel().mouseClicked(mockEvent);
	}
	
	@Test
	public void mouseExitedPressedReleased() {
		try {
			  sp.mouseExited(null);
			  sp.mousePressed(null);
			  sp.mouseReleased(null);
			  
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
}
