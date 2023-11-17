package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//#1 Read the numbers 
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matrix = new int[m][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		//#2 Find the positions of number 
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					System.out.println("Position " + i + "," + j);
					
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}
					if (j < n - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
					if (i < m - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
				}
				
			}
		}
		
		System.out.println("Have a good day!");
		sc.close();

	}
	
	
}
