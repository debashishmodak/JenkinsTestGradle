import static org.junit.Assert.*;

import org.junit.Test;

public class TestHelloWorld {
	HelloWorld htest = new HelloWorld();
	int c=10;
	int d=20;
	
	@Test
	public void testSum(){
		assertEquals(30, htest.sum(c, d));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(200, htest.multiply(c, d));
	}

}
