package com.Netcracker.Colntrol_struct;

import java.util.Scanner;

import static com.Netcracker.One_DimenArrays.One_DimenArrays.fillArray;
import static com.Netcracker.One_DimenArrays.One_DimenArrays.printArray;

public class Colntrol_struct {
    enum Fingers{thumb, index, middle, ring, pinky};

    private static Fingers setFingers(int i){
        Fingers finger;
        switch (i){
            case 1: finger = Fingers.thumb; break;
            case 2: finger = Fingers.index; break;
            case 3: finger = Fingers.middle; break;
            case 4: finger = Fingers.ring; break;
            case 5: finger = Fingers.pinky; break;
            default: finger = Fingers.thumb; break;
        }
        return finger;
    }

    public static void main(String[] args) {
        long startTime, estimatedTime;
        Fingers finger;

        System.out.println("----- TASK 1 ------");
        System.out.print("Enter your favorite finger number =): ");
        Scanner in = new Scanner(System.in);
        finger = setFingers(in.nextShort());

        in.close();

        System.out.println("\nswitch - case: ");

        startTime = System.nanoTime();
        switch (finger){
            case thumb:
                System.out.println("Your favorite finger is: " + finger +
                        "(Большой палец)");
                break;
            case index:
                System.out.println("Your favorite finger is: " + finger +
                        "(Указательный палец)");
                break;
            case middle:
                System.out.println("Your favorite finger is: " + finger +
                        "(Средний палец)");
                break;
            case ring:
                System.out.println("Your favorite finger is: " + finger +
                        "(Безымянный палец)");
                break;
            case pinky:
                System.out.println("Your favorite finger is: " + finger +
                        "(Мизинец)");
                break;
        }
        estimatedTime = System.nanoTime() - startTime;

        System.out.println("Time: " + estimatedTime);
        System.out.println("\n--------------------------" +
                "-------------------");
        System.out.println("if - else: ");

        startTime = System.nanoTime();
        if(finger == Fingers.thumb){
            System.out.println("Your favorite finger is: " + finger +
                    "(Большой палец)");
        }
        if(finger == Fingers.index){
            System.out.println("Your favorite finger is: " + finger +
                    "(Указательный палец)");
        }
        if(finger == Fingers.middle){
            System.out.println("Your favorite finger is: " + finger +
                    "(Средний палец)");
        }
        if(finger == Fingers.ring){
            System.out.println("Your favorite finger is: " + finger +
                    "(Безымянный палец)");
        }
        if(finger == Fingers.pinky){
            System.out.println("Your favorite finger is: " + finger +
                    "(Мизинец)");
        }
        estimatedTime = System.nanoTime() - startTime;

        System.out.println("Time: " + estimatedTime);


        System.out.println("\n----- TASK 2 ------");
        Integer[] array = fillArray(50, 0,10);
        int[] elements = new int[11];

        System.out.print("Array: ");
        printArray(array);

        System.out.println("\nswitch - case: ");

        startTime = System.nanoTime();
        for(int i = 0; i < array.length; i++){
            switch (array[i]){
                case 0: elements[0]++; break;
                case 1: elements[1]++; break;
                case 2: elements[2]++; break;
                case 3: elements[3]++; break;
                case 4: elements[4]++; break;
                case 5: elements[5]++; break;
                case 6: elements[6]++; break;
                case 7: elements[7]++; break;
                case 8: elements[8]++; break;
                case 9: elements[9]++; break;
                case 10: elements[10]++; break;
            }
        }

        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time switch-case: " + estimatedTime);

        for(int i = 0; i < elements.length; i++){
            System.out.println("element \"" + i + "\": " + elements[i]);
        }

        elements = new int[11];

        System.out.println("\n--------------------------" +
                "-------------------");
        System.out.println("if - else: ");

        startTime = System.nanoTime();
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                elements[0]++;
            }
            if(array[i] == 1){
                elements[1]++;
            }
            if(array[i] == 2){
                elements[2]++;
            }
            if(array[i] == 3){
                elements[3]++;
            }
            if(array[i] == 4){
                elements[4]++;
            }
            if(array[i] == 5){
                elements[5]++;
            }
            if(array[i] == 6){
                elements[6]++;
            }
            if(array[i] == 7){
                elements[7]++;
            }
            if(array[i] == 8){
                elements[8]++;
            }
            if(array[i] == 9){
                elements[9]++;
            }
            if(array[i] == 10){
                elements[10]++;
            }
        }
        estimatedTime = System.nanoTime() - startTime;

        System.out.println("Time if-else: " + estimatedTime);

        for(int i = 0; i < elements.length; i++){
            System.out.println("element \"" + i + "\": " + elements[i]);
        }

    }
}
