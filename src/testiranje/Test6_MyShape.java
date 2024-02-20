package testiranje;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.MyShape;

public class Test6_MyShape {
	@ParameterizedTest
	@ValueSource(booleans= {false,true})
	public void t6(boolean v) {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setSelected(v);
		ms.getBorderColor();
		assertEquals(v,ms.getSelected());
		
	}
}
