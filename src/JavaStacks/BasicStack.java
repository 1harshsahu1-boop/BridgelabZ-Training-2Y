package JavaStacks;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        int poppy = stack.pop();
        System.out.println(poppy);
        System.out.println(stack);
        int toppy = stack.peek();
        System.out.println(toppy);
        boolean emptyCheck = stack.isEmpty();
        System.out.println(emptyCheck);
    }
}
