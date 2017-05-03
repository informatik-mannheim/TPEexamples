package exceptionPackage;
import java.lang.Math.*;
import linkedlist.LinkedList;
import java.io.*;


class ExportTest {
	public static void testf () {
		System.out.println("Export von statischer Fkt. in nicht exportierter KLasse");
	}
}

class RE1 extends RuntimeException {
	// benutzerdefinierte Runtime Exception
	RE1 (String s){
		super(s);
		System.out.print(s);
	}
}

class E1 extends Exception {
	E1 (String s) {
		super(s);
		System.out.print(s);
	}
}
class E2 extends Exception {}

class E11 extends E1{
	
	E11 (String s){
		super (s);
		System.out.print("Fehler E1");
	}
	
}

class E22 extends Exception{
	
	E22 (String s){
		super (s);
		System.out.print("Fehler E1");
	}
	
}

public class ExTest {
	
	  void m1() {
		  try {
			  m2(3);
		  } catch (E1 e) {System.out.println("E1 in m1");
		  } catch (E2 e) {System.out.println("E2 in m1");
		  } catch (RE1 re) {System.out.println("RE1 in m1"); }
	  }
	  
	  void m2(int i) throws E1, E2 {
		  m3(i);
	  }
	  
	  void m3(int i) throws E1, E2 {
		  try {
			 if (i == 3)
				 throw new E1("abc");
			 else throw new E2();
		  } catch (E2 e) {System.out.println("E2 in m3");}
		  System.out.println ("nach try in m3");
		throw new RE1("abc");  // Runtime Exceptions müssen nicht abgefangen werden
	  }	
	  
	  
	  void m4 (int i) throws MyException {
		  if (i == 4) throw new MyException ("MyException", 4);
	  }
	  
		public static void testf () {
			System.out.println("Export von statischer Fkt. in nicht exportierter KLasse");
		}

	  
	  public static void main(String[] args)  {
		  
		  ExTest eto = new ExTest2();
		  ExTest2 et2o = new ExTest2();
		  try {
			  eto.m3(5);
		  } catch (E1 e) { System.out.println(e.toString());
		  } catch (E2 e) { System.out.println(e.toString());
		  }
		  
		  et2o.m3(1);
//		  eto.m3(2);
		  
		  try { // weil Konstruktor eine exception wirft
			  ExTest11 eo11 = new ExTest11();
		  } catch (Exception e) {}
		  
		  try {
			  eto.m4(4);
		  } catch (MyException e) {
			  e.printinfo();
		  }
		  
		  int i = 3, j = 7;
		  System.out.print("i= " +(i+j)+", ");
		  String s = i+""+i+j;
		  System.out.print("s= " +s);

		  
	  }


}

class ExTest2 extends ExTest {
	void m3 (int i) {}//throws E11 {throw new E11("a");}
	// das funtioniert, da E11 E1 spezialisiert
	// E22 würde nicht funktionieren.
}

class ExTest1  {
	
	int i = 5;
	
	public void m () throws E1 {
		
	}
	
	// Konstruktor wirft eine Ausnahme
	
	ExTest1 () throws FileNotFoundException {
		super();
		throw new FileNotFoundException ();
	}
	
}

class ExTest11 extends ExTest1 {
	
	ExTest11 () throws Exception{
		
//  Das folgende funktioniert nicht, weil der super-Aufruf das erste
//  Statment sein muss. Und das ist er nicht - sondern try!
//  Die Ausnahme des Oberklassenkonstruktors kann hier nicht be-
//  handelt werden. Sie muss weitergereicht werden!		
//		try {
//			super();
//		} catch (FileNotFoundException e) {}
		
		
	}
	
	public void m () throws E1{
		try {
			if (i == 4)
				throw new E2();
			else
				throw new E1("2");
		} catch (E11 e){}
		  catch (E2 e){}
	
		
	}
	
}
