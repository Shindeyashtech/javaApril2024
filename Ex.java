

public class Ex {
	
	public static void main (String args []) {
		
		try {
			
			//int data = 50/0;
			//int a[]= new int [5];
			//a[5]=30/0;
			//System.out.println(a[10]);
			Integer[] a = new Integer[5];
			a[0] = null; // Setting an array element to null
            int length = a[0].intValue();
			
		}
		catch (ArithmeticException e) {
			
			System.out.println(e);
		}
catch  ( NullPointerException  e) {
			
			System.out.println(e);
		}
catch ( ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
catch (Exception e) {
			
			System.out.println(e);
		}
		System.out.println("oro");
	}
	
	

}
