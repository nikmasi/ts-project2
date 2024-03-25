package testiranje;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.booleanThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.awt.Graphics;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import main.MainPanel;
import main.MyShape;
import main.Window;
import shapes.Circle;
import shapes.Triangle;

public class Test_dCircle {

	@Test
	public void circleGetArea(){
		Triangle t=mock(Triangle.class);
		when(t.getArea()).thenReturn((double) 0);
		double b=t.getArea();
		
		org.junit.Assert.assertEquals((double)0,b,0.0);
		verify(t).getArea();

	}
	
	@Test
	public void mouse() {
		MainPanel m=new MainPanel();
		m.mouseClicked(null);
		m.mouseExited(null);
	}
}
