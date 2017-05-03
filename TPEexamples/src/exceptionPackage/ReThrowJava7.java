package exceptionPackage;



public class ReThrowJava7 {
	
	public void doWork() throws SomeSpecificException{
		throw new SomeSpecificException();
	}
	
	public void someMethodOld () throws SomeSpecificException { 
      
        try { 
            doWork();  // might throw SomeSpecificException 
        } catch (Throwable ex) { 
            // some cleanup activity 
            throw ex;    // error 
        } 
    } 
//_______________________________________________________________________ 
//unreported exception Throwable; must be caught or declared to be thrown 
//            throw ex; 
//            ^
//In Java 7 werden die Compilerprüfungen dahingehend geändert, dass der Compiler beim Rethrow nicht mehr die statische Typinformation der gefangenen Exception zugrunde legt, sondern davon ausgeht, dass lediglich die Exception-Typen beim Rethrow vorkommen können, die in dem try -Block geworfen werden können.  Das sieht dann so aus:
   
	
	public void someMethodNew () throws SomeSpecificException { 
      
        try { 
            doWork();  // might throw SomeSpecificException 
        } catch (Throwable ex) { 
            // some cleanup activity 
            throw ex;     // fine 
        } 
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
