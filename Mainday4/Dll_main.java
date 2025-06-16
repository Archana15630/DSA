package dsa;


	class Dll_main {
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
	    
	    // Insert at end for testing
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
	    
	    // Traverse from front to end
	    public void traverseForward() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        System.out.print("Forward traversal: ");
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    
	    // Traverse from end to front
	    public void traverseBackward() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        // Move to the end first
	        Node temp = head;
	        while (temp.next != null) temp = temp.next;
	        
	        System.out.print("Backward traversal: ");
	        // Traverse backward using prev pointer
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.prev;
	        }
	        System.out.println();
	    }
	    
	    public static void main(String[] args) {
	        Dll_main dll = new Dll_main();
	        
	        dll.insertAtEnd(1);
	        dll.insertAtEnd(2);
	        dll.insertAtEnd(3);
	        dll.insertAtEnd(4);
	        
	        dll.traverseForward();   // Output: 1 2 3 4
	        dll.traverseBackward();  // Output: 4 3 2 1
	    }
	}


