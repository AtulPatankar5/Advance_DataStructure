package Day6;

import java.util.Scanner;

class LinearQueue {
	private int[] arr;
	private int rear, front;

	public LinearQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public boolean isFull() {
		return rear == arr.length - 1;
	}

	public void push(int val) {
		if (rear == arr.length - 1)
			throw new RuntimeException("Queue Full");
		else {
			rear++;
			arr[rear] = val;
		}
	}

	public void pop() {
		if (isEmpty())
			throw new RuntimeException("Queue Empty");
		front++;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Queue Empty");
		}
		return arr[front+1];
	}
}

public class LinearQueueMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinearQueue l = new LinearQueue(6);
		int val;
		boolean flag = false;
		do {
			System.out.println("1. Push 2. Pop  3. peek 0. Exit");
			switch (sc.nextInt()) {
			case 1:
				try {
					System.out.println("Enter value to push");
					l.push(sc.nextInt());
					System.out.println("value Pushed");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				try {
					val = l.peek();
					l.pop();
					System.out.println("This value is poped : " + val);

				} catch (Exception e) {
					e.getMessage();
				}
				break;
			case 3:
				try {

					val = l.peek();
					System.out.println("Peeked :"+val);

				} catch (Exception e) {
					e.getMessage();
				}
				break;
			case 0:
				flag = true;
				break;
			}
		} while (!flag);
	}

}
