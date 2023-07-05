package madmax;

import java.util.*;

public class Basics {
	
	public static void main(String[] args) {
//		Array
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
//	    set
	    HashSet<String> cars1 = new HashSet<String>();
	    cars1.add("Volvo");
	    cars1.add("BMW");
	    cars1.add("Ford");
	    cars1.add("BMW");
	    cars1.add("Mazda");
	    System.out.println(cars1);


//	    Map
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("India", "Delhi");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.get("USA"));
	}
}
