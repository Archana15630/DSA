package dsa;

public class DoublyLinkedList_insert {
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
	    public static void insertMiddle(Node head, int value) {
	        Node newNode = new Node(value);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node slow = head;
	        Node fast = head;
	        while (fast != null && fast.next != null) {
	            fast = fast.next.next;  
	            slow = slow.next;        
	        }
	        newNode.next = slow.next;
	        if (slow.next != null) {
	            slow.next.prev = newNode;
	        }
	        slow.next = newNode;
	        newNode.prev = slow;
	    }
	  
	    public static void printList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Node head = new Node(10);
	        head.next = new Node(20);
	        head.next.prev = head;
	        head.next.next = new Node(30);
	        head.next.next.prev = head.next;
	        head.next.next.next = new Node(40);
	        head.next.next.next.prev = head.next.next;
	        head.next.next.next.next = new Node(50);
	        head.next.next.next.next.prev = head.next.next.next;
	        System.out.println("Original Doubly Linked List:");
	        printList(head);
	        insertMiddle(head, 25); 
	        System.out.println("List after inserting 25 in the middle:");
	        printList(head);
	    }
	}

