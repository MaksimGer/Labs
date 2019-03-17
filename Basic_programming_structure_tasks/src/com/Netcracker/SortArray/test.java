package com.Netcracker.SortArray;

public class test {

    public static void main(String[] args) {

        long startTime, estimatedTime;

        SortArray arraySort = new SortArray(100);
        SortArray arrayBubbleSort = new SortArray(arraySort);
        SortArray arraySelectionSort = new SortArray(arraySort);

        System.out.print("array1 --> ");
        arraySort.printArray();
        System.out.print("array2 --> ");
        arrayBubbleSort.printArray();
        System.out.print("array3 --> ");
        arraySelectionSort.printArray();
        System.out.println("------------------------------------");

        startTime = System.nanoTime();
        arraySort.sortArray();
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Standart sort time --> " + estimatedTime);

        startTime = System.nanoTime();
        arrayBubbleSort.bubbleSort();
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Bubble sort time --> " + estimatedTime);

        startTime = System.nanoTime();
        arraySelectionSort.selectionSort();
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Selection sort time --> " + estimatedTime);

        System.out.println("------------------------------------");
        System.out.print("arraySort --> ");
        arraySort.printArray();
        System.out.print("arrayBubble --> ");
        arrayBubbleSort.printArray();
        System.out.print("arraySelect --> ");
        arraySelectionSort.printArray();

    }
}
