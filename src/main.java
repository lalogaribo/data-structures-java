import Arrays.MyArray;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        MyArray numbers = new MyArray(5);
        numbers.insert(3);
        numbers.insert(3);
        numbers.insert(6);
        numbers.insert(30);
//        numbers.printArray();
        numbers.reverse();
    }


}
