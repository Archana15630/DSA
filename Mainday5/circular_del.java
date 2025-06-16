package addon_dsa;

public class circular_del {
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
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node temp = head;
	        if (position == 1) { 
	            if (head == tail) { 
	                head = null;
	                tail = null;
	                return;
	            } else {
	                head = head.next;
	                tail.next = head; 
	                return;
	            }
	        }
	        Node prev = null;
	        int count = 1;
	        do {
	            if (count == position) {
	                prev.next = temp.next;
	                if (temp == tail) { 
	                    tail = prev;
	                    tail.next = head;
	                }
	                return;
	            }
	            prev = temp;
	            temp = temp.next;
	            count++;
	        } while (temp != head);

	        System.out.println("Invalid position: " + position);
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
	    	circular_del cll = new circular_del();
	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);

	        System.out.println("Original List:");
	        cll.display();

	        cll.deleteAtPosition(2);
	        System.out.println("After Deletion:");
	        cll.display();
	    }
	}

