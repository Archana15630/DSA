package dsa;
import java.util.Scanner;	
class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class ReversingLinkedList {
	    public static Node reverse(Node head) {
	        Node previous = null;  
	        Node current = head;   
	        Node nextNode = null;  

	        while (current != null) {
	            nextNode = current.next; 
	            current.next = previous; 
	            previous = current;      
	            current = nextNode;      
	        }

	        return previous; 
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
	        Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(4);
	        head.next.next.next.next = new Node(5);

	        System.out.println("Original linked list:");
	        printList(head);

	        head = reverse(head);

	        System.out.println("Reversed linked list:");
	        printList(head);
	    }
	}



