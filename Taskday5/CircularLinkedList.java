package addon_dsa;

public class CircularLinkedList {
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

	    // Insert a node at the tail
	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            tail.next = head; // Circular connection
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head; // Maintain circularity
	        }
	    }

	    // Display the circular linked list
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
	        CircularLinkedList cll = new CircularLinkedList();
	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);

	        System.out.println("Circular Linked List:");
	        cll.display();
	    }
	}


