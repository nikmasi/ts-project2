package testiranje;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import main.MyShape;

public class Test2_MyShape {
	@ParameterizedTest
	@CsvFileSource(resources="/paramTest2.csv",numLinesToSkip=0)
	public void t1(double d,double h) {
		MyShape ms=new MyShape(1,2,3,4);
		ms.setGravity(2.0);
		ms.setHeight(h);
		ms.g(d);
		System.out.println(ms.getGravity());
		System.out.println(ms.getHeight());
		System.out.println(ms.getY());
	}
}
