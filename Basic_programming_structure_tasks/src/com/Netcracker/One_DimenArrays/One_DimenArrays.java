package com.Netcracker.One_DimenArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class One_DimenArrays {

    public static void main(String[] args) {
        int size = 20;
        int min;
        int max;
        Integer[] array;
        Random rand;

        String stateTest = "";
        Scanner in = new Scanner(System.in);
        while(!stateTest.equals(new String("exit"))){

            System.out.print("\nSelect tasks number(a, b, c, d, e, or f) :"
                    + "\nor enter exit to close this program: ");


            stateTest = in.next();


            switch (stateTest) {
                case "a":
                    // ------------------------- task a
                    min = 1;
                    max = 99;
                    array = new Integer[size];

                    System.out.println("\n-------- TASK a --------");

                    rand = new Random();
                    for (int i = 0; i < array.length; i++) {
                        array[i] = rand.nextInt(max - min + 1) + min;
                        while (array[i] % 2 == 0) {
                            array[i] = rand.nextInt(max - min + 1) + min;
                        }
                    }



                    Arrays.sort(array);
                    System.out.print("array < :");
                    printArray(array);

                    Arrays.sort(array, Collections.reverseOrder());
                    System.out.print("array > :");
                    printArray(array);
                    break;

                case "b":
                    // ------------------------- task b
                    int evens = 0, odd = 0;
                    array = fillArray(20,0,10);

                    System.out.println("\n-------- TASK b --------");

                    printArray(array);

                    for(int i = 0; i < array.length; i++){
                        if(array[i] % 2 == 0){
                            evens++;
                        }
                        else {
                            odd++;
                        }
                    }

                    System.out.println("evens is: " + evens + "\nodd is: " + odd);
                    break;

                case "c":
                    // ------------------------- task c
                    array = fillArray(10, 1,100);

                    System.out.println("\n-------- TASK c --------");

                    printArray(array);

                    for(int i = 1; i < array.length; i += 2){
                        array[i] = 0;
                    }

                    printArray(array);
                    break;

                case "d":
                    // ------------------------- task d
                    int maxInd = 0, minInd = 0;
                    min = 50;
                    max = -50;
                    array = fillArray(15, max, min);

                    System.out.println("\n-------- TASK d --------");

                    printArray(array);

                    for (int i = 0; i< array.length; i++){
                        if(max <= array[i]){
                            max = array[i];
                            maxInd = i;
                        }
                        if(min >= array[i]){
                            min = array[i];
                            minInd = i;
                        }
                    }

                    System.out.println("array[" + maxInd + "] = " +
                            max + " is max elem. \narray[" +
                            minInd + "] = " + min + " is min elem."  );
                    break;

                case "e":
                    array = fillArray(10, 0, 10);
                    Integer[] array2 = fillArray(10, 0,10);
                    double average1 = 0;
                    double average2 = 0;

                    System.out.println("\n-------- TASK e --------");

                    System.out.print("array1: ");
                    printArray(array);
                    System.out.print("array2: ");
                    printArray(array2);

                    for(int i = 0; i< array.length; i++){
                        average1 += array[i];
                        average2 += array2[i];
                    }

                    System.out.println("average first array is: " +
                            average1 / array.length);
                    System.out.println("average second array is: " +
                            average2 / array2.length);
                    break;

                case "f":
                    array = fillArray(20, -1, 1);
                    int[] elements = new int[3];
                    max = 0;

                    System.out.println("\n-------- TASK f --------");

                    for(int i = 0; i < array.length; i++){
                        switch (array[i]){
                            case -1:
                                elements[0]++;
                                break;
                            case 0:
                                elements[1]++;
                                break;
                            case 1:
                                elements[2]++;
                                break;
                        }
                    }

                    for(int i = 0; i< elements.length; i++) {
                        if (max < elements[i]) {
                            max = elements[i];
                        }
                    }

                    printArray(array);

                    if(elements[0] == max)
                        System.out.println("the element \"-1\" occur " + elements[0] + " times");
                    if(elements[1] == max)
                        System.out.println("the element \"0\" occur " + elements[1] + " times");
                    if(elements[2] == max)
                        System.out.println("the element \"1\" occur " + elements[2] + " times");
                    break;

            }
        }
        in.close();

    }

    public static Integer[] fillArray(int size, int min, int max){
        Integer[] array = new Integer[size];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(max - min + 1) + min;
        }

        return array;
    }

    public static void printArray(Integer[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
