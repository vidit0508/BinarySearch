package com.binary;

public class FindElementInCircularlySortedArr {

	public static void main(String[] args) {

		int[] arr = { 90, 101, 10, 20, 30, 40, 50, 63, 81 };
		System.out.println(findElementInCircularRotatedArr(arr, 0, arr.length - 1, 20));

	}

	private static int findElementInCircularRotatedArr(int[] arr, int low, int high, int k) {

		while (low <= high) {

			int mid = (low + high) / 2;

			// case 1 = when k found
			if (k == arr[mid])
				return mid;

			// case 2 = right half is sorted
			if (arr[mid] <= arr[high]) {

				if (k > arr[mid] && k <= arr[high])
					low = mid + 1; // search in right half
				else
					high = mid - 1;

			}
			// case 3 = left half is sorted
			else {

				if (arr[low] <= k && k < arr[mid])
					high = mid - 1;
				else
					low = mid + 1;
			}

		}

		return -1;
	}

}
