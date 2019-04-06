package linkedlist.source;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E>, MyDescendingIterator<E>{

    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public MyLinkedList(){
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<E>(null,null, lstNode);
    }

    @Override
    public void add(E element) {
        Node<E> prev = lstNode;
        prev.element = element;
        lstNode = new Node<E>(null, prev, null);
        prev.nextNode = lstNode;
        size++;
    }

    @Override
    public void add(int index, E element) {
        Node<E> prev = fstNode;
        Node<E> next;
        Node<E> newNod;

        for(int i = 0; i <= index; i++){
            prev = prev.nextNode;
        }
        next = prev.nextNode;
        newNod = new Node<E>(element, prev, next);

        prev.nextNode = newNod;
        next.prevNode = newNod;
        size++;
    }

    @Override
    public void clear() {
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<E>(null,null, lstNode);
    }

    @Override
    public E get(int index) {
        Node<E> result = fstNode.nextNode;
        for(int i = 0; i < index; i++){
            result = result.nextNode;
        }
        return result.element;
    }


    @Override
    public int indexOf(E element) {
        Node<E> curNode= fstNode.nextNode;
        for(int i = 0; i< size; i++){
            if(curNode.element.equals(element))
                return i;
            curNode = curNode.nextNode;
        }
        return 0;
    }

    @Override
    public E remove(int index) {
        Node<E> result = fstNode.nextNode;
        Node<E> prev = null;
        Node<E> next;

        for(int i = 0; i < index -1; i++){
            result = result.nextNode;
        }
        prev = result;
        result = result.nextNode;
        next = result.nextNode;

        prev.nextNode = next;
        next.prevNode = prev;

        return result.element;
    }

    @Override
    public E set(int index, E element) {
        E result;
        Node<E> curNode = fstNode.nextNode;
        for(int i = 0; i < index; i++){
            curNode = curNode.nextNode;
        }
        result = curNode.element;
        curNode.element = element;

        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>(){
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return get(counter++);
            }
        };
    }

    @Override
    public E[] toArray() {
        try {
            E[] arr = (E[]) java.lang.reflect.Array.newInstance(fstNode.nextNode.element.getClass(), size);
            Node<E> curNode = fstNode.nextNode;
            for (int i = 0; i< size; i++) {
                arr[i] = curNode.element;
                curNode = curNode.nextNode;
            }
            return arr;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size - 2;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return get(counter--);
            }
        };
    }

    @Override
    public String toString(){
        String str = "MyLinkedList: [";
        Node<E> curNode = fstNode.nextNode;

        if(size > 0){
            str += curNode.element;
            curNode = curNode.nextNode;
            for(int i = 1; i < size; i++){
                str += "," + curNode.element.toString();
                curNode = curNode.nextNode;
            }
        }

        str += "]";
        return str;
    }

    private class Node<E>{
        private E element;
        private Node<E> nextNode;
        private Node<E> prevNode;

        private Node(E element, Node<E> prev, Node<E> next){
            this.element = element;
            nextNode = next;
            prevNode = prev;
        }
    }
}
