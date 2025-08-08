package day_2_operatorAndConditional;

public class AtmPinCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int correctPIN = 1234;
	        int enteredPIN = 1111;
	        int attempt = 1;

	        do {
	            if (enteredPIN != correctPIN) {
	                System.out.println("Incorrect PIN");
	            }

	            attempt++;

	        } while (enteredPIN != correctPIN);

	}

}
