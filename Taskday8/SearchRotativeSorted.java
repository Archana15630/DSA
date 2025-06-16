package dsa;

public class SearchRotativeSorted {
	    public static int search(int[] arr, int left, int right, int target) {
	        if (left > right) {
	            return -1; 
	        }

	        int mid = left + (right - left) / 2;

	        if (arr[mid] == target) {
	            return mid;
	        }
	        if (arr[left] <= arr[mid]) {
	            if (target >= arr[left] && target < arr[mid]) {
	                return search(arr, left, mid - 1, target);
	            } else {
	                return search(arr, mid + 1, right, target);
	            }
	        } else { // Right half is sorted
	            if (target > arr[mid] && target <= arr[right]) {
	                return search(arr, mid + 1, right, target); // Search in right half
	            } else {
	                return search(arr, left, mid - 1, target); // Search in left half
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = {30, 40, 50, 10, 20};
	        int target = 10;
	        int result = search(numbers, 0, numbers.length - 1, target);

	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    }
	}


