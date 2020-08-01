import Queue.MyQueue;
import Queue.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue que = new PriorityQueue(5);
        que.add(10);
        que.add(2);
        que.add(3);
        que.add(3);
        que.add(4);

        System.out.println(que.toString());
    }
}














