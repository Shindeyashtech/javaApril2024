package exception;

public class Ex {
	
	public static void main (String args []) {
		
		try {
			
			int data = 50/0;
			
		}
		catch (ArithmeticException e) {
			
			System.out.println(e);
		}
		
		
		System.out.println("oro");
	}
	
	

}
