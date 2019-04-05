package linkedlist;
import linkedlist.source.MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<String> strings = new MyLinkedList<>();

        System.out.println("--------- MyLinkedList TEST main methods ----------");
        System.out.println();

        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("qqq");
        strings.add("GG");

        System.out.println(strings.get(3));
        System.out.println(strings.indexOf("qqq"));
        System.out.println(strings.set(8, "aaa"));
        System.out.println(strings.get(8));

        String[] strings1 = strings.toArray();

        System.out.println("string1[9]: " + strings1[9]);

        System.out.println("--- test iterator > ---");

        strings.add(4, "Hello!");
        for(String elem: strings){
            System.out.println(elem);
        }

        strings.remove(5);
        System.out.println("--- test iterator < ---");
        Iterator iterator = strings.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        strings.clear();

        System.out.println("--------- MyLinkedList TEST add() and indexOf 1 000 000 elems ----------");
        System.out.println();

        long startTime, estimatedTime;
        List<String> strings2 = new LinkedList<>();


        startTime = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            strings.add("AC" + i + "DC");
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for add is: " + estimatedTime);

        startTime = System.nanoTime();
        System.out.println("AC879035DC has index: " + strings.indexOf("AC879035DC"));
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time fo indexOf(elem)) is: " + estimatedTime);

        System.out.println("--------- LinkedList TEST add() and indexOd 1 000 001 elems ----------");
        System.out.println();

        startTime = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            strings2.add("DC" + i + "AC");
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for add is: " + estimatedTime);

        startTime = System.nanoTime();
        System.out.println("DC879035AC has index: " + strings2.indexOf("DC879035AC"));
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time is: " + estimatedTime);

        //--------------------------------------------------------------------------------------------

        System.out.println("--------- MyLinkedList TEST add(ind, value)  1 000 001 elems ----------");
        System.out.println();

        startTime = System.nanoTime();
        strings.add(879035, "Hello world!");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time is: " + estimatedTime);

        System.out.println("--------- LinkedList TEST add(ind, value) 1 000 001 elems ----------");
        System.out.println();

        startTime = System.nanoTime();
        strings2.add(879035, "Hello world!");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time is --> " + estimatedTime);

        //--------------------------------------------------------------------------------------------

        System.out.println("--------- MyLinkedList TEST set(idn, value)  1 000 002 elems ----------");
        System.out.println();

        startTime = System.nanoTime();
        strings.set(879035, "Hello world!");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for set(elem, value) is: " + estimatedTime);

        System.out.println("--------- LinkedList TEST set(idn, value)  1 000 002 elems ----------");
        System.out.println();

        startTime = System.nanoTime();
        strings2.set(879035, "Hello world!");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for set(elem, value)--> " + estimatedTime);



    }
}
