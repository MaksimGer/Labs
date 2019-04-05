package testjavacollections;

import java.util.*;

public class TestJavaCollections {
    public static void main(String[] args) {
        //---------------------------------------------------------------------------------------
        //---------------------------- ArrayList and LinkedList ---------------------------------
        //---------------------------------------------------------------------------------------

        System.out.println("--------------------------------------------------");
        System.out.println("-------- Compare ArrayList and LinkedList --------");
        System.out.println("--------------------------------------------------\n");
        List<String> stringArrayList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();

        System.out.println("ArrayList:");
        testAdd(stringArrayList, 120000);
        System.out.println("LinkedList:");
        testAdd(stringLinkedList, 120000);

        System.out.println();
        System.out.println("ArrayList:");
        testRemove(stringArrayList, "AC15DC");
        System.out.println("LinkedList:");
        testRemove(stringLinkedList, "AC15DC");

        System.out.println();
        System.out.println("ArrayList:");
        testRemove(stringArrayList, "AC100500DC");
        System.out.println("LinkedList:");
        testRemove(stringLinkedList, "AC100500DC");

        System.out.println();
        System.out.println("ArrayList:");
        testAddAfter(stringArrayList, 183, "value");
        System.out.println("LinkedList:");
        testAddAfter(stringLinkedList, 183, "value");
        System.out.println();

        System.out.println("ArrayList:");
        testAddAfter(stringArrayList, 100500, "value");
        System.out.println("LinkedList:");
        testAddAfter(stringLinkedList, 100500, "value");
        System.out.println();

        System.out.println("ArrayList:");
        testContains(stringArrayList, "AC15DC");
        System.out.println("LinkedList:");
        testContains(stringLinkedList, "AC15DC");
        System.out.println();

        System.out.println("ArrayList:");
        testContains(stringArrayList, "value");
        System.out.println("LinkedList:");
        testContains(stringLinkedList, "value");
        System.out.println();

        //---------------------------------------------------------------------------------------
        //----------------------- HashSet, LinkedHashSet and TreeSet ----------------------------
        //---------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------------");
        System.out.println("--- Compare HashSet, LinkedHashSet and TreeSet ---");
        System.out.println("--------------------------------------------------\n");
        Set<String> stringHashSet = new HashSet<>();
        Set<String> stringLinkedHashSet = new LinkedHashSet<>();
        Set<String> stringTreeSet = new TreeSet<>();

        System.out.println("HashSet:");
        testAdd(stringHashSet, 120000);
        System.out.println("LinkedHashSet:");
        testAdd(stringLinkedHashSet, 120000);
        System.out.println("TreeSet:");
        testAdd(stringTreeSet, 120000);
        System.out.println();

        System.out.println("HashSet:");
        testRemove(stringHashSet, "AC15DC");
        System.out.println("LinkedHashSet:");
        testRemove(stringLinkedHashSet, "AC15DC");
        System.out.println("TreeSet:");
        testRemove(stringTreeSet, "AC15DC");
        System.out.println();

        System.out.println("HashSet:");
        testRemove(stringHashSet, "AC100500DC");
        System.out.println("LinkedHashSet:");
        testRemove(stringLinkedHashSet, "AC100500DC");
        System.out.println("TreeSet:");
        testRemove(stringTreeSet, "AC100500DC");
        System.out.println();


        System.out.println("HashSet:");
        testContains(stringHashSet, "AC14DC");
        System.out.println("LinkedHashSet:");
        testContains(stringLinkedHashSet, "AC14DC");
        System.out.println("TreeSet:");
        testContains(stringTreeSet, "AC14DC");
        System.out.println();

        System.out.println("HashSet:");
        testContains(stringHashSet, "AC15DC");
        System.out.println("LinkedHashSet:");
        testContains(stringLinkedHashSet, "AC15DC");
        System.out.println("TreeSet:");
        testContains(stringTreeSet, "AC15DC");
        System.out.println();

        //---------------------------------------------------------------------------------------
        //------------------------ HashMap, LinkedHashMap, TreeMap ------------------------------
        //---------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------------");
        System.out.println("--- Compare HashSet, LinkedHashSet and TreeSet ---");
        System.out.println("--------------------------------------------------\n");
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("HashMap:");
        testPut(hashMap, 120000);
        System.out.println("LinkedHashMap:");
        testPut(linkedHashMap, 120000);
        System.out.println("TreeMap:");
        testPut(treeMap, 120000);
        System.out.println();

        System.out.println("HashMap:");
        testGetMap(hashMap, 100500);
        System.out.println("LinkedHashMap:");
        testGetMap(linkedHashMap, 100500);
        System.out.println("TreeMap:");
        testGetMap(treeMap, 100500);
        System.out.println();

        System.out.println("HashMap:");
        testContainsKey(hashMap, 99999);
        System.out.println("LinkedHashMap:");
        testContainsKey(linkedHashMap, 99999);
        System.out.println("TreeMap:");
        testContainsKey(treeMap, 99999);
        System.out.println();

        System.out.println("HashMap:");
        testContainsValue(hashMap, "Value111");
        System.out.println("LinkedHashMap:");
        testContainsValue(linkedHashMap, "Value111");
        System.out.println("TreeMap:");
        testContainsValue(treeMap, "Value111");
        System.out.println();

    }



    //---------------------------------------------------------------------------------------
    //------------------------------- secondary functions -----------------------------------
    //---------------------------------------------------------------------------------------

    private static void testAdd(Collection<String> elements, int count){
        long startTime, estimatedTime;

        startTime = System.nanoTime();
        for(int i = 0; i < count; i++){
            elements.add("AC" + i + "DC");
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for add is: " + estimatedTime);
    }

       private static <T>void testAddAfter(List<T> elements, int index, T value){
        long startTime, estimatedTime;
        startTime = System.nanoTime();
        elements.add(index, value);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for add after index is: " + estimatedTime);

    }

    private static <E>void testRemove(Collection<E> collection, E elem){
        long startTime, estimatedTime;

        startTime = System.nanoTime();

        collection.remove(elem);

        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for remove is: " + estimatedTime);
    }

    private static <E>void  testContains(Collection<E> collection, E elem){
        long startTime, estimatedTime;

        startTime = System.nanoTime();

        System.out.println(collection.contains(elem));

        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for test contains is: " + estimatedTime);
    }

    private  static void testPut(Map<Integer,String> map, int count){
        long startTime, estimatedTime;

        startTime = System.nanoTime();

        for(int i = 0; i < count; i++){
            map.put(i, "Value" + i);
        }

        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for put elements is: " + estimatedTime);
    }

    private static void testGetMap(Map<Integer,String> map, Integer key){
        long startTime, estimatedTime;

        startTime = System.nanoTime();

        System.out.println(map.get(key));

        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for get element is: " + estimatedTime);
    }

    private static void testContainsKey(Map<Integer,String> map, Integer key){
        long startTime, estimatedTime;

        startTime = System.nanoTime();

        System.out.println(map.containsKey(key));

        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for containsKey is: " + estimatedTime);
    }

    private static void testContainsValue(Map<Integer,String> map, String value){
        long startTime, estimatedTime;

        startTime = System.nanoTime();

        System.out.println(map.containsValue(value));

        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for containsValue is: " + estimatedTime);
    }
}
