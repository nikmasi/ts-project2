package testiranje;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import main.MyShape;
import panels.FeaturesPanel;
import shapes.Triangle;


public class Test23_FeaturesPanel {
	@Test
	public void t23() {
		Triangle t=new Triangle(1,2,3,4);
	    ArrayList<MyShape> a=new ArrayList<>();
	    a.add(t);
		FeaturesPanel fp=new FeaturesPanel(a);
		
		fp.setCurrentShape(1);
		a.add(fp.getCurrentShape());
		org.junit.Assert.assertEquals(fp.getShapes().get(1), fp.getCurrentShape());
		
	}
}
