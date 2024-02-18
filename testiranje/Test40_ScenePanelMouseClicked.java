package testiranje;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import org.junit.Test;

import main.MainPanel;
import main.MyLabel;
import main.MyShape;
import panels.ScenePanel;
import shapes.Triangle;

public class Test40_ScenePanelMouseClicked {

	@Test
	public void test40() {
        MainPanel mp = new MainPanel(); 
        Triangle t=new Triangle(3,3,3,4);
	    ArrayList<MyShape> a=new ArrayList<>();
	    a.add(t);
	    
        ScenePanel sp=new ScenePanel(0, 0, 0, 0, a);
        MouseEvent mockEvent=new MouseEvent(mp.getScenePanel(), 0, 0, 0, 3, 3, 0, false);
        
        mp.getScenePanel().shapes=a;
        mp.getScenePanel().mouseClicked(mockEvent);
        
	}
}
