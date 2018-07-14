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
					YanghuiTriangle.add(new ArrayList<Integer>());
					for(int j = 0; j < i + 1; j++) {
						YanghuiTriangle.get(i).add(1);
					}
				}
				for(int i = 0; i < n; i++) {
					YanghuiTriangle.get(i).set(0, 1);
					YanghuiTriangle.get(i).set(i, 1);
					for(int j = 1; j < i; j++) {
						int value_of_ij = YanghuiTriangle.get(i-1).get(j-1) + YanghuiTriangle.get(i-1).get(j);
						YanghuiTriangle.get(i).set(j, value_of_ij);
					}
				}
				System.out.printf("The %d order Yanghui Triangle is: \n", n);
				displayDoubleTriangle(YanghuiTriangle);
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			in.close();
		}
	}
	
	public static <E> void displayDoubleTriangle(ArrayList<ArrayList<E>> doubleArrayList) {
		for(int i = 0; i < doubleArrayList.size(); i++) {
			for(int j = 0; j < doubleArrayList.get(i).size(); j++) {
				System.out.print(doubleArrayList.get(i).get(j).toString() + " ");
			}
			System.out.println("");
		}
	}
}
