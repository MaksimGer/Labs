package com.Netcracker.SortArray;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

    private int[] array;

    public SortArray(int size){
        array = new int[size];
        this.fillArray();
    }

    public SortArray(SortArray another){
        array = new int[another.getLength()];
        for(int i = 0; i< array.length; i++) {
            array[i] = another.getArray()[i];
        }
    }

    public int getLength(){
        return array.length;
    }
    public int[] getArray(){
        return array;
    }

    public void bubbleSort(){

        for(int j = array.length - 1; j >= 1; j--){
            for(int i = 0; i < j; i++){

                if(array[i] > array[i+1]){
                    int firstElem = array[i];
                    array[i] = array[i+1];
                    array[i+1] = firstElem;
                }
            }
        }
    }

    public void selectionSort(){
        int min, temp;

        for(int i = 0; i < array.length - 1; i++){
            min = i;

            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }

            if(min != i){
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public void sortArray(){
        Arrays.sort(array);
    }

    public void fillArray(){
        Random rand = new Random();
        for (int i = 0; i< array.length; i++){
            array[i] = rand.nextInt(100);
        }
    }

    public void printArray(){
        for(int elem: array){
            System.out.print(elem + " ");
        }
        System.out.println();
    }


}
