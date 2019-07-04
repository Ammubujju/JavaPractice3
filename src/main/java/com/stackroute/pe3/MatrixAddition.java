package com.stackroute.pe3;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args){
        MatrixAddition m = new MatrixAddition();
        m.addMatrix();
    }
    public void addMatrix() {

        int row = 0, col = 0;
        Scanner scanner = new Scanner(System.in);

//		reads input of row and column
        System.out.println("Number of rows of matrix");
        row = scanner.nextInt();
        System.out.println("Number of columns of matrix");
        col = scanner.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] sum = new int[row][col];

//		reads value for matrixes
        System.out.println("Elements of first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Input elements of second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Sum of matrices:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
