package com.binary;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 13, 21, 36, 47, 63, 81, 97 };
		Integer result = doBinarySearch(arr, 0, arr.length - 1, 21);
		String output = result == -1 ? "Number not found." : "Number found at index " + String.valueOf(result);
		System.out.println(output);
	}

	private static int doBinarySearch(int[] arr, int start, int end, int numToSearch) {

		while (start <= end) {
			int mid = start + (end - start) / 2; // calculating by this way will stop overflowing of Integer range

			if (arr[mid] == numToSearch)
				return mid;
			else if (arr[mid] > numToSearch)
				return doBinarySearch(arr, start, mid - 1, numToSearch);
			else
				return doBinarySearch(arr, mid + 1, end, numToSearch);

		}
		return -1;
	}

}
