package testiranje;

import static org.mockito.Mockito.verify;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import org.junit.Test;
import org.mockito.Mockito;

import main.MainPanel;
import main.MyLabel;

public class Test35_MainPanelMousePressed {
	@Test
    public void testMousePressed() {
        MainPanel yourObject = new MainPanel(); 
        ImageIcon imageIcon = new ImageIcon("./main/java/icons/circle.png");
        MyLabel ml=new MyLabel(imageIcon);
        MouseEvent mockEvent=new MouseEvent(ml, 0, 0, 0, 0, 0, 0, false);

        yourObject.mousePressed(mockEvent);

        
        //verify(yourObject).mousePressed(mockEvent); // Prilagodite naziv metode
    }
	
	@Test
	public void testMousePressed2() {
		 MainPanel yourObject = new MainPanel(); 
	     ImageIcon imageIcon = new ImageIcon("./main/java/icons/circle.png");
	     MyLabel ml=new MyLabel(imageIcon);
	     
	     MouseEvent mockEvent2=new MouseEvent(yourObject, 0, 0, 0, 0, 0, 0, false);
	     yourObject.mousePressed(mockEvent2);
	}
	
	@Test
	public void testMouseDragged() {
        MainPanel yourObject = new MainPanel(); 
        ImageIcon imageIcon = new ImageIcon("./main/java/icons/polygon.png");
        MyLabel ml=new MyLabel(imageIcon);
        MouseEvent mockEvent=new MouseEvent(ml, 0, 0, 0, 20, 10, 0, false);
        yourObject.mouseDragged(mockEvent);
	}
}
