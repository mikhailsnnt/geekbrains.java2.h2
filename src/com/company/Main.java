package com.company;

public class Main {

    public static void main(String[] args) {

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
                    throw new MyArrayDataException("Invalid integer at column "+i+", row "+j, exception);
                }
            }
        }
        return sum;

    }
}
