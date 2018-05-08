package ch01;

public class Prac3MaxFunction {
	public static int MyMax(int... inputIntArray) {
		int max = Integer.MIN_VALUE;
		for(int iterator : inputIntArray) {
			max = max > iterator ? max : iterator;
		}
		return max;
	}
	public static void main(String[] args) {
		int[] inputArray = new int[args.length];
	}
}
