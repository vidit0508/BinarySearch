package com.binary;

public class CountNumInArrByBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 9, 10, 10, 10, 10, 10, 63, 90, 90 };
		Integer firstIndex = findCountByBinarySearch(arr, 0, arr.length - 1, 10, true);
		String output = "";
		if (firstIndex == -1) {
			output = "Count of number 10 is 0";
		} else {
			Integer lastIndex = findCountByBinarySearch(arr, 0, arr.length - 1, 10, false);
			output = "Count of number 10 is =  " + String.valueOf(lastIndex - firstIndex + 1);
		}

		System.out.println(output);
	}

	private static Integer findCountByBinarySearch(int[] arr, int start, int end, int k, boolean searchFirst) {

		int result = -1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == k) {

				if (searchFirst)
					end = mid - 1;
				else
					start = mid + 1;

				result = mid;
			} else if (arr[mid] > k) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return result;
	}

}
