package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MyStack {

    private final List<String> openingBrackets = Arrays.asList("{", "(", "[");
    private final List<String> closingBrackets = Arrays.asList(")", "]", "}");

    public String reverseString(String str) {
        Stack<Character> characters = new Stack<>();

        for (char ch : str.toCharArray()) {
            characters.push(ch);
        }
        StringBuffer revers = new StringBuffer();
        while (!characters.empty())
            revers.append(characters.pop());
        return revers.toString();
    }

    public Boolean isBalanced(String string) {
        Stack<Character> characters = new Stack<>();
        for (char ch : string.toCharArray()) {
            if (isLeft(ch))
                characters.push(ch);
            if (isClosing(ch)) {
                if (characters.empty()) {
                    return false;
                }
                characters.pop();
            }
        }
        return characters.empty();
    }

    private boolean isLeft(char ch) {
        return openingBrackets.contains(ch);

    }

    private boolean isClosing(char ch) {
        return closingBrackets.contains(ch);
    }
}
