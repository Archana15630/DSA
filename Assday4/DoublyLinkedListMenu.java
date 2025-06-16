package dsa;
import java.util.Scanner;

public class DoublyLinkedListMenu {
    
    static class Node {
        int data;
        Node next;
        Node prev;
        
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    Node head;
    
    // Constructor - initialize list with some values
    public DoublyLinkedListMenu() {
        // Initialize with some sample values: 10, 20, 30
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
    }
    
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }
    
    public void insertAtPosition(int value, int position) {
        if (position < 1) {
            System.out.println("Invalid position! Position should be >= 1.");
            return;
        }
        if (position == 1) {
            insertAtBeginning(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        int currentPos = 1;
        while (temp != null && currentPos < position - 1) {
            temp = temp.next;
            currentPos++;
        }
        if (temp == null) {
            System.out.println("Position beyond list length, inserting at end.");
            insertAtEnd(value);
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }
    
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            System.out.println("Deleted: " + head.data);
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        Node temp = head;
        int currentPos = 1;
        while (temp != null && currentPos < position) {
            temp = temp.next;
            currentPos++;
        }
        if (temp == null) {
            System.out.println("Position not found.");
            return;
        }
        System.out.println("Deleted: " + temp.data);
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
    }
    
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Forward: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next; // move to end
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        DoublyLinkedListMenu dll = new DoublyLinkedListMenu();
        Scanner sc = new Scanner(System.in);
        int choice, value, position;
        
        do {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Position");
            System.out.println("5. Display Forward");
            System.out.println("6. Display Backward");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    value = sc.nextInt();
                    dll.insertAtBeginning(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at end: ");
                    value = sc.nextInt();
                    dll.insertAtEnd(value);
                    break;
                case 3:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    System.out.print("Enter position: ");
                    position = sc.nextInt();
                    dll.insertAtPosition(value, position);
                    break;
                case 4:
                    System.out.print("Enter position to delete: ");
                    position = sc.nextInt();
                    dll.deleteAtPosition(position);
                    break;
                case 5:
                    dll.displayForward();
                    break;
                case 6:
                    dll.displayBackward();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);
        
        sc.close();
    }
}

	