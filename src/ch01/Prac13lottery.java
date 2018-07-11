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
					lotteryArray[i] = 1;
				}
				displaylottery(lotteryArray);
				while(lotteryArray[0] > 0) {
					int remainToClear = 7;
					while( remainToClear > 0) {
						int clearIndex = seed.nextInt() % 50;
						clearIndex = (clearIndex >= 0) ? (clearIndex) : (clearIndex + 50);
						if(lotteryArray[clearIndex] == 0 | clearIndex == 0) {
							continue;
						}
						else {
							lotteryArray[clearIndex] = 0;
							remainToClear--;
						}
					}
					displaylottery(lotteryArray);
					lotteryArray[0]--;
				}
				displaylottery(lotteryArray);
			}
		}catch(Exception e) {
			System.out.println(e.toString());
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
				else {
					System.out.print(Integer.toString(i) + " ");
				}
			}
			System.out.println("num : " + Integer.toString(num));
		}
		else if (lotteryArraySample[0] == 0) {
			for(int i = 0; i < lotteryArraySample.length; i++) {
				if(lotteryArraySample[i] != 0) {
					System.out.print(Integer.toString(i) + " ");
				}
			}
			System.out.println("");
		}
		else {
			
		}
	}
}
