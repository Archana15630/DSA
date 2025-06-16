package addon_dsa;

public class Delcll_head {
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
	    public void deleteFromHead() {
	        if (head == null) {
	            System.out.println("List is empty. Nothing to delete.");
	            return;
	        }
	        if (head == tail) { 
	            head = null;
	            tail = null;
	        } else {
	            head = head.next;
	            tail.next = head; 
	        }
	        System.out.println("Deleted head element successfully.");
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
	        Delcll_head cll = new Delcll_head();
	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);

	        System.out.println("Original List:");
	        cll.display();

	        cll.deleteFromHead();
	        System.out.println("After Deletion from Head:");
	        cll.display();
	    }
	}


