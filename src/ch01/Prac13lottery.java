package ch01;

import java.util.Random;
import java.util.Scanner;

public class Prac13lottery {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputLine = "";
		try {
			while(in.hasNextLine()) {
				inputLine = in.nextLine();
				Random seed = new Random(Long.parseLong(inputLine));
				int[] lotteryArray = new int[50];
				lotteryArray[0] = 6;
				for(int i = 1; i < lotteryArray.length; i++) {
					lotteryArray[i] = seed.nextInt(1000000) % 50;
				}
				displaylottery(lotteryArray);
				while(lotteryArray[0] > 0) {
					for(int i = 0; i < 6; i++) {
						
					}
				}
			}
		}catch(Exception e) {
		}finally {
			in.close();
		}
	}
	public static void displaylottery(int[] lotteryArraySample) {
		if(lotteryArraySample[0] != 0) {
			int num = 0;
			for(int i = 0; i < lotteryArraySample.length; i++) {
				if(lotteryArraySample[i] == 0) {
					num++;
				}
				System.out.print(Integer.toString(lotteryArraySample[i]) + " ");
			}
			System.out.println("");
		}
		else if (lotteryArraySample[0] == 0) {
			for(int i = 0; i < lotteryArraySample.length; i++) {
				if(lotteryArraySample[i] != 0) {
					System.out.print(Integer.toString(lotteryArraySample[i]) + " ");
				}
			}
			System.out.println("");
		}
		else {
			
		}
	}
}
