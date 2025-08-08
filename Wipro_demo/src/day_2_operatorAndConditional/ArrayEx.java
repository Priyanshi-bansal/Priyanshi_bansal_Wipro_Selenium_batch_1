package day_2_operatorAndConditional;
import java.util.Scanner;
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      String [] arr = new String[5];
      for(int i=0;i<arr.length;i++) {
    	  arr[i] = sc.next();
    	  
      }
      for(String num: arr) {
    	  System.out.println(num); 
      }
     
	}

}
