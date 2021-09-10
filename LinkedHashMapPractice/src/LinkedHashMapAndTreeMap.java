import java.util.*;
public class LinkedHashMapAndTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		sortedMaps(treeMap); // replace treeMap with linkedHashMap to for LinkedHashMap and vice versa
	}

	public static void sortedMaps(Map<Integer, String> map) {

		map.put(4, "ice cream");
		map.put(8, "pie");
		map.put(0, "pizza");
		map.put(2, "hamburger");
		map.put(12, "fries");
		map.put(27, "hot dog");

		for (Integer numbers : map.keySet()) {

			String food = map.get(numbers);

			System.out.println(numbers + ": " + food);
		}

	}

	

}
