package QueueUsingArray;

import java.util.Arrays;

public class Queue {
	static int[] queue;
	int front;
	int rear;

	public Queue(int size) {
		queue = new int[size];
		front = -1;
		rear = -1;
	}

	public void enqueu(int data) {
		rear++;
		if (rear == queue.length) {
			rear = 0;
		}
		if (rear == front) {
			System.out.println("Queue is full");
			rear--;
			if (rear == -1) {
				rear = queue.length - 1;
			}
			return;
		}
		if (front == -1) {
			front++;
		}
		queue[rear] = data;
		System.out.println(Arrays.toString(queue));
	}

	public int dequeu() {
		if (front == -1) {
			return -1;
		}
		if (front == rear) {
			int element = queue[front];
			front = -1;
			rear = -1;
			return element;
		}
		int element = queue[front];
		front++;
		if (front == queue.length) {
			front = 0;
		}
		return element;
	}

}
