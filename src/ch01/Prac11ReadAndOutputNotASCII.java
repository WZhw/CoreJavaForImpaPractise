package ch01;

import java.util.Scanner;

public class Prac11ReadAndOutputNotASCII {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputLine = "";
		try {
			while(in.hasNextLine()) {
				inputLine = in.nextLine();
				String outputLine = "";
				int[] codePoints = inputLine.codePoints().toArray();
				for(int i = 0; i < codePoints.length; i++) {
					if( codePoints[i] > 255 ) {
						char c = inputLine.charAt(i);
						System.out.println(Character.toString(c) + " : " 
						+ Integer.toString(codePoints[i]));
					}
				}
			}
		} catch(Exception e) {	
		} finally {
			in.close();
		}
	}
}
