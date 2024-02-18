package testiranje;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.MyShape;
import panels.ScenePanel;
import panels.ShapePanel;


public class Test50_ReflectionGetNamesFields {
	@Test
	public void whenNonPublicField_thenReflectionTestUtilsSetField() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		MyShape s=new MyShape(0,0,0,0);
		Field[] f1 = MyShape.class.getDeclaredFields();
		List<String> actualFieldNames = getFieldNames(f1);
	
	    assertTrue(Arrays.asList("serialVersionUID","x", "y","width","height","borderColor","borderWidth","insiderColor",
	    		"mass","area","gravity","selected","bounce","v","energy")
	      .containsAll(actualFieldNames));
	}

	private List<String> getFieldNames(Field[] fields) {
		List<String> fieldNames = new ArrayList<>();
	    for (Field field : fields)
	      fieldNames.add(field.getName());
	    return fieldNames;
	}
	
	@Test
	public void scenePanelFields() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		ScenePanel sp=new ScenePanel(0, 0, 0, 0, null);
		Field[] f1 = ScenePanel.class.getDeclaredFields();
		List<String> actualFieldNames = getFieldNames(f1);
	
	    assertTrue(Arrays.asList("x", "y","width","height","shapes","currentShape","waitTime")
	      .containsAll(actualFieldNames));
	}
	
	@Test
	public void shapePanelFields() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		ShapePanel s2=new ShapePanel();
		Field[] f1 = ShapePanel.class.getDeclaredFields();
		List<String> actualFieldNames = getFieldNames(f1);
	
	    assertTrue(Arrays.asList("circle_label","rectangle_label", "triangle_label","polygon_label",
	    		"shapes_label","fps_label","fps_slider","fps_text")
	      .containsAll(actualFieldNames));
	}
}
