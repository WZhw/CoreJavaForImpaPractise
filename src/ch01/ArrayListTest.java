package ch01;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> friends;
		friends = new ArrayList<>();
		friends.add("Peter");
		friends.add("Paul");
		System.out.println("Origin ArrayList:");
		for(int i = 0; i < friends.size(); i++) {
			System.out.print(friends.get(i) + " ");
		}
		System.out.println("");
		friends.remove(1);
		System.out.println("friends.remove(1):");
		for(int i = 0; i < friends.size(); i++) {
			System.out.print(friends.get(i) + " ");
		}
		System.out.println("");
		friends.add(0, "Paul");
		System.out.println("friends.add(0, \"Paul\")");
		for(int i = 0; i < friends.size(); i++) {
			System.out.print(friends.get(i) + " ");
		}
		System.out.println("");
		friends.set(1, "Mary");
		System.out.println("friends.set(1, \"Mary\"):");
		for(int i = 0; i < friends.size(); i++) {
			System.out.print(friends.get(i) + " ");
		}
		System.out.println("");
	}
}
