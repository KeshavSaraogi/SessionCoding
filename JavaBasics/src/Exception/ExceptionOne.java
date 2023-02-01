package Exception;

public class ExceptionOne {

	public static void main(String[] args) {
		
		try {
			int i = 20;
			i = 20 / 0;
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println(" ");
		}
		
		System.out.println("Welcome");
		
	}

}
