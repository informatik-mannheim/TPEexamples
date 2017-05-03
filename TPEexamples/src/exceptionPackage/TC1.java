package exceptionPackage;
import static org.junit.Assert.*;

import org.junit.*;

public class TC1 {

	@Test
	public void testAufAusnahme1() {
		try {
			new String((String) null);
			fail();
		} catch (NullPointerException ex) {
			assertTrue(true);
		}
	}

	@Test(expected = NullPointerException.class)
	public void testAufAusnahme2() {
		new String((String) null);
	}
	
	@Test
	public void testAufAusnahme3 () {
		try {
			new MyExTest().m4(4);
			fail();
		} catch (MyException ex) {
			assertTrue(true);
		}
	}
	
	@Test(expected = MyException.class)
	public void testAufAusnahme4 () throws MyException{
		new MyExTest().m4(4);
	}
	
//	@Test(expected = NullPointerException.class)
//	public void testKaputt() {
//		String s1 = new String("Hallo");
//		assertEquals("Hallo", s1);
//		new String((String) null);
//		new String((char[]) null);
//		String s3 = new String("World");
//		assertEquals("world", s3);
//	}

}
