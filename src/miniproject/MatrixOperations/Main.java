/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject.MatrixOperations;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        
        // tao ma tran
        int[][] matrix = new int[rows][cols];
        
        // nhap gia tri cho ma tran
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] =sc.nextInt();
            }
        }
        // in ma tran
        System.out.println("Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // tinh tong matrix
        int sum = 0;
        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        
        // tim phan tu lon nhat
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Max value: " + max);
        // tinh tong tung hang
        for (int i = 0; i < rows; i++) {
            int sumRow = 0;
            
            for (int j = 0; j < cols; j++) {
                sumRow += matrix[i][j];
            }
            System.out.println("Row " + (i+1) + ": " +sumRow);
        }
        
        // tinh tong tung cot
        for (int j = 0; j < cols; j++) {
            int sumCol = 0;
            for (int i = 0; i < rows; i++) {
                sumCol += matrix[i][j];
            }
            System.out.println("Col " + (j+1)+ ": " + sumCol);
        }
    }
}
