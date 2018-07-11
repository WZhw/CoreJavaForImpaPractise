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
						cube[0][1] = Integer.parseInt(firstLine[i]);
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
			}
			int col_sum = 0;
			for(int j = 0; j < dimension; j++) {
				col_sum += cube[j][i];
			}
			if(row_sum == sum && col_sum == sum) {
				
			}
			else {
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
			return false;
		}
	}
}
