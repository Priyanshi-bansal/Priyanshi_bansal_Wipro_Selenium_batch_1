package TreeMap_ex;
import java.util.*;

public class TreeMap_Imp {
    public static void main(String[] args) {
    	System.out.println("\n----- TreeMap Example -----");
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // put()
        treeMap.put("Papaya", 50);
        treeMap.put("Apple", 100);
        treeMap.put("Banana", 60);
        treeMap.put("Mango", 120);

        // put() again (update)
        treeMap.put("Mango", 125);

        // get()
        System.out.println("Price of Banana: " + treeMap.get("Banana"));

        // remove()
        treeMap.remove("Papaya");

        // containsKey() / containsValue()
        System.out.println("Contains 'Mango'? " + treeMap.containsKey("Mango"));
        System.out.println("Contains price 60? " + treeMap.containsValue(60));

        // firstKey(), lastKey()
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        // higherKey(), lowerKey()
        System.out.println("Higher than Banana: " + treeMap.higherKey("Banana"));
        System.out.println("Lower than Mango: " + treeMap.lowerKey("Mango"));

        // ceilingKey(), floorKey()
        System.out.println("Ceiling key of 'Banana': " + treeMap.ceilingKey("Banana"));
        System.out.println("Floor key of 'Banana': " + treeMap.floorKey("Banana"));

        // descendingMap()
        System.out.println("Descending order: " + treeMap.descendingMap());

        // keySet()
        System.out.println("Keys: " + treeMap.keySet());

        // values()
        System.out.println("Values: " + treeMap.values());

        // entrySet()
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => ₹" + entry.getValue());
        }

        // clear()
        treeMap.clear();
        System.out.println("After clear, isEmpty: " + treeMap.isEmpty());
    }
}
