package JavaStacks;

public class stackcode {
    private int[] stack;
    private int top;
    private int capacity;

    public stackcode(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        stackcode myStack = new stackcode(3);
        myStack.push(10);
        myStack.push(20);

        System.out.println("Top: " + myStack.peek());
        System.out.println("Popped: " + myStack.pop());
        System.out.println("New Top: " + myStack.peek());
    }
}

