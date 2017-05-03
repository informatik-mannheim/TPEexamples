package exceptionPackage;

public class LV150513 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3 };
		try {
			System.out.println(a[3]);
			System.out.println(a[2]);

		} catch (ArrayIndexOutOfBoundsException e) { 
			e.printStackTrace();
		} catch (Exception e)  {
			
		}
		System.out.println("Es geht normal weiter!");
	}
}
