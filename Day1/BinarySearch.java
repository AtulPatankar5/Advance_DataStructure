package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1, middle;
		while (left <= right) {
			middle = (left + right) / 2;

			if (key == arr[middle])
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
		int[] arr = { 44, 22, 55, 11, 88, 99, 33, 77, 66 };
		Arrays.sort(arr);
		System.out.println("Elements are" + Arrays.toString(arr));
		System.out.println("enter key to search");
		int index = binarySearch(arr, sc.nextInt());
		if (index == -1)
			System.out.println("element not found");
		else
			System.out.println("Element are present at index  :" + index);

	}

}
