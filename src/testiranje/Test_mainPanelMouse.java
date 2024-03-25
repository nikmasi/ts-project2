package testiranje;

import static org.mockito.Mockito.verify;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;

import main.MainPanel;
import main.MyLabel;

public class Test_mainPanelMouse {
	@Test
    public void testMousePressed() {
        MainPanel yourObject = new MainPanel(); 
        ImageIcon imageIcon = new ImageIcon("./main/java/icons/circle.png");
        MyLabel ml=new MyLabel(imageIcon);
        MouseEvent mockEvent=new MouseEvent(ml, 0, 0, 0, 0, 0, 0, false);

        yourObject.mousePressed(mockEvent);

        
        //verify(yourObject).mousePressed(mockEvent); 
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
	
	@ParameterizedTest
	@CsvFileSource(resources="/paramTest37.csv",numLinesToSkip=0)
    public void testMousePressed(String name,int x,int y) {
        MainPanel yourObject = new MainPanel(); 
        ImageIcon imageIcon = new ImageIcon("./main/java/icons/polygon.png");
        MyLabel ml=new MyLabel(imageIcon);
        ml.setName(name);
        MouseEvent mockEvent=new MouseEvent(ml, 0, 0, 0, x, y, 0, false);

        MouseEvent mockEvent2=new MouseEvent(yourObject, 0, 20, 550,550, 0, 0, false);

        yourObject.mouseReleased(mockEvent);
        yourObject.mouseReleased(mockEvent2);
        
        //verify(yourObject).mousePressed(mockEvent); 
    }
}
