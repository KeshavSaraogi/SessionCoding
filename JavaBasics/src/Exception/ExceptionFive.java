package Exception;

public class ExceptionFive {
	
	public static void main (String[] args) {
		ExceptionFive ef = new ExceptionFive();
		
		try {
			ef.ageValidation(20);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
	
	public void ageValidation(int age) throws InvalidAgeException {
		if (age < 80) {
			throw new InvalidAgeException("Ineligible Age To Vote");
		}
		else {
			System.out.println("Eligible To Vote");
		}
	}

}
