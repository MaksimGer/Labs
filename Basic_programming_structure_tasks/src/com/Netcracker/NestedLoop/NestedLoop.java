package com.Netcracker.NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        // ----------------------- task a
        int size = 5;
        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();

        // ----------------------- task b(b)
        size = 8;
        for(int row = 1; row <= size; row++){
            for(int col = row; col <= size ; col++){
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();

        // ----------------------- task b(i)

        size = 7;
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == 1 || row == size || col == size||
                        row == col || col == size - row + 1)  {
                    System.out.print("#");
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }

}
