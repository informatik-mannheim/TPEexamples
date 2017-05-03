package exceptionPackage;

class MyException extends Exception {

	private int reason;

	MyException(String s, int val) {
		super(s);
		System.out.print(s);
		reason = val;
	}

	public void printinfo() {
		System.out.println(" bei Wert " + reason);
	}
}

public class MyExTest {

	void m4(int i) throws MyException {

		if (i == 4)
			throw new MyException("MyException ", 4);

		// if (i == 4) throw new RuntimeException ("MyRunException");
	}

	public static void testf() {
		System.out.println("Export von statischer Fkt. in nicht exportierter KLasse");
	}

	public static void main(String[] args) throws MyException {

		MyExTest eto = new MyExTest();
		 eto.m4(4);
//		try {
//			eto.m4(4);
//		} catch (MyException e) {
//			e.printinfo();
//			// throw new RuntimeException();
//			// } catch (Exception e){
//
//		} finally {
//			System.out.println("finally");
//		}
	}
}
