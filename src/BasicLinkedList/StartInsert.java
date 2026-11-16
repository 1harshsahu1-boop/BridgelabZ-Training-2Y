package BasicLinkedList;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class StartInsert {
    Node head;
    public void insertAtStart(int newdata) {
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        StartInsert list = new StartInsert();

        list.insertAtStart(30);
        list.printList();
    }
}
