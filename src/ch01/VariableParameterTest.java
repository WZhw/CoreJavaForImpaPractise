package ch01;

public class VariableParameterTest {
	public static double average(double... inputArray) {
		double sum = 0;
		for(double iterator : inputArray) {
			sum += iterator;
		}
		return inputArray.length == 0 ? 0 : sum / inputArray.length;
	}
	public static double max(double first, double... rest) {
		double maxDouble = first;
		for(double iterator : rest) {
			maxDouble = Math.max(maxDouble, iterator);
		}
		return maxDouble;
	}
	public static void main(String[] args) {
		double[] inputDouble = new double[args.length];
		for(int i = 0; i < args.length; i++) {
			inputDouble[i] = Double.parseDouble(args[i]);
		}
		System.out.println(average(inputDouble));
		System.out.println(max(13.0, inputDouble));
	}
}
