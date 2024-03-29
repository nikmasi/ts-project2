package testiranje;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import org.junit.Test;

import main.MyLabel;
import main.MyShape;
import panels.FeaturesPanel;
import panels.ScenePanel;
import panels.ShapePanel;
import shapes.Circle;
import shapes.Poly;
import shapes.Rect;
import shapes.Triangle;

public class Test_reflectionPckName {
	@Test
	public void mainPckMyShape() {
		MyShape s=new MyShape(1,2,3,4);
	    Class<?> sClass = s.getClass();
	    Package pkg = sClass.getPackage();
	    assertEquals("main", pkg.getName());
	}
	
	@Test
	public void mainPckMyLabel() {
		ImageIcon imageIcon = new ImageIcon("./main/java/icons/rectangle.png");
		MyLabel s=new MyLabel(imageIcon);
	    Class<?> sClass = s.getClass();
	    Package pkg = sClass.getPackage();
	    assertEquals("main", pkg.getName());
	}
	
	@Test
	public void panelsPckFeaturesPanel() {
		FeaturesPanel s=new FeaturesPanel(new ArrayList<MyShape>());
	    Class<?> sClass = s.getClass();
	    Package pkg = sClass.getPackage();
	    assertEquals("panels", pkg.getName());
	}
	
	@Test
	public void panelsPckScenePanel() {
		ScenePanel s=new ScenePanel(1,2,3,4,null);
	    Class<?> sClass = s.getClass();
	    Package pkg = sClass.getPackage();
	    assertEquals("panels", pkg.getName());
	}
	@Test
	public void panelsPckShapePanel() {
		ShapePanel s=new ShapePanel();
	    Class<?> sClass = s.getClass();
	    Package pkg = sClass.getPackage();
	    assertEquals("panels", pkg.getName());
	}
	
	@Test
	public void shapesPckCircle() {
		Circle c=new Circle(1,2,3,4);
	    Class<?> sClass = c.getClass();
	    Package pkg = sClass.getPackage();
	    assertEquals("shapes", pkg.getName());
	}
	
	@Test
	public void shapesPckPoly() {
		Poly c=new Poly(1,2,3,4);
	    Class<?> sClass = c.getClass();
	    Package pkg = sClass.getPackage();
	    assertEquals("shapes", pkg.getName());
	}
	
	@Test
	public void shapesPckRect() {
		Rect c=new Rect(1,2,3,4);
	    Class<?> sClass = c.getClass();
	    Package pkg = sClass.getPackage();
	    assertEquals("shapes", pkg.getName());
	}
	
	@Test
	public void shapesPckTriangle() {
		Triangle c=new Triangle(1,2,3,4);
	    Class<?> sClass = c.getClass();
	    Package pkg = sClass.getPackage();
	    assertEquals("shapes", pkg.getName());
	}

}
