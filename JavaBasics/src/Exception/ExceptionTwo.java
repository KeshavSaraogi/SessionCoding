package Exception;

public class ExceptionTwo {

	public static void main(String[] args) {
		int i = 5;
		String s = null;
		try {
			System.out.println(s.length());
			i = i / 10;
			System.out.println(i);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		//always the super-class exception will be at the end
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
