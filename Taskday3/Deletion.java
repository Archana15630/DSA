package dsa;
	class Node {
	    int data;
	    Node next;
	    
	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Deletion {  
	    Node head;
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (position == 0) {
	            head = head.next;
	            return;
	        }

	        Node temp = head;
	        int count = 0;
	        while (temp != null && count < position - 1) {
	            temp = temp.next;
	            count++;
	        }
	        if (temp != null && temp.next != null) {
	            temp.next = temp.next.next;
	        } else {
	            System.out.println("Invalid position.");
	        }
	    }
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	    
	    public static void main(String[] args) {
	        Deletion list = new Deletion();
	        list.head = new Node(10);
	        list.head.next = new Node(20);
	        list.head.next.next = new Node(30);
	        list.head.next.next.next = new Node(40);

	        System.out.println("Original list:");
	        list.printList();

	        list.deleteAtPosition(2); 
	        System.out.println("After deletion:");
	        list.printList();
	    }
	}




