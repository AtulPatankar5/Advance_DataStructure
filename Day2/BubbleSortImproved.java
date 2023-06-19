package Day2;

import java.util.Arrays;

import org.w3c.dom.Node;

public class BubbleSortImproved {

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {// External loop
			boolean flag=false;
			for (int j = 0; j < arr.length-1-i; j++) {// Comparison
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag=true;
				}
			}
			if(!flag)
				break;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 6, 4, 2, 8, 3, 1 };
		System.out.println("Before:" + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After:" + Arrays.toString(arr));

	}

}
