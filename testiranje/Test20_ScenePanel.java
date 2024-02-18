package testiranje;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import main.MyShape;
import panels.ScenePanel;
import shapes.Triangle;

public class Test20_ScenePanel {
	@Test
	public void t20() {
		ScenePanel sp2=new ScenePanel(1,2,3,4,null);
		sp2.setCurrentShape(0);
		org.junit.Assert.assertEquals((double)0, (double)sp2.getCurrentShape(),0.0);
	}
	@Test
	public void t20b() {
	    Triangle t=new Triangle(1,2,3,4);
	    ArrayList<MyShape> a=new ArrayList<>();
	    a.add(t);
		ScenePanel sp=new ScenePanel(1,2,3,4,a);
		
		sp.setCurrentShape(-2);
		org.junit.Assert.assertEquals((double)(-2), (double)sp.getCurrentShape(),0.0);
	}
}
