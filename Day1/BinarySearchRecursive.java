package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {

	public static int binarySearchrec(int[] arr, int key, int left, int right) {
		if (right < left)
			return -1;
		int index,middle;
		
		middle = (left + right) / 2;
		
		if (key == arr[middle])
			return middle;
		if (key < arr[middle])
			index=binarySearchrec(arr, key, left, middle - 1);
		else
			index = binarySearchrec(arr, key, middle + 1, right);

		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 44, 22, 55, 11, 88, 99, 33, 77, 66 };
		Arrays.sort(arr);
		System.out.println("Elements are" + Arrays.toString(arr));
		System.out.println("enter key to search");
		int right = arr.length;
		int index = binarySearchrec(arr, sc.nextInt(), 0, right);
		if (index == -1)
			System.out.println("element not found");
		else
			System.out.println("Element are present at index  :" + index);

	}

}
