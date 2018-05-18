package ch01;

import java.util.Scanner;

public class Prac8SplitStringUseRegularExperssion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputLine = "";
		try {
			while (in.hasNextLine()) {
				inputLine = in.nextLine();
				String[] splitSpace = inputLine.split("\\s+");
				for (String iterator : splitSpace) {
					System.out.print(iterator + " ");
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
