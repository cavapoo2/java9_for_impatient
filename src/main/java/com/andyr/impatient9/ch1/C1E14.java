package com.andyr.impatient9.ch1;

import java.util.ArrayList;

public class C1E14 {
    public static void main(String[] args) {
        int [][] square1 = {
                {7,12,1,14},
                {5,10,11,8},
                {9,6,7,12},
                {4,15,14,1}

        };
        int[][] square2= {
                {7,12,1,14},
                {2,13,8,11},
                {16,3,10,5},
                {9,6,15,4}
        };
        int[][] square3 = {
                {16,3,2,13},
                {5,10,11,8},
                {9,6,7,12},
                {4,15,14,1}
        };

        printSquare(square1,4,4);
        System.out.println("is magic " + isMagic(square1,4,4));
        System.out.println("is magic " + isMagic(square2,4,4));
        System.out.println("is magic " + isMagic(square3,4,4));


    }
    //note no need to pass both rowSize and colSize since both the same doh..
    static boolean isMagic(int[][] mat, int rowSize, int colSize) {
        //first check rows are equal
        int sumR = rowSum(mat,0,colSize);
        for(int i =1; i < rowSize; i++) {
            int s = rowSum(mat,i,colSize);
            if(s != sumR) return false;
        }
        //check the columns are equal
        int colR = colSum(mat,rowSize,0);
        for(int i=1; i < colSize; i++){
            int s = colSum(mat,rowSize,i);
            if(s != colR) return false;
        }
        //check the main diagonals
        int diag1 = 0;
        int diag2 = 0;
        for(int i=0;i < colSize; i++) {
            diag1+= mat[i][i];
            diag2+= mat[i][colSize-i-1];
        }
        if(diag1 != diag2) return false;
        return true;

    }
    static int rowSum(int[][]mat,int row,int colSize) {
        int sum =0;
        for(int j=0; j < colSize; j++) {
            sum += mat[row][j];
        }
        return sum;
    }
    static int colSum(int[][]mat,int rowSize,int col) {
        int sum =0;
        for(int i=0; i < rowSize; i++) {
            sum += mat[i][col];
        }
        return sum;
    }
    static void printSquare(int[][] mat,int rowSize, int colSize) {
        for(int i=0; i < rowSize;i++){
            for(int j=0; j < colSize; j++){
                System.out.printf("%d ",mat[i][j]);
            }
            System.out.println("");
        }
    }
}
