package exceptionPackage;

public class NullPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = null;
		try {
			o.toString();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Programm behandelt Null Pointer Exception selbst");
			System.out.println("--> setzt Programmausführung dann fort");
		}

	}

}
