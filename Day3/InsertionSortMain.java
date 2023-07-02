package Day3;

import java.util.Arrays;

public class InsertionSortMain {

	public static void insertionSort(int[] arr) {

		for (int j = 1; j < arr.length - 1; j++) {
			int temp = arr[j];
			int i;
			for (i = j - 1; i >= 0 && arr[i] > temp; i--) {
				arr[i + 1] = arr[i];
			}
			arr[i + 1] = temp;
		}

	}

	public static void main(String[] args) {

		int[] arr = { 6, 4, 2, 8, 3, 1 };
		System.out.println("Before : " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After : " + Arrays.toString(arr));

	}

}

//for (int i = 1; i < arr.length; i++) {
//int j, temp = arr[i];
//for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
//	arr[j + 1] = arr[j];
//}
//arr[j + 1] = temp;
//}
