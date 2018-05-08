package ch01;

import java.util.Arrays;

public class Prac3MaxFunction {
	
	public static int myMax(int... inputIntArray) {
		int max = Integer.MIN_VALUE;
		for(int iterator : inputIntArray) {
			max = max > iterator ? max : iterator;
		}
		return max;
	}
	
	public static int useMathMax(int... inputIntArray) {
		int max = Integer.MIN_VALUE;
		for(int iterator : inputIntArray) {
			max = Math.max(max, iterator);
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] inputArray = new int[args.length];
		for(int i = 0; i < args.length; i++) {
			inputArray[i] = Integer.parseInt(args[i]);
		}
		System.out.println("Input: ");
		System.out.println(Arrays.toString(inputArray));
		System.out.println("MyMax: " + Integer.toString(myMax(inputArray)));
		System.out.println("Math.max(): " + Integer.toString(useMathMax(inputArray)));
	}
}
