package dsa;

public class SinglyStack {
	

		   
	    class Node {
	        int data;
	        Node next;
	    }

	    
	    Node top = null;

	   
	    void push(int value) {
	        Node newNode = new Node();
	        newNode.data = value;
	        newNode.next = top;
	        top = newNode;
	        System.out.println(value + " pushed to stack");
	    }

	   
	    void pop() {
	        if (top == null) {
	            System.out.println("Stack is empty (Underflow)");
	        } else {
	            System.out.println(top.data + " popped from stack");
	            top = top.next;
	        }
	    }

	   
	    void display() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.print("Stack elements: ");
	            Node temp = top;
	            while (temp != null) {
	                System.out.print(temp.data + " ");
	                temp = temp.next;
	            }
	            System.out.println();
	        }
	    }

	   
	    public static void main(String[] args) {
	    	SinglyStack stack = new SinglyStack();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.display();
	        stack.pop();
	        stack.display();
	    }
	}




