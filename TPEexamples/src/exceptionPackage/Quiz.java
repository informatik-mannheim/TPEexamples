package exceptionPackage;

import java.io.FileNotFoundException;

public class Quiz {
	
	public static void thrower () throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	
	public static char foo () {
		
		char erg = 'Y';
		MyCl o1 =null;

		
		try {
			try {
				System.out.print("AA");
				thrower();
				System.out.print("C");
				return erg;
			} catch (FileNotFoundException ex) {
				System.out.print("E");
				o1.m();
			} finally {
				System.out.print("D");
				o1.m();
			}
//			System.out.print("G");
//			return erg;
		} finally {
			
			o1.m2();
			return 'X';
//			erg = 'X';
			

		}	
	}
	
	public static int foo1 () {
		MyCl o1 =null;

		try {
			o1.m();
		} catch (RuntimeException e)
		{}
//		finally {
//			return 7;
//		}
		
	}
	
	public static void main(String[] args) {
		
//		System.out.println(foo());
		System.out.println(foo1());

	}

}
