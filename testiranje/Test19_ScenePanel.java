package testiranje;

import static org.junit.Assert.fail;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.Test;

import main.MainPanel;
import main.MyShape;
import panels.ScenePanel;
import shapes.Circle;
import shapes.Poly;
import shapes.Rect;
import shapes.Triangle;


public class Test19_ScenePanel {
	@Test
	public void t19() {
		try {
			  Triangle t=new Triangle(1,2,3,4);
			  Circle c=new Circle(1,2,3,4);
			  Rect r=new Rect(1,2,3,4);
			  Poly p=new Poly(2,3,4,5);
		      ArrayList<MyShape> a=new ArrayList<>();
		      a.add(t);
		      a.add(c);
		      a.add(p);a.add(r);
			  new ScenePanel(1, 2, 3, 2, a);
			  
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
}
