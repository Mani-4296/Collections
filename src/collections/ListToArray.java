package collections;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating list and adding elements to the list
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Milk");
		list1.add("Egg");
		list1.add("burger");
		// printing the list elements
		System.out.println("This list contains: " + list1);
		// converting list to array
		String[] array = list1.toArray(new String[0]);
		for (String str : array) {
			// printing as array elements
			System.out.println("This array contains: " + str + " ");
		}
	}

}
