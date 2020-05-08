package com.binary;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 13, 21, 36, 47, 63, 81, 97 };
		Integer result = doBinarySearch(arr, 0, arr.length - 1, 200);
		String output = result == -1 ? "Number not found." : "Number found at index " + String.valueOf(result);
		System.out.println(output);
	}

	private static int doBinarySearch(int[] arr, int start, int end, int numToSearch) {

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (numToSearch == arr[mid])
				return mid;
			else if (numToSearch < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}

		return -1;
	}

}
