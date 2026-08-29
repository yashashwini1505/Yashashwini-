package day8;

public class Circular_queue {
	static int[] queue = new int[5];

	static int front = 0;
	static int rear = -1;
	static int count = 0;

	static void enqueue(int value) {

	    if (count == queue.length) {
	        System.out.println("Queue is full");
	    }
	    else {
	        rear = (rear + 1) % queue.length;
	        queue[rear] = value;
	        count++;

	        System.out.println(value + " added");
	    }
	}

	static void dequeue() {

	    if (count == 0) {
	        System.out.println("Queue is empty");
	    }
	    else {
	        System.out.println(queue[front] + " removed");

	        front = (front + 1) % queue.length;
	        count--;
	    }
	}

	static void display() {

	    if (count == 0) {
	        System.out.println("Queue is empty");
	        return;
	    }

	    System.out.println("Queue available elements:");

	    int index = front;

	    for (int i = 0; i < count; i++) {
	        System.out.println(queue[index]);
	        index = (index + 1) % queue.length;
	    }
	}

	public static void main(String[] args) {

	    enqueue(10);
	    enqueue(20);
	    enqueue(30);
	    enqueue(40);
	    enqueue(50);

	    display();

	    dequeue();
	    dequeue();

	    display();

	    enqueue(60);
	    enqueue(70);

	    display();
	}
}

