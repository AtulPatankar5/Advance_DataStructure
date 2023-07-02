package Day6;

import java.util.Scanner;

class CircularQueue {
	private int[] arr;
	private int rear, front;

	public CircularQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;
	}

	public boolean isFull() {
		return front == -1 && rear == (arr.length - 1) || rear == front && front != -1;
	}

	public boolean isEmpty() {
		return front == rear && front == -1;
	}

	public void push(int val) {
		if (isFull())
			throw new RuntimeException("Queue is full");
		else {
			rear++;
			arr[rear] = val;
		}
	}

	public void pop() {

		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		} else {
			front = (front + 1) % arr.length;
			if (front == rear) {
				front = -1;
				rear = -1;
			}
		}
	}

	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		int index = (front + 1) % arr.length;
		return arr[index];
	}
}

public class CircularQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		CircularQueue c = new CircularQueue(6);
		boolean flag = false;
		while (!flag) {
			System.out.println("1. push  2. Pop 3. Peek 0 .Exit");
			switch (sc.nextInt()) {
			case 1:
				try {
					System.out.println("enter value");
					c.push(sc.nextInt());

				} catch (Exception e) {
					e.getMessage();
				}

				break;

			case 2:
				try {
					int peek = c.peek();
					c.pop();
					System.out.println("Value popep:" + peek);
				} catch (Exception e) {
					e.getMessage();
				}
				break;
			case 3:
				try {

					int val=c.peek();
					System.out.println("Value :"+ val);
						
				} catch (Exception e) {
					// TODO: handle exception
					e.getMessage();
				}

				break;
			case 0:
				flag = true;
				break;
			}
		}
	}

}
