package JavaStacks;

public class Stack {
    int top;
    int size;
    int[] arr;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    public void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Empty Stack");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        s.pop();
        int g = s.peek();
        System.out.println(g);
        s.display();
    }
}