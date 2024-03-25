package testiranje;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import main.MyShape;
import panels.FeaturesPanel;
import shapes.Triangle;

public class Test_featuresPanel {
	@Test
	public void constructor() {
		try {
			  Triangle t=new Triangle(1,2,3,4);
		      ArrayList<MyShape> a=new ArrayList<>();
		      a.add(t);
			  new FeaturesPanel(a);
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
	
	@Test
	public void shape() {
		Triangle t=new Triangle(1,2,3,4);
	    ArrayList<MyShape> a=new ArrayList<>();
	    a.add(t);
		FeaturesPanel fp=new FeaturesPanel(a);
		
		fp.setCurrentShape(1);
		a.add(fp.getCurrentShape());
		org.junit.Assert.assertEquals(fp.getShapes().get(1), fp.getCurrentShape());
		
	}
}
