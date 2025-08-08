package Day_2;

public class checkPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 29;
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
		    if (num % i == 0) {
		        isPrime = false;
		        break;
		    }
		}
		System.out.println(num + (isPrime ? " is Prime" : " is not Prime"));

	}

}
