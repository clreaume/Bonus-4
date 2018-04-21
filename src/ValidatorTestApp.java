import java.util.Scanner;


public class ValidatorTestApp {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyValidator.getInt(scan, "Enter an integer: ");
		
		MyValidator.getIntWithinRange(scan, "Enter a number between 1 and 10 (inclusive): ", 1, 10);
		
		MyValidator.getDouble(scan, "Enter a double: ");
		
		MyValidator.getDoubleWithinRange(scan, "Enter a double between 0.0 and 10.0 (inclusive): ", 0.0, 10.0);
		
		MyValidator.getRequiredString(scan, "Enter the string 'Hello': ");
		
		MyValidator.getChoiceString(scan, "Enter yes or no: ", "yes", "no");
		
		


	}

}
