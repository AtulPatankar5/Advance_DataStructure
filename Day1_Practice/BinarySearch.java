package Day1_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1, middle;
		while (left <= right) {
			middle = (left + right) / 2;
			if (arr[middle] == key)
				return middle;
			if (key > arr[middle])
				left = middle + 1;
			else
				right = middle - 1;

		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 44, 77, 22, 66, 11, 88, 33, 99 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("enter key to find ");
		int index = binarySearch(arr, sc.nextInt());
		if (index == -1)
			System.out.println("Element not found");
		else
			System.out.println("Index : " + index);

	}
}
