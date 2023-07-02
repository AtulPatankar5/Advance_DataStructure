package Day3;

import java.util.Scanner;

class SinglyCircularList {
	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public Node() {
			this.data = 0;
			this.next = null;
		}
	}

	private Node head;

	public SinglyCircularList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	void display() {
		Node trav = head;
		if (isEmpty())
			throw new RuntimeException("No element in List");
		do {
			System.out.println(trav.data);
			trav = trav.next;
		} while (trav != head);
		
	}

	void addLast(int data) {
		Node newNode = new Node(data);
		Node trav = head;
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			while (trav.next != head) {
				trav = trav.next;
			}
			newNode.next = head;
			trav.next = newNode;
		}
	}

	void addFirst(int data) {
		Node newNode = new Node(data);
		Node trav = head;

		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			while (trav.next != head) {
				trav = trav.next;
			}
			newNode.next = head;
			trav.next = newNode;
			head = newNode;
		}

	}

	void addAtPos(int pos, int data) {
		Node newNode = new Node(data);
		Node trav = head;
		if (isEmpty() || pos <= 1) {
			addFirst(data);
		} else {
			for (int i = 1; i < (pos - 1); i++) {
				if (trav.next == head)
					break;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}

	}

	void deleteFirst() {
		if (isEmpty())
			throw new RuntimeException("List is Empty");

		if (head.next == head)
			head = null;
		else {
			Node trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}
			head = head.next;
			trav.next = head;
		}
	}

	void deleteAll() {
		head.next = null;
		head = null;
	}

	void deleteAtPos(int pos) {
		Node trav = head;
		Node temp = null;
		if (pos == 1)
			deleteFirst();
		if (head == null || pos < 1)
			throw new RuntimeException("List is empty");

		for (int i = 1; i < pos; i++) {
			if (trav.next == head)
				throw new RuntimeException("Array out of Bound");
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;

	}

	void deleteAtLast() {

		if (head == null)
			throw new RuntimeException("List is Empty");
		if (head.next == head) {
			head = null;
		} else {
			Node trav = head;
			Node temp = null;
			while (trav.next != head) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = trav.next;
		}
	}
}

public class SinglyCicularListMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SinglyCircularList sl = new SinglyCircularList();
		boolean flag = false;
		while (!flag) {
			System.out.println("1. Display  \n" + "2. Add last \n" + "3. Add First\n" + "4. Add At Position\n"
					+ "5. Delete First\n" + "6. Delete All\n" + "7. Delete at Pos\n" + "0. Exit");
			switch (sc.nextInt()) {
			case 1:
				sl.display();
				break;

			case 2:
				System.out.println("Enter Data");
				sl.addLast(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter Data to be added at first");
				sl.addFirst(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter Data to be added at Specific and data");
				sl.addAtPos(sc.nextInt(), sc.nextInt());
				break;

			case 5:
				sl.deleteFirst();
				break;
			case 6:
				sl.deleteAll();
				break;

			case 7:
				sl.deleteAtPos(sc.nextInt());
				break;
			case 8:
				sl.deleteAtLast();
				break;
			case 0:
				flag = true;
				break;
			}
		}
	}
}
