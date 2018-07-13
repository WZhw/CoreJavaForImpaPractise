package ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac15YanghuiTriangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputLine = "";
		try {
			while(in.hasNextLine()) {
				inputLine = in.nextLine();
				int n = Integer.parseInt(inputLine);
				ArrayList<ArrayList<Integer>> YanghuiTriangle = new ArrayList<ArrayList<Integer>>();
				for(int i = 0; i < n; i++) {
					ArrayList<Integer> 
					YanghuiTriangle.add(ArrayList<Integer>);
				}
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			in.close();
		}
	}
}
