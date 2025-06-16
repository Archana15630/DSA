package dsa;
	import java.util.Scanner;

	public class SinglyLinkedListMenu {

	    static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node head;
	    public SinglyLinkedListMenu() {
	        insertAtEnd(5);
	        insertAtEnd(10);
	        insertAtEnd(15);
	    }
	    public void insertAtBeginning(int value) {
	        Node newNode = new Node(value);
	        newNode.next = head;
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
	    }
	    public void insertAtPosition(int value, int position) {
	        if (position < 1) {
	            System.out.println("Invalid position! Must be >= 1.");
	            return;
	        }
	        if (position == 1) {
	            insertAtBeginning(value);
	            return;
	        }
	        Node newNode = new Node(value);
	        Node temp = head;
	        int count = 1;
	        while (temp != null && count < position - 1) {
	            temp = temp.next;
	            count++;
	        }
	        if (temp == null) {
	            System.out.println("Position beyond list length, inserting at end.");
	            insertAtEnd(value);
	            return;
	        }
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (position < 1) {
	            System.out.println("Invalid position!");
	            return;
	        }
	        if (position == 1) {
	            System.out.println("Deleted: " + head.data);
	            head = head.next;
	            return;
	        }
	        Node temp = head;
	        int count = 1;
	        while (temp.next != null && count < position - 1) {
	            temp = temp.next;
	            count++;
	        }
	        if (temp.next == null) {
	            System.out.println("Position not found.");
	            return;
	        }
	        System.out.println("Deleted: " + temp.next.data);
	        temp.next = temp.next.next;
	    }
	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        System.out.print("List: ");
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        SinglyLinkedListMenu sll = new SinglyLinkedListMenu();
	        Scanner sc = new Scanner(System.in);
	        int choice, value, position;

	        do {
	            System.out.println("\n--- Singly Linked List Menu ---");
	            System.out.println("1. Insert at Beginning");
	            System.out.println("2. Insert at End");
	            System.out.println("3. Insert at Position");
	            System.out.println("4. Delete at Position");
	            System.out.println("5. Display List");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert at beginning: ");
	                    value = sc.nextInt();
	                    sll.insertAtBeginning(value);
	                    break;
	                case 2:
	                    System.out.print("Enter value to insert at end: ");
	                    value = sc.nextInt();
	                    sll.insertAtEnd(value);
	                    break;
	                case 3:
	                    System.out.print("Enter value to insert: ");
	                    value = sc.nextInt();
	                    System.out.print("Enter position to insert at: ");
	                    position = sc.nextInt();
	                    sll.insertAtPosition(value, position);
	                    break;
	                case 4:
	                    System.out.print("Enter position to delete: ");
	                    position = sc.nextInt();
	                    sll.deleteAtPosition(position);
	                    break;
	                case 5:
	                    sll.display();
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while (choice != 6);

	        sc.close();
	    }
	}


