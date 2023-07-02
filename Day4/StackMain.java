package Day4;

import java.util.Scanner;

class Stack {
	private int[] arr;
	private int top;

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

	public void push(int val) {
		if (isFull())
			throw new RuntimeException("Stack is full");
		top++;
		arr[top] = val;
	}

	public void pop() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty");
		top--;
	}

	public int peek() {
		return arr[top];
	}

}

public class StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(10);
		boolean flag = false;
		while (!flag) {
			System.out.println("1. Push \n2. Pop\n3. Peek ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter element");
				s.push(sc.nextInt());
				break;
			case 2:
				s.pop();
				break;
			case 3:
				System.out.println(s.peek());
				break;

			case 0:
				flag = true;
				break;
			}
		}
	}

}
