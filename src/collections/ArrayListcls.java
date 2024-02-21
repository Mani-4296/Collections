package collections;

import java.util.ArrayList;

public class ArrayListcls {

	public static void main(String[] args) {

		// creating ArrayList with String datatypee
		ArrayList<String> list = new ArrayList<String>();
		// adding items to the array list
		list.add("Manikandan");
		list.add("Mani");
		list.add("V Manikandan");
		// printing the initial arraylist
		System.out.println("The original arraylist is: " + list);
		// this will all the items in the list
		list.removeAll(list);
		System.out.println("Update arraylist is: " + list);
	}

}
