package JavaStacks;

public class stackcode {
    private int[] stack;
    private int top;
    private int capacity;

    public stackcode(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Indicates an empty stack
    }

    // Add an element to the top
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
    }

    // Remove and return the top element
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // View the top element
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

        System.out.println("Top: " + myStack.peek());    // Output: 20
        System.out.println("Popped: " + myStack.pop());  // Output: 20
        System.out.println("New Top: " + myStack.peek());// Output: 10
    }
}

