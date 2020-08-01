package Queue;

import java.util.Arrays;
import java.util.Stack;

public class MyQueue {

    private int count;
    private int front;
    private int rear;
    private int[] items;

    public MyQueue(int size) {
        items = new int[size];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int size() {
        return items.length;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public boolean isEmpty() {
        return items.length == 0;
    }

    public int peek() {
        return items[front];
    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}
