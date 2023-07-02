package Day4;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

class Doubly {

	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node() {
			data = 0;
			next = null;
			prev = null;
		}

		public Node(int val) {
			this.data = val;
			this.next = null;
			this.prev = null;
		}
	}

	private Node head;

	public Doubly() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	void display() {
		Node trav = head;
		do {
			System.out.println(trav.data);
			trav = trav.next;
		} while (trav != head);

	}

	void reverseDisplay() {
		if (head == null)
			return;

		Node trav = head;
		while (trav.next != null) {
			trav = trav.next;
		}

		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.prev;
		}
	}

	void addFirst(int val) {
		Node newNode = new Node(val);
		Node trav = head;
		if (isEmpty())
			head = newNode;
		else {
			trav = head.prev;
			newNode.next = head;
			newNode.prev = trav;
			trav.next = newNode;
			head.prev = newNode;
			head = newNode;

		}
	}

	void addLast(int val) {
		Node newNode = new Node(val);
		Node trav = head;
		if (head == null) {
			head = newNode;
		} else {
			trav = head.prev;
			newNode.next = head;
			newNode.prev = trav;
			trav.next = newNode;
			head.prev = newNode;

		}
	}

	void addAtPosition(int val, int pos) {
		Node newNode = new Node(val);
		Node trav = head;
		Node temp = null;
		if (isEmpty()) {
			addFirst(val);
		} else {
			for (int i = 1; i < pos; i++) {
				temp = trav;
				trav = trav.next;
			}
			newNode.next = trav;
			newNode.prev = temp;
			temp.next = newNode;
			if (trav != null)
				trav.prev = newNode;
		}
	}

	void deleteFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Not eleement ");
		}
		if (head.next == null)
			head = null;
		else {
			head = head.next;
			head.prev = null;
		}
	}

	void deleteAtPos(int pos) {
		Node trav = head;
		if (isEmpty())
			throw new RuntimeException("no element found");
		for (int i = 1; i < pos; i++) {
			trav = trav.next;
		}
		trav.prev.next = trav.next;
		if (trav.next != null)
			trav.next.prev = trav.prev;
	}
}

public class DoublyCircularLinkedList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Doubly d = new Doubly();
		boolean flag = false;
		while (!flag) {
			System.out.println("1. Display \n" + "2. Reverse Display\n" + "3. Add Last\n" + "4. Add First\n"
					+ "5. Add at Position\n" + "6. delete First\n" + "7. delete at Pos\n");

			switch (sc.nextInt()) {
			case 1:
				d.display();
				break;
			case 2:
				d.reverseDisplay();
				break;
			case 3:
				System.out.println("enter element ");
				d.addLast(sc.nextInt());
				break;
			case 4:
				System.out.println("enter element ");
				d.addFirst(sc.nextInt());
				break;
			case 5:

				System.out.println("Enter  value and position to add");
				d.addAtPosition(sc.nextInt(), sc.nextInt());
				break;
			case 6:
				d.deleteFirst();
				break;
			case 7:
				System.out.println("Enter a pos to delete");
				d.deleteAtPos(sc.nextInt());
				break;
			case 0:
				flag = true;
				break;
			}
		}
	}

}
