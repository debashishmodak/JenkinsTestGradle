import static org.junit.Assert.*;

import org.junit.Test;

public class TestHelloWorld {
	HelloWorld htest = new HelloWorld();
	int c=20;
	int d=30;
	
	@Test
	public void testSum(){
		assertEquals(50, htest.sum(c, d));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(600, htest.multiply(c, d));
	}

}
