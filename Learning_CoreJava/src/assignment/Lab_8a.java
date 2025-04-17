package assignment;

import java.util.Scanner;


public class Lab_8a {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		System.out.println("Enter number of columns: ");
		int cols = scanner.nextInt();
		
		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		int[][] sum = new int[rows][cols];
        int[][] diff = new int[rows][cols];

        
        System.out.println("\nEnter elements of Matrix 1: ");
        for(int i = 0; i < rows; i++) {
        	for (int j = 0; j < cols; j++) {
        		System.out.println("matrix1[" + i + "][" + j + "] = ");
        		matrix1[i][j] = scanner.nextInt();
        	}
        }
        
        System.out.println("\nEnter elements of Matrix2: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix2[" + i + "][" + j + "] = ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                diff[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nSum of matrices:");
        displayMatrix(sum);

        System.out.println("\nDifference of matrices:");
        displayMatrix(diff);

        scanner.close();
    }
	
	public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
