package testiranje;

import static org.junit.Assert.fail;

import java.awt.EventQueue;

import org.junit.Test;

import main.Window;

class R implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Test_window {
	@Test
	public void window() throws InterruptedException {
		try {
		      Window w=new Window();
		      w.main(null);
		      Runnable r=new R();
		      EventQueue.invokeAndWait(r);
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}
}
