package TreeSet_Ex;
import java.util.TreeSet;

public class TreeSet_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Priyanshi");
		names.add("Aryan");
		names.add("Arti");
		
		System.out.println(names);
		System.out.println(names.descendingSet());
	}

}
