package day_2_operatorAndConditional;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10, b = 5;

	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));
	        System.out.println("a % b = " + (a % b));

	        System.out.println("\nRelational Operators:");
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a == b: " + (a == b));
	        System.out.println("a != b: " + (a != b));

	        // Logical Operators
	        System.out.println("\nLogical Operators:");
	        boolean x = true, y = false;
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));        

	        System.out.println("\nAssignment Operators:");
	        int c = a;
	        c += b;
	        System.out.println("c =  " + c);
	        c *= 2;
	        System.out.println("c = " + c);
	}

}
