package Queue;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int counter;

    public PriorityQueue(int size) {
        items = new int[size];
    }

    public void add(int item) {
        if (isFull())
            throw new IllegalStateException();
        int i;
        for (i = counter - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        items[i + 1] = item;
        counter++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        return items[--counter];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
