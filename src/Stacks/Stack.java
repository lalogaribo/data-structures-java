package Stacks;

import java.util.Arrays;

public class Stack {
    private int size;
    private int count;
    private int[] stack = new int[20];

    public Stack() {
        this.count = 0;
    }

    public void push(int number) {
        if(count == stack.length)
            throw new StackOverflowError();
        stack[count++] = number;
    }

    public int pop() {
        if(count == 0)
            throw new IllegalStateException();
        return stack[--count];
    }

    public boolean isEmpty() {
        return stack.length == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(stack);
    }
}
