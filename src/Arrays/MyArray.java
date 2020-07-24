package Arrays;


public class MyArray {
    private int[] items;
    private int count = 0;

    public MyArray(int length) {
        items = new int[length];
    }

    public void printArray() {
        for (int item : items) {
            System.out.println(item);
        }
    }

    public void insert(int number) {
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = number;
    }

    public void removeAt(int index) {
        if (index > items.length || index < 0)
            throw new IllegalArgumentException();
        else {
            for (int i = index; i < count; i++)
                items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    public int max() {
        int largest = 0;
        for (int i = 0; i < count; i++) {
            if (items[i] > largest)
                largest = items[i];
        }
        return largest;
    }
    
    public void reverse() {
        for (int i = count; i >= 0 ; i--) {
            System.out.println(items[i]);
        }
    }

}
