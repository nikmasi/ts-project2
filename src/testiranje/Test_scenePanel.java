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


public class Test_scenePanel {
	@Test
	public void constructor() {
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
	
	@Test
	public void setShape() {
		ScenePanel sp2=new ScenePanel(1,2,3,4,null);
		sp2.setCurrentShape(0);
		org.junit.Assert.assertEquals((double)0, (double)sp2.getCurrentShape(),0.0);
	}
	@Test(expected = IllegalArgumentException.class)
	public void setShape2() {
	    Triangle t=new Triangle(1,2,3,4);
	    ArrayList<MyShape> a=new ArrayList<>();
	    a.add(t);
		ScenePanel sp=new ScenePanel(1,2,3,4,a);
		
		sp.setCurrentShape(-2);
		org.junit.Assert.assertEquals((double)(-2), (double)sp.getCurrentShape(),0.0);
	}
}
