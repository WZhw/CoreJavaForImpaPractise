package ch01;

import java.util.Scanner;

public class Prac9StringEqualsOrNot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] whiteList = {"qwer", "aqa", "hahaha"};
		String inputLine = "";
		try {
			while (in.hasNextLine()) {
				inputLine = in.nextLine();
				String[] splitSpace = inputLine.split("\\s+");
				for (String iterator : splitSpace) {
					System.out.print(iterator + " ");
					for(String whiteListString : whiteList) {
						if(whiteListString.equals(iterator)) {
							System.out.print(
									Boolean.toString(iterator != whiteListString) + " ");
						}
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			in.close();
		}
	}
}
