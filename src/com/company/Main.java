package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 4, m = 4;
        String [][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.next();
            }
        }
        try{
            System.out.println("Sum is :" + matrixSum(matrix,n,m));
        }catch (MyArraySizeException | MyArrayDataException exception){
            exception.printStackTrace();
        }
    }
    public static int matrixSum(String[][] matrix,int n,int m) throws MyArraySizeException,MyArrayDataException{
        boolean sizeIsCorrect = matrix.length == n;
        for (int i = 0;sizeIsCorrect&& i < matrix.length; i++) {
            sizeIsCorrect = matrix[i].length == m;
        }
        if (!sizeIsCorrect)
            throw new MyArraySizeException("Provided matrix dimensions are not "+n+"X"+m);
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try{
                    sum += Integer.parseInt(matrix[i][j]);
                }
                catch (NumberFormatException exception){
                    throw new MyArrayDataException("Invalid integer at row "+i+", column "+j, exception);
                }
            }
        }
        return sum;

    }
}
