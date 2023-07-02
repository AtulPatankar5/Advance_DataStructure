package Day6;

class BinarySearchTree {
	static class Node {
		private int data;
		private Node left, right;

		public Node() {
			data = 0;
			left = null;
			right = null;

		}

		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(int val) {
		Node newNode = new Node(val);
		if (root == null) {
			root = newNode;

		} else {
			Node trav = root;
			while (true) {
				if (val < trav.data) {
					if (trav.left != null) {
						trav = trav.left;
					} else {

						trav.left = newNode;
						break;
					}
				} else {

					if (trav.right != null) {
						trav = trav.right;
					} else {
						trav.right = newNode;
						break;
					}
				}
			}
		}
	}

	public void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.data + ",");
		preOrder(trav.left);
		preOrder(trav.right);
	}

	public void PreOrder() {
		preOrder(root);
	}

	public void postOrder(Node trav) {
		if (trav == null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data + ",");
	}

	public void postOrder() {
		postOrder(root);
	}

	public void InOrder(Node trav) {
		if (trav == null)
			return;
		InOrder(trav.left);
		System.out.print(trav.data + ",");
		InOrder(trav.right);
	}

	public void InOrder() {
		InOrder(root);
	}

}

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree t = new BinarySearchTree();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(90);
		t.add(100);
		t.add(40);
		t.add(70);
		t.add(80);
		t.add(60);
		t.add(20);

		System.out.println("preOrder");
		t.PreOrder();
		System.out.println();
		System.out.println("PostOrder");
		t.postOrder();
		System.out.println();
		System.out.println("InOrder");
		t.InOrder();
	}

}
