package ch01;

import java.util.Scanner;

public class Prac14IsCube {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputLine = "";
		try {
			while(in.hasNextLine()) {
				inputLine = in.nextLine();
				if(inputLine.equals("".toString())) {
					continue;
				}
				else {
					String[] firstLine = inputLine.split("\\s+");
					int dimension = firstLine.length;
					int[][] cube = new int[dimension][dimension];
					for(int i = 0; i < dimension; i++) {
						cube[0][i] = Integer.parseInt(firstLine[i]);
					}
					for(int i = 1; i < dimension; i++) {
						inputLine = in.nextLine();
						String[] remainLine = inputLine.split("\\s+");
						for(int j = 0; j < dimension; j++) {
							cube[i][j] = Integer.parseInt(remainLine[j]);
						}
					}
					System.out.println(Boolean.toString(isMagicCube(cube, dimension)));
				}
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			in.close();
		}
	}
	
	public static boolean isMagicCube(int cube[][], int dimension) {
		int sum = 0;
		for(int i = 0; i < dimension; i++) {
			sum += cube[0][i];
		}
		for(int i = 0; i < dimension; i++) {
			int row_sum = 0;
			for(int iterator : cube[i]) {
				row_sum += iterator;
				//System.out.println("row_sum = " + Integer.toString(row_sum));
			}
			int col_sum = 0;
			for(int j = 0; j < dimension; j++) {
				col_sum += cube[j][i];
				//System.out.println("col_sum = " + Integer.toString(col_sum));
			}
			if(row_sum == sum && col_sum == sum) {
				
			}
			else {
				System.out.println("row_sum = " + Integer.toString(row_sum));
				System.out.println("col_sum = " + Integer.toString(col_sum));
				return false;
			}
		}
		int diagonal_sum = 0;
		for(int i = 0, j = 0; ((i < dimension) && (j < dimension)) ; i++, j++) {
			diagonal_sum += cube[i][j];
		}
		int other_diagonal_sum = 0;
		for(int i = 0, j = (dimension - 1); ((i < dimension) && (j >= 0)); i++, j--) {
			other_diagonal_sum += cube[i][j];
		}
		if(diagonal_sum == sum && other_diagonal_sum == sum) {
			return true;
		}
		else {
			System.out.println("diagonal_sum = " + Integer.toString(diagonal_sum));
			System.out.println("other_diagonal_sum = " + Integer.toString(other_diagonal_sum));
			return false;
		}
	}
}
