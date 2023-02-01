package Exception;

public class ExceptionThree {

	public static void main(String[] args) {
		
		try {
			int i = 20 / 0;
			System.out.println(i);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Always Gets Executed");
		}
		System.out.println("Maintaining The Flow Of The Application");
	}

}
