package com.binary;

/**
 * array should be sorted and all elements should be distinct
 */
public class FindRotationCountByBinarySearch {

	public static void main(String[] args) {

		int[] arr = { 90, 10, 20, 30, 40, 50, 63, 81 };
		System.out.println(findRotationCountByBinarySearch(arr, 0, arr.length - 1));

	}

	private static Integer findRotationCountByBinarySearch(int[] arr, int start, int end) {

		while (start <= end) {

			if (arr[start] <= arr[end])
				return start;

			int mid = start + (end - start) / 2;
			
			int next = (mid + 1) % arr.length, prev = (mid + arr.length - 1) % arr.length;

			if (arr[mid] <= arr[next] && arr[mid] <= arr[prev])
				return mid;
			else if (arr[mid] <= arr[end])
				end = mid - 1;
			else if (arr[mid] >= arr[start])
				start = mid + 1;

		}

		return -1;
	}

}
