package testiranje;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.awt.Color;

import javax.swing.ImageIcon;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.MyLabel;


public class Test10_MyLabel_Param {
	
	@ParameterizedTest
	@ValueSource(strings = {"./main/java/icons/circle.png", "./main/java/icons/polygon.png",
			"./main/java/icons/polygon1.png","./main/java/icons/polygon2.png",
			"./main/java/icons/rectangle.png","./main/java/icons/triangle.png"})
	public void t10(String input) {
		try {
			ImageIcon imageIcon = new ImageIcon(input);
			MyLabel ml=new MyLabel(imageIcon);
			ml.clone();		
		} catch (Exception e) {
		      fail(e.getMessage());
		}
	}
}
