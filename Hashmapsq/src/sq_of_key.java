import java.util.*;
public class sq_of_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> square = new HashMap<Integer, Integer>();			// Creating an empty HashMap

		for(int i=1;i<=15;i++) {
			square.put(i, i*i);
		}

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + square);

		// Using values() to get the set view of values
		System.out.println("The collection is: " + square.values());
	}

}
