package exceptionPackage;

public class RTErrorProg3 {
	public static void main(String[] args) { 
		int i, base = 0; 
 		try { 
			for (base = 10; base >= 2; --base) { 
				 i = Integer.parseInt("40",base); 
 				System.out.println("40 base "+base+" = "+i); 
			} 
 		}  catch (NumberFormatException e) { 
			System.out.println("***Fehler aufgetreten***");
			System.out.println("Ursache: "+e.getMessage());
			e.printStackTrace(); 
		} catch (Exception e) {
 			//ignore
 		}
 		for (int j = 0; j < 1000000; j++);
 		System.out.println("*** END ***");
	}
}