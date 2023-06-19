package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int [] arr= {5,78,2,56,7,1,8,24};
	System.out.println("Before :"+Arrays.toString(arr));
	selectionSort(arr);
	System.out.println("After :"+Arrays.toString(arr));
	
	}

}
