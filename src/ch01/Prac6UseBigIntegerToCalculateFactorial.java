package ch01;

import java.math.BigInteger;
import java.util.Scanner;

public class Prac6UseBigIntegerToCalculateFactorial {
	public static BigInteger Factorial(int n) {
		if (n < 0) {
			BigInteger results = new BigInteger("-1");
			return results;
		} else {
			BigInteger results = new BigInteger("1");
			for (int i = 1; i <= n; i++) {
				results = results.multiply(BigInteger.valueOf(i));
			}
			return results;
		}
	}

	public static void main(String[] args) {
		int n = 0;
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			n = in.nextInt();
			System.out.println("The Factorial value of " + Integer.toString(n) 
			+ " is " + Factorial(n).toString());
		}
		in.close();
	}
}
