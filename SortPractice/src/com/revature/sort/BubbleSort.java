package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		//find largest value
		//put largest value to the end
		
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			//var for keeping track of minimum index and value
			int min = arr[i];
			int minIndex = i;
			
			
			for(int j = i + 1; j < arr.length; j++) {
				//if arr index > min, change min index and value
				if(arr[j] > min) {
					min = arr[j];
					minIndex = j;
				}
			}
			
			//swap numbers
			temp = arr[i];
			arr[i] = min;
			arr[minIndex] = temp;
		}
	}
}
