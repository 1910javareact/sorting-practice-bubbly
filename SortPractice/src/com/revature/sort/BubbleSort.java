package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		//find largest value
		//put largest value to the end
		
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			int min = arr[i];
			int minId = i;
			
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[j] > min) {
					min = arr[j];
					minId = j;
				}
			}
			
			temp = arr[i];
			arr[i] = min;
			arr[minId] = temp;
		}
	}
}
