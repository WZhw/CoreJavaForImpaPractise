package ch01;

import java.util.Scanner;

public class Prac16ImproveAverage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputLine = new String();
		try {
			while(in.hasNextLine()) {
				inputLine = in.nextLine();
				String[] inputArrayString = inputLine.split("\\s+");
				int[] inputArray = new int[inputArrayString.length]; 
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			in.close();
		}
	}
}
