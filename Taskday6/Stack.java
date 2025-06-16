package dsa;

public class Stack {
	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	
	     Node top;

	    public Stack() {
	        this.top = null;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	        System.out.println(data + " pushed onto stack.");
	    }

	    public void pop() {
	        if (isEmpty()) {
	            System.out.println("Stack Underflow! No elements to pop.");
	            return;
	        }
	        System.out.println("Popped: " + top.data);
	        top = top.next;
	    }

	    public void peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty!");
	            return;
	        }
	        System.out.println("Top element: " + top.data);
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty!");
	            return;
	        }
	        Node temp = top;
	        System.out.print("Stack elements: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	


	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.display();
	        stack.peek();
	        stack.pop();
	        stack.display();
	    }
	}


