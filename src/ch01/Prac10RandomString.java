package ch01;

import java.util.Random;
import java.util.Scanner;

public class Prac10RandomString {
	
	public static long getRandomLong(long longSeed) {
		Random seed = new Random(longSeed);
		return seed.nextLong();
	}
	
	public static void main(String[] args) {
		String alphabetString = "abcdefghijklmnopqrstuvwxyz0123456789";
		Scanner in = new Scanner(System.in);
		try {
			while(in.hasNextLine()) {
				String inputLine = in.nextLine();
				StringBuffer originlineStringBuffer = new StringBuffer();
				StringBuffer randomlineStringBuffer = new StringBuffer();
				String[] numberString = inputLine.split("\\s+"); 
				for(String iterator : numberString) {
					long originLong = Long.parseLong(iterator);
					long randomLong = getRandomLong(originLong);
					long originCharPos = Math.floorMod(originLong, 36);
					long randomCharPos = Math.floorMod(randomLong, 36);
					originlineStringBuffer.append(alphabetString.charAt((int)originCharPos));
					randomlineStringBuffer.append(alphabetString.charAt((int)randomCharPos));
				}
				System.out.println(originlineStringBuffer.toString() + "    " + 
				    randomlineStringBuffer.toString());
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			in.close();
		}
	}
}
