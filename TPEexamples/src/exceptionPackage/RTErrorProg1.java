package exceptionPackage;

public class RTErrorProg1 {
	public static void main(String[] args) {

//		int i, base = 0;
//		for (base = 10; base >= 2; --base) {
//			try {
//				i = Integer.parseInt("50", base);
//				System.out.println("50 base " + base + " = " + i);
//			} catch (NumberFormatException e) {
//				// e.printStackTrace();
//				// e.getMessage();
//				System.out.println("Mist!!");
//
//			}
//		}
//
//		System.out.println("*** END ***");
		
		int [] array = {1,2,3};
		
		try {
		for (int i = 0; i <= 3; i++) System.out.println(array[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Pass auf beim Array-Index !!!");
		}
		
		System.out.println("*** END ***");


	}
}
