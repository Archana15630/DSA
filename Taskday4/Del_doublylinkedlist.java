package dsa;

public class Del_doublylinkedlist {
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
	    public static void deleteMiddle(Node head) {
	        if (head == null) {
	            System.out.println("List is empty. No node to delete.");
	            return;
	        }

	        if (head.next == null) {
	            head = null;
	            return;
	        }
	        Node slow = head;
	        Node fast = head;
	        while (fast != null && fast.next != null) {
	            fast = fast.next.next;  
	            if (fast == null || fast.next == null) {
	                break;
	            }
	            slow = slow.next; 
	        }
	        Node middleNode = slow;
 if (middleNode.prev != null) {
	            middleNode.prev.next = middleNode.next;
	        }

	        if (middleNode.next != null) {
	            middleNode.next.prev = middleNode.prev;
	        }

	        System.out.println("Deleted middle node with value: " + middleNode.data);
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
	        deleteMiddle(head);
	        System.out.println("List after deleting the middle node:");
	        printList(head);
	    }
	}


