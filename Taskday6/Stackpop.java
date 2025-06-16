package dsa;

public class Stackpop{
	
	     int maxSize;
	     int top;
	     int[] stackArray;

	    public Stackpop(int size) {
	        maxSize = size;
	        stackArray = new int[maxSize];
	        top = -1;
	    }
	    public void push(int value) {
	        if (top == maxSize - 1) {
	            System.out.println("Stack Overflow!");
	            return;
	        }
	        stackArray[++top] = value;
	        System.out.println(value + " pushed to stack");
	    }
	    public int pop() {
	        if (top == -1) {
	            System.out.println("Stack Underflow!");
	            return -1; 
	        }
	        return stackArray[top--];
	    }
	    public void display() {
	        if (top == -1) {
	            System.out.println("Stack is empty");
	            return;
	        }
	        System.out.print("Stack elements: ");
	        for (int i = top; i >= 0; i--) {
	            System.out.print(stackArray[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Stackpop myStack = new Stackpop(5);
	        myStack.push(10);
	        myStack.push(20);
	        myStack.push(30);
	        myStack.display();

	        System.out.println("Popped element: " + myStack.pop());
	        myStack.display();
	    }
	}


