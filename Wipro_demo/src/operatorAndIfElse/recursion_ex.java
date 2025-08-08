package operatorAndIfElse;

import java.util.*;
public class recursion_ex {
	
	void recursion(long i) {
		
		if(i==0)return;
		recursion(i-1);
		System.out.println(i);
		return;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursion_ex obj = new recursion_ex();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n = sc.nextLong();
		obj.recursion(n);
	}

}
