package collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapEmp {

	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first employee id and name: ");
		int id = input.nextInt();
		String name = input.nextLine();
		System.out.println("Enter the Second employee id and name: ");
		int id2 = input.nextInt();
		String name2 = input.nextLine();
		System.out.println("Enter the third employee id and name: ");
		int id3 = input.nextInt();
		String name3 = input.nextLine();
		input.close();
		// Create a TreeMap to store employee ids and names
		TreeMap<Integer, String> emp = new TreeMap<Integer, String>();
		emp.put(id, name);
		emp.put(id2, name2);
		emp.put(id3, name3);

		// Create a final reference to the TreeMap to access it inside the Comparator
		final TreeMap<Integer, String> finalEmp = emp;
		// Create a new TreeMap to store sorted employee ids and names
		TreeMap<Integer, String> sortedemp = new TreeMap<Integer, String>(new Comparator<Integer>() {
			// Define a custom Comparator to sort the TreeMap by employee names
			public int compare(Integer id1, Integer id2) {
				String name1 = finalEmp.get(id1);
				String name2 = finalEmp.get(id2);
				return name1.compareTo(name2);
			}
		});
		sortedemp.putAll(emp); // Copy the contents of the original TreeMap to the sorted TreeMap

		System.out.println("Here is employee names in alphabetical order: ");
		for (String names : sortedemp.values()) {
			System.out.println(names);
		}

	}

}
