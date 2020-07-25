package LinkedList;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int counter;

    public void addFirst(int value) {
        var node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        counter++;
    }

    public void addLast(int value) {
        var node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        counter++;
    }

    public ArrayList<Integer> printList() {
        var currentNode = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (currentNode != null) {
            list.add(currentNode.value);
            currentNode = currentNode.next;
        }
        return list;
    }

    public int[] toArr() {
        int[] array = new int[counter];
        var currentNode = head;
        int idx = 0;
        while (currentNode != null) {
            array[idx++] = currentNode.value;
            currentNode = currentNode.next;
        }
        return array;
    }

    public int indexOf(int value) {
        var currentNode = head;
        int idx = 0;
        while (idx != counter) {
            if (currentNode.value == value) return idx;
            idx++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public Boolean contains(int value) {
        var currentNode = head;
        int idx = 0;
        while (idx != counter) {
            if (currentNode.value == value) return true;
            currentNode = currentNode.next;
            idx++;
        }
        return false;
    }

    public void deleteFirst() {
        if (isEmpty())
            throw new NoSuchElementException("List is empty");
        if (head == tail) {
            head = tail = null;
            return;
        }
        var nextNode = head.next;
        head.next = null;
        head = nextNode;
        counter--;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (head == tail) {
            head = tail = null;
            return;
        }
        var prevNode = traverseList(tail);
        tail = prevNode;
        tail.next = null;
        counter--;
    }

    private Node traverseList(Node node) {
        var currentNode = head;
        while (currentNode != null) {
            if (currentNode.next == node) return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    public int size() {
        return counter;
    }

    public void printTail() {
        System.out.println(tail.value);
    }

    private Boolean isEmpty() {
        return head == null;
    }

    public void reverse() {
        if (isEmpty()) return;
        var currentNode = head;
        var nextNode = currentNode.next;

        while (nextNode != null) {
            var tempNode = nextNode.next;
            nextNode.next = currentNode;
            currentNode = nextNode;
            nextNode = tempNode;
        }
        tail = head;
        tail.next = null;
        head = currentNode;
    }

    public int getKthElement(int k) {
        if (k > size()) return -1;
        if (isEmpty()) return -1;
        var a = head;
        var b = head;
        for (int i = 0; i < k - 1; i++)
            b = b.next;
        while (b != tail){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
