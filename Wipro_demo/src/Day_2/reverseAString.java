package Day_2;

public class reverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
		    reversed += str.charAt(i);
		}
		System.out.println("Reversed: " + reversed);

	}

}
