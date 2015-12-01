package com.rohit.sorting;

public class BubbleSort {
		
	public void performSort(int unsortedArr[]) {
		
		System.out.println("----- Array before sorting -----");
		printArray(unsortedArr);
		for(int i=0; i<unsortedArr.length; i++) {
			for(int j=i; j<unsortedArr.length; j++) {
				if(unsortedArr[i] > unsortedArr[j]) {
					int temp = unsortedArr[i];
					unsortedArr[i] = unsortedArr[j];
					unsortedArr[j] = temp;
				}
			}
		}

		System.out.println("\n----- Array after sorting -----");
		printArray(unsortedArr);
	}
	
	public void printArray(int array[]) {
		for(int i : array) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void main(String args[]) {
		int arr[] = {3, 11, 5, 10, 8, 20, 4, 2, 99, 0, -1, 7, 13, 19, 23, 29};
		new BubbleSort().performSort(arr);
	}
}