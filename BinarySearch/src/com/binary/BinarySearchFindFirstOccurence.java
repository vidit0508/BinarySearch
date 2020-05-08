package com.binary;

public class BinarySearchFindFirstOccurence {
	
	public static void main(String[] args) {
		int[] arr = { 9,10, 13, 21, 29, 47, 63, 90, 90 };
		Integer result = doFindFirstBinarySearch(arr, 0, arr.length - 1, 90);
		String output = result == -1 ? "Number not found." : "Number found at index " + String.valueOf(result);
		System.out.println(output);
	}

	private static Integer doFindFirstBinarySearch(int[] arr, int start, int end, int x) {
		
		int result = -1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if (arr[mid] == x) {
				end = mid - 1;
				result = mid;
			} else if (arr[mid] > x) {
				end = mid - 1;
			} else {
				start = mid+1;
			}
			
		}
		
		return result;
	}

}
