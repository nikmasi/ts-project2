package testiranje;

import java.lang.reflect.Field;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.event.CaretEvent;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import main.MainPanel;
import main.MyShape;
import panels.FeaturesPanel;
import shapes.Triangle;

class CustomCaretEvent extends CaretEvent {

    private final int dot;
    private final int mark;

    public CustomCaretEvent(Object object, int dot, int mark) {
        super(object);
        this.dot = dot;
        this.mark = mark;
    }
    public void set_source(Object object) {
    	this.source=object;
    }

	@Override
	public int getDot() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMark() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Test_featuresPanelFields<FieldUtils> {
	
	@Test
    public void test35() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	    MainPanel m=new MainPanel();
	    FeaturesPanel your =m.getFeaturesPanel();
	    
	    Field field = FeaturesPanel.class.getDeclaredField("x_textField");
	    field.setAccessible(true);
	    JTextField x=(JTextField)field.get(your);
	    
	    CustomCaretEvent c=new CustomCaretEvent(x,2,3);
        c.set_source(x);
	    
        //CustomCaretEvent c=new CustomCaretEvent(your.x_textField,2,3);
        //c.set_source(your.x_textField);
        c.getDot();c.getMark();
        your.caretUpdate(c);
    }
	
	@Test
	public void Testy_textField() {
		 MainPanel m=new MainPanel();
		 FeaturesPanel your =m.getFeaturesPanel();
		 
		 Field field;JTextField y=null;
		try {
			field = FeaturesPanel.class.getDeclaredField("y_textField");
			field.setAccessible(true);
		    y=(JTextField)field.get(your);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	    

		 CustomCaretEvent c=new CustomCaretEvent(y,2,3);
	     your.caretUpdate(c);
	}
	
	@Test
	public void Testwidth_textField() {
		 MainPanel m=new MainPanel();
		 FeaturesPanel your =m.getFeaturesPanel();
		 
		  Field field;JTextField y=null;
		try {
			field = FeaturesPanel.class.getDeclaredField("width_textField");
			field.setAccessible(true);
		    y=(JTextField)field.get(your);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	    

		 CustomCaretEvent c=new CustomCaretEvent(y,2,3);

	     your.caretUpdate(c);
	}
	
	@Test
	public void Testheight_textField() {
		 MainPanel m=new MainPanel();
		 FeaturesPanel your =m.getFeaturesPanel();
		 
		  Field field;JTextField y=null;
			try {
				field = FeaturesPanel.class.getDeclaredField("height_textField");
				field.setAccessible(true);
			    y=(JTextField)field.get(your);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		    

			 CustomCaretEvent c=new CustomCaretEvent(y,2,3);

	     your.caretUpdate(c);
	}
	
	@Test
	public void TestborderWidth_textField() {
		 MainPanel m=new MainPanel();
		 FeaturesPanel your =m.getFeaturesPanel();
		 
		 Field field;JTextField y=null;
			try {
				field = FeaturesPanel.class.getDeclaredField("borderWidth_textField");
				field.setAccessible(true);
			    y=(JTextField)field.get(your);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		    

			 CustomCaretEvent c=new CustomCaretEvent(y,2,3);

		
	     your.caretUpdate(c);
	}

	@Test
	public void TestinsiderColor_textField() {
		 MainPanel m=new MainPanel();
		 FeaturesPanel your =m.getFeaturesPanel();
		 
		 Field field;JTextField y=null;
			try {
				field = FeaturesPanel.class.getDeclaredField("insiderColor_textField");
				field.setAccessible(true);
			    y=(JTextField)field.get(your);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		    

			 CustomCaretEvent c=new CustomCaretEvent(y,2,3);

	     your.caretUpdate(c);
	}
	
	@Test
	public void TestborderColor_textField() {
		 MainPanel m=new MainPanel();
		 FeaturesPanel your =m.getFeaturesPanel();
		 
		 Field field;JTextField y=null;
			try {
				field = FeaturesPanel.class.getDeclaredField("borderColor_textField");
				field.setAccessible(true);
			    y=(JTextField)field.get(your);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		    

			 CustomCaretEvent c=new CustomCaretEvent(y,2,3);

	     your.caretUpdate(c);
	}
	
	@Test
	public void Testmass_textField() {
		 MainPanel m=new MainPanel();
		 FeaturesPanel your =m.getFeaturesPanel();
		 
		 Field field;JTextField y=null;
			try {
				field = FeaturesPanel.class.getDeclaredField("mass_textField");
				field.setAccessible(true);
			    y=(JTextField)field.get(your);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		    

			 CustomCaretEvent c=new CustomCaretEvent(y,2,3);

	     your.caretUpdate(c);
	}
	
	@Test
	public void Testgravity_textField() {
		 MainPanel m=new MainPanel();
		 FeaturesPanel your =m.getFeaturesPanel();
		 
		 Field field;JTextField y=null;
			try {
				field = FeaturesPanel.class.getDeclaredField("gravity_textField");
				field.setAccessible(true);
			    y=(JTextField)field.get(your);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		    

			 CustomCaretEvent c=new CustomCaretEvent(y,2,3);

	     your.caretUpdate(c);
	}
	
	@Test
	public void Testbounce_textField() {
		 MainPanel m=new MainPanel();
		 FeaturesPanel your =m.getFeaturesPanel();

		 Field field;JTextField y=null;
			try {
				field = FeaturesPanel.class.getDeclaredField("bounce_textField");
				field.setAccessible(true);
			    y=(JTextField)field.get(your);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		    

			 CustomCaretEvent c=new CustomCaretEvent(y,2,3);


	     your.caretUpdate(c);
	}
	
}

