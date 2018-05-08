package ch01;

import java.util.Scanner;

public class Prac5ParseDoubleToInt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String inputLine = "";
	    double origin_double = 0.0;
	    int trans_int = 0; 
	    double max_double = Double.MAX_VALUE;
	    int max_trans_int = 0;
	    try {
	    	while(in.hasNextLine()) {
	    		inputLine = in.nextLine();
	    		origin_double = Double.parseDouble(inputLine);
	    		trans_int = (int) origin_double;
	    		max_trans_int = (int) max_double;
	    		System.out.println("origin_double = " + Double.toString(origin_double));
	    		System.out.println("trans_int = " + Integer.toString(trans_int));
	    		System.out.println("max_trans_int = " + Integer.toString(max_trans_int));
	    	}
	    }
	    catch(Exception e) {
	    }
	    finally {
	    	in.close();
	    }
	}
}
