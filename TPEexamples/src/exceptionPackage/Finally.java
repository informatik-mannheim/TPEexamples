package exceptionPackage;

import java.io.FileNotFoundException;

class Ex extends Exception {
	
}

class Ex1 extends Error {
	
}
public class Finally {
	
	public static void m1 () throws Ex {
		
	}
	
//	@SuppressWarnings("finally")
	public static int f() {
		try {
			m1();
			return 0;
		} catch (Ex e) {
			return 1;
		} catch (Error e) {
			return 1;
		}
			finally {
			return 2;
		}
//		return 3;
	}

	public static void thrower() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		System.out.println(f());

		try {
			try {
				System.out.print("A");
				thrower();
				System.out.print("B");
				return;
			} catch (FileNotFoundException ex) {
				System.out.print("C");
			} finally {
				System.out.print("D");
			}
			System.out.print("E");
			return;
		} finally {
			System.out.print("F");
		}
	}
}
