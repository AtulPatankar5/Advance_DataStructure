package Day1;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}

		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 44, 22, 55, 11, 88, 99, 33, 77, 66 };
		System.out.println("enter key to search");
		int index = linearSearch(arr, sc.nextInt());
		if (index == -1)
			System.out.println("element not found");
		else
			System.out.println("Element is :" + index);
	}

}
