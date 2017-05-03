package exceptionPackage;

public class RTErrorProg4 {
	public static void main(String[] args) throws MyEx{ 
 		
// 		try {
// 			MyCl o = new MyCl();
// 			o.m();
// 		} catch (MyEx e) {
// 			System.out.println("Throwable works");
// 		}
 		new MyCl().m();
	}
}

class MyEx extends Exception {	
}

class MyCl {
	public void m() throws MyEx {
		throw new MyEx();
	}
	
	public void m2() {
		throw new MyEx();
	}
}
