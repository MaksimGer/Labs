package com.Netcracker.Factorial;

import java.util.Scanner;

public class Factorial {

    public static long factorialUsingRecurs(long value){

        if(value == 0 || value == 1){
            return 1;
        }
        else {
            return value * factorialUsingRecurs((value - 1));
        }
    }

    public static void main(String[] args) {
        short value;
        long factLoop = 1, factRecurs, startTime, estimatedTime;

        System.out.println("Insert the number: ");
        Scanner in = new Scanner(System.in);

        value = in.nextShort();
        factRecurs = value;

        in.close();

        startTime = System.nanoTime();
        for(int i = 1; i <= value; i++){
            factLoop *= i;
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("factLoop time --> " + estimatedTime);
        System.out.println(value + " factorial = " + factLoop);

        startTime = System.nanoTime();
        factRecurs = factorialUsingRecurs(factRecurs);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("factRecurs time --> " + estimatedTime);
        System.out.println(value + " factorial = " + factRecurs);

    }




}
