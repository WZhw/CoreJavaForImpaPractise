package ch01;

import java.util.Scanner;

public class Prac7ShortOperator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		short num1 = in.nextShort();
		short num2 = in.nextShort();
		short sum = (short) (num1 + num2);
		short diff = (short) (num1 - num2);
		short product = (short) (num1 * num2);
		short quio = (short) (num1 / num2);
		short remainder = (short) (num1 % num2);
		System.out.println("sum = " + Integer.toString(Short.toUnsignedInt(sum)));
		System.out.println("diff = " + Integer.toString(Short.toUnsignedInt(diff)));
		System.out.println("diff = " + Integer.toString(diff));
		System.out.println("product = " + Integer.toString(Short.toUnsignedInt(product)));
		System.out.println("quio = " + Integer.toString(Short.toUnsignedInt(quio)));
		System.out.println("remainder = " + Integer.toString(Short.toUnsignedInt(remainder)));
		in.close();
	} 
} 
