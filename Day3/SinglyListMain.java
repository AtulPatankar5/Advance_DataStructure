package Day3;

import java.util.Scanner;

class SinglyList {
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

	public SinglyList() {
		head = null;
	}

	void reverseDisplay() {
		Node oldHead = head;
		head = null;
		while (oldHead != null) {
			Node temp = oldHead;
			oldHead = oldHead.next;

			temp.next = head;
			head = temp;

		}
	}

	void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " , ");
			trav = trav.next;
		}
		System.out.println();
	}

	void addLast(int data) {
		Node newNode = new Node(data);
		Node trav = head;
		if (head == null)
			head = newNode;
		else {
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
	}

	void addFirst(int data) {
		Node newNode = new Node(data);
		Node trav = head;
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	void addAtPos(int pos, int data) {
		Node newNode = new Node(data);
		Node trav = head;
		if (head == null) {
			addFirst(data);
		} else {
			for (int i = 1; i < (pos - 1); i++) {
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}

	}

	void deleteFirst() {
		if (head == null) {
			throw new RuntimeException("List is Empty");
		} else {
			head = head.next;
		}
	}

	void deleteAll() {
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
			if (trav == null)
				throw new RuntimeException("Array out of Bound");
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;

	}

	void deleteAtLast() {

		if (head == null)
			throw new RuntimeException("List is Empty");
		if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			Node temp = null;
			while (trav.next != null) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = null;
		}
	}
}

public class SinglyListMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SinglyList sl = new SinglyList();
		boolean flag = false;
		while (!flag) {
			System.out.println("1. Display  \n" + "2. Add last \n" + "3. Add First\n" + "4. Add At Position\n"
					+ "5. Delete First\n" + "6. Delete All\n" + "7. Delete at Pos\n" + "8. delete at last\n"
					+ "9. reverse Display\n" + "0. Exit");
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
			case 9:
				sl.reverseDisplay();
				break;
			case 0:
				flag = true;
				break;
			}
		}
	}
}
