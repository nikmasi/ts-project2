package testiranje;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import main.MyShape;
import panels.FeaturesPanel;
import shapes.Triangle;

public class Test22_FeaturesPanel {
	@Test
	public void t2() {
		try {
			  Triangle t=new Triangle(1,2,3,4);
		      ArrayList<MyShape> a=new ArrayList<>();
		      a.add(t);
			  new FeaturesPanel(a);
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
}
