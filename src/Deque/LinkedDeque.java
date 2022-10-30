package Deque;

import java.util.Iterator;

public class LinkedDeque<T> implements DequeInterface<T>{

    private DLNode<T> front;

    private DLNode<T> back;

    private int size;

    public LinkedDeque() {
        front = null;
        back = null;
        size = 0;
    }

    public void addToFront(T newEntry) {
        DLNode<T> tempNode = front;
        front = new DLNode(newEntry, tempNode, null);
        if (!(tempNode == null)) tempNode.prev = front;
        if (size == 0) back = front;
        size++;
    }

    public void addToBack(T newEntry) {
        DLNode<T> tempNode = back;
        back = new DLNode(newEntry, null, tempNode);
        if (!(tempNode == null)) tempNode.next = back;
        if (size == 0) front = back;
        size++;
    }

    public T removeFront() throws EmptyQueueException {
        if (front == null) throw new EmptyQueueException("Deque is null at this time, cannot remove from it.");

        T temp = front.data;

        if (front == back) {
            front = null;
            back = null;
        } else {
            front = front.next;
        }
        size--;
        return temp;

    }

    public T removeBack() throws EmptyQueueException {
        if (front == null) throw new EmptyQueueException("Deque is null at this time, cannot remove from it.");

        T temp = back.data;

        if (front == back) {
            temp = back.data;
            front = null;
            back = null;
        } else {
            back = back.prev;
        }

        size--;
        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T getFront() {
        if (size == 0) return null;
        return front.data;
    }

    public T getBack() {
        if (size == 0) return null;
        return back.data;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        front = null;
        back = null;
        size = 0;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Iterator<T> getIterator() {
        return null;
    }

    private class DLNode<T> {
        private T data;
        private DLNode<T> next;
        private DLNode<T> prev;

        public DLNode(T newEntry) {
            this(newEntry, null, null);
        }

        public DLNode(T newEntry, DLNode<T> next, DLNode<T> prev) {
            this.data = newEntry;
            this.next = next;
            this.prev = prev;
        }

        public T getData(){
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public DLNode<T> getNextNode() {
            return next;
        }

        public void setNextNode(DLNode<T> node) {
            this.next = node;
        }

        public DLNode<T> getPreviousNode() {
            return prev;
        }

        public void setPreviousNode(DLNode<T> node) {
            this.prev = node;
        }

    }
/*
    private class IteratorForLinkedList<T> implements Iterator<T> {

        T currentNode;

        private IteratorForLinkedList() {
            currentNode = new T();
        }

        public boolean hasNext() {
            return false;
        }

        public T next() {
            return null;
        }

        public void remove() {
            Iterator.super.remove();
        }
    } */
}
