package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("Hi");
		array.add("Hey");
		array.add("Sup");
		array.add("Howdy");
		array.add("Hello");
		//3. Print all the Strings using a standard for-loop
		for (int x = 0; x<5; x++) {
			System.out.println(array.get(x));
		}
		//4. Print all the Strings using a for-each loop
		for (String string : array) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		for (int y = 0; y<5; y= y+2) {System.out.println(array.get(y));}
		//6. Print all the Strings in reverse order.
		for (int z = 5; z>0; z--) {
			System.out.println(array.get(z));
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
