package ch01;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> friends;
		friends = new ArrayList<>();
		
		friends.add("Peter");
		friends.add("Paul");
		System.out.println("Origin ArrayList:");
		/***
		for(int i = 0; i < friends.size(); i++) {
			System.out.print(friends.get(i) + " ");
		}
		System.out.println("");
		***/
		System.out.println(friends.toString());

		
		friends.remove(1);
		System.out.println("friends.remove(1):");
		System.out.println(friends.toString());
		
		friends.add(0, "Paul");
		System.out.println("friends.add(0, \"Paul\")");
		System.out.println(friends.toString());
		
		friends.set(1, "Mary");
		System.out.println("friends.set(1, \"Mary\"):");
		System.out.println(friends.toString());
		
		int[] numbers = {2, 3, 4, 5, 6};
		int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length - 3);
		
		System.out.println("numbers: ");
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("copiedNumbers: ");
		System.out.println(Arrays.toString(copiedNumbers));
		
		ArrayList<String> friends2 = new ArrayList<>(Arrays.asList("Peter", 
				"Paul", "Mary"));
		String[] namesArray = friends2.toArray(new String[0]);
		ArrayList<String> namesArrayList = friends2;
		
		System.out.println("friends2: ");
		System.out.println(friends2.toString());
		
		System.out.println("names" + ": ");
		System.out.println(Arrays.toString(namesArray));
		for(int i = 0; i < namesArray.length; i++) {
			System.out.print(namesArray[i] + " ");
		}
		System.out.println("");
		System.out.println(namesArray);
		System.out.println("");
		System.out.println("namesArrayList: ");
		System.out.println(namesArrayList.toString());
	}
}
