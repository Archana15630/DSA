package dsa;

public class Queue_ed {
	    int[] queue = new int[5];
	    int front = -1, rear = -1;

	    
	    void enqueue(int value) {
	        if (rear == queue.length - 1) {
	            System.out.println("Queue is full (Overflow)");
	        } else {
	            if (front == -1) front = 0;
	            queue[++rear] = value;
	            System.out.println(value + " enqueued into queue");
	        }
	    }


	    void dequeue() {
	        if (front == -1 || front > rear) {
	            System.out.println("Queue is empty (Underflow)");
	        } else {
	            System.out.println(queue[front++] + " dequeued from queue");
	        }
	    }

	   
	    void display() {
	        if (front == -1 || front > rear) {
	            System.out.println("Queue is empty");
	        } else {
	            System.out.print("Queue elements: ");
	            for (int i = front; i <= rear; i++) {
	                System.out.print(queue[i] + " ");
	            }
	            System.out.println();
	        }
	    }

	    
	    public static void main(String[] args) {
	    	Queue_ed q = new Queue_ed();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
	        q.display();
	        q.dequeue();
	        q.display();
	    }
	}





