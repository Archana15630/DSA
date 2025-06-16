package addon_dsa;
 public class CircularLinkedList_in {
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


    Node head = null;
    Node tail = null;
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; 
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }



    public static void main(String[] args) {
        CircularLinkedList_in cll = new CircularLinkedList_in();
        cll.insertAtTail(10);
        cll.insertAtTail(20);
        cll.insertAtTail(30);
        cll.insertAtTail(40);
        cll.insertAtTail(11);
        cll.display();
    }
}

