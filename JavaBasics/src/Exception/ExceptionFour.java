package Exception;

public class ExceptionFour {

	public static void main(String[] args) {
		
		int i  = 5;
		
		try {
			if (i == 5) {
				throw new ArithmeticException("Invalid Number");
			}
			else {
				System.out.println("Valid Number");
			}
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		} 
		
		System.out.println("Maintaining The Flow Of The Application");
	}
}
