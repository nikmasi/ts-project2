package testiranje;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import main.MainPanel;
import main.MyLabel;

public class Test37_MainPanelMouseReleased {
	@ParameterizedTest
	@CsvFileSource(resources="/paramTest37.csv",numLinesToSkip=0)
    public void testMousePressed(String name,int x,int y) {
        MainPanel yourObject = new MainPanel(); 
        ImageIcon imageIcon = new ImageIcon("./main/java/icons/polygon.png");
        MyLabel ml=new MyLabel(imageIcon);
        ml.setName(name);
        MouseEvent mockEvent=new MouseEvent(ml, 0, 0, 0, x, y, 0, false);

        MouseEvent mockEvent2=new MouseEvent(yourObject, 0, 20, 550,550, 0, 0, false);
        //MouseEvent mockEvent = Mockito.mock(MouseEvent.class);

        System.out.println(mockEvent.getX());
        System.out.println(mockEvent.getY());
        System.out.println(yourObject.getScenePanel().getX());

        System.out.println(yourObject.getScenePanel().getY());

        System.out.println(yourObject.getScenePanel().getWidth());

        System.out.println(yourObject.getScenePanel().getHeight());
        
        yourObject.mouseReleased(mockEvent);
        yourObject.mouseReleased(mockEvent2);
        
        //verify(yourObject).mousePressed(mockEvent); // Prilagodite naziv metode
    }
}
