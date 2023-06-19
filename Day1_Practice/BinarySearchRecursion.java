package Day1_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {

	public static int binarySearchRecursion(int[] arr, int left, int right, int key) {
		int middle, index;
		if (right < left)
			return -1;

		middle = (left + right) / 2;
		if (arr[middle] == key)
			return middle;
		if (key > arr[middle])
			index = binarySearchRecursion(arr, middle + 1, right, key);
		else
			index = binarySearchRecursion(arr, left, middle - 1, key);

		return index;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 44, 77, 22, 66, 11, 88, 33, 99 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("enter key to find ");
		int right = arr.length - 1;
		int index = binarySearchRecursion(arr, 0, right, sc.nextInt());
		if (index == -1)
			System.out.println("Element not found");
		else
			System.out.println("Index : " + index);

	}
}
