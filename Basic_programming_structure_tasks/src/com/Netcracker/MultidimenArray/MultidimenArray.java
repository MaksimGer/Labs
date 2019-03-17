package com.Netcracker.MultidimenArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MultidimenArray {
    public static void main(String[] args) {
        Integer[][] matrix;

        System.out.println("---- TASK a ----"); // task a
        int sumMainDiag = 0; int prodMainDiag = 1; int sumSideDiag = 0; int prodSideDiag = 1;

        matrix = fillMatr(8, 8, 1, 99);

        printMatr(matrix);
        for(int i = 0; i < matrix.length; i++){
            sumMainDiag += matrix[i][i];
            prodMainDiag *= matrix[i][i];
            sumSideDiag += matrix[i][matrix.length - 1 - i];
            prodSideDiag *= matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Sum elements main diagonal is : " + sumMainDiag );
        System.out.println("Prod elements main diagonal is : " + prodMainDiag);
        System.out.println("Sum elements side diagonal is : " + sumSideDiag );
        System.out.println("Prod elements side diagonal is : " + prodSideDiag);

        System.out.println();
        System.out.println("---- TASK b ----"); // task b

        matrix = fillMatr(8,5,-99,99);
        int maxElem = -100, maxI = 0, maxJ = 0;

        printMatr(matrix);

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[i][j] > maxElem){
                    maxElem = matrix[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("Max element is: matrix[" +
                maxI + "][" + maxJ + "] = " + maxElem);

        System.out.println();
        System.out.println("---- TASK c ----"); // task c

        matrix = fillMatr(8, 5, -10,10);
        int[] max = new int[matrix.length];
        int maxProd = 0, index = 0;

        printMatr(matrix);
        for(int i = 0; i < matrix.length; i++){
            max[i] = 1;
            for(int j = 0; j< matrix[i].length; j++){
                max[i] *= Math.abs(matrix[i][j]);
            }
            maxProd = max[i];
        }

        for(int i = 0; i < max.length; i++){
            if(maxProd <= max[i]){
                maxProd = max[i];
                index = i;
            }
        }
        System.out.println("The largest modulo product" +
                " of the elements in a row: " + index + " = " + max[index]);

        System.out.println();
        System.out.println("---- TASK d ----"); // task d

        matrix = fillMatr(10, 7, 0,100);
        printMatr(matrix);

        for(int i = 0; i < matrix.length; i++){
            Arrays.sort(matrix[i], Collections.reverseOrder());
        }

        printMatr(matrix);
    }

    public static Integer[][] fillMatr(int row, int col, int min, int max){
        Integer[][] matr = new Integer[row][col];
        Random rand = new Random();

        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matr[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
        return matr;
    }

    public static void printMatr(Integer[][] matr){
        for(int i = 0; i < matr.length; i++){
            for(int j = 0; j < matr[i].length; j++){
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
