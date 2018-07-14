package ch01;

import java.util.Arrays;
import java.util.Scanner;

public class Prac16ImproveAverage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputLine = new String();
		try {
			while(in.hasNextLine()) {
				inputLine = in.nextLine();
				String[] inputArrayString = inputLine.split("\\s+");
				if(inputArrayString.length > 0) {
					double[] inputArray = new double[inputArrayString.length];
					for(int i = 0; i < inputArray.length; i++) {
						inputArray[i] = Double.parseDouble(inputArrayString[i]);
					}
					double first = inputArray[0];
					double[] rest = Arrays.copyOfRange(inputArray, 1, inputArray.length);
					System.out.println(average(first, rest));
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			in.close();
		}
	}
	public static double average(double first, double... rest){
		double sum = first;
		for(double r : rest) {
			sum += r;
		}
		return sum / (rest.length + 1);
	}
}
