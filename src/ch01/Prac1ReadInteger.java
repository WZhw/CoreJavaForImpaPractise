package ch01;
import java.util.*;

public class Prac1ReadInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputLine = "";
		while(in.hasNextLine()) {
			inputLine = in.nextLine();
			int originInteger = Integer.parseInt(inputLine);
			//int binaryInteger = Integer.parseInt(inputLine, 2);
			//int octalInteger = Integer.parseInt(inputLine, 8);
			//int hexInteger = Integer.parseInt(inputLine, 16);
			float Reciprocal = (float) 1.0 / originInteger;
			float hexfloatReciprocal = Float.floatToIntBits(Reciprocal);
			System.out.print(Integer.toBinaryString(originInteger));
			System.out.print(" ");
			System.out.print(Integer.toOctalString(originInteger));
			System.out.print(" ");
			System.out.print(Integer.toHexString(originInteger));
			System.out.print(" ");
			System.out.print(Float.toString(Reciprocal));
			System.out.print(" ");
			System.out.print(Float.toHexString(hexfloatReciprocal));
			System.out.print(" ");
			System.out.println();
		}
		in.close();
	}
}