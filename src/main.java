import LinkedList.MyLinkedList;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.getKthElement(1));
        System.out.println(list.printList());


    }


}
