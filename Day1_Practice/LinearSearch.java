package Day1_Practice;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int num) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				return i;
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = { 44, 33, 55, 77, 11, 22, 88, 99 };
		System.out.println("Enter the string to find");
		int index = linearSearch(arr, sc.nextInt());
		if (index == -1)
			System.out.println("Element not found ");
		else
			System.out.println("Element is " + index);
	}

}
