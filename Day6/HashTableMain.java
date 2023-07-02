package Day6;

import java.util.LinkedList;
import java.util.Scanner;



class HashTable {
	static class Pair {
		private int key;
		private String value;

		public Pair() {
			key = 0;
			value = "";
		}

		public Pair(int key, String value) {
			super();
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}

	}

	private LinkedList<Pair> table[];
	private static final int SLOTS = 10;

	public int hash(int key) {
		return key % SLOTS;
	}

	public HashTable() {
		table = new LinkedList[SLOTS];
		for (int i = 0; i < SLOTS; i++) {
			table[i] = new LinkedList<>();
		}

	}

	public void put(int key, String value) {
		int slot = hash(key);
		LinkedList<Pair> bucket = table[slot];
		for (Pair p : bucket) {
			if (key == p.key) {
				p.value = value;
				return;
			}
		}
		Pair pair = new Pair(key, value);
		bucket.add(pair);

	}

	public String get(int key) {
		int slot = hash(key);
		LinkedList<Pair> bucket = table[slot];
		for (Pair p : bucket) {
			if (key == p.key) {
				return p.value;
			}
		}
		return null;

	}
}

public class HashTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashTable ht = new HashTable();
		ht.put(1, "Nilesh");
		ht.put(4, "Nitin");
		ht.put(8, "Sandeep");
		ht.put(5, "Amit");
		ht.put(24, "Vishal");
		ht.put(34, "Yogesh");
		ht.put(25, "Aakash");

		System.out.print("Enter roll to find: ");
		int roll = sc.nextInt();
		String name = ht.get(roll);
		System.out.println("Name found: " + name);

		ht.put(1, "Rohan");
	}

}
