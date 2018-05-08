package ch01;

import java.util.Scanner;

public class Prac2ModOperation {
	public static final int DIVISOR = 359;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = "";
		try {
			while(input.hasNextLine()) {
				inputLine = input.nextLine();
				int origin_n = Integer.parseInt(inputLine);
				int mod_n = origin_n % DIVISOR;
				mod_n = mod_n < 0 ? (mod_n + 359) : mod_n;
				int mod_n_use_floorMod = Math.floorMod(origin_n, DIVISOR);
				System.out.println("mod_n: " + Integer.toString(mod_n));
				System.out.println("mod_n_use_floorMod: " + Integer.toString(mod_n_use_floorMod));
			}
		}
		catch(Exception e) {
		}
		finally {
			input.close();
		}
	}
}
