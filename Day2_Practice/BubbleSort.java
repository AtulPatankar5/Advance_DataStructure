package Day2_Practice;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					System.out.println("count1");
				}
			}
		}
	}

	public static void improvedbubbleSort(int[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					flag = true;
					System.out.println("count2");
				}
			}
			if (!flag)
				break;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 4, 3, 6, 7, 2, 1, 5 };
		System.out.println("Before Sort: " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After Sort:" + Arrays.toString(arr));

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Best Case Before Sort : " + Arrays.toString(arr));
		improvedbubbleSort(arr2);
		System.out.println("Best Case After Sort:" + Arrays.toString(arr));

	}

}
