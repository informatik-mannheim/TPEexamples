package exceptionPackage;

public class RTErrorProg2 {
	public static void main(String[] args) { 
		int i, base = 0;
		Object o = null;
 		 
			for (base = 10; base >= 2; --base)
			try { 
				i = Integer.parseInt("40", base);
 				System.out.println("40 base "+base+" = "+i);
			} catch (NumberFormatException e) { 
 			System.out.println("40 ist keine Zahl zur Basis "+base); 
//		} catch (Exception e) {
//			//ignore
		}
		
	} 
} 