package dsa;


	import java.util.Arrays;
	import java.util.Scanner;

	public class Binaryrecursive {
	    public static int binarySearch(int[] arr, int left, int right, int target) {
	        if (left > right) {
	            return -1; // Base case: target not found
	        }

	        int mid = left + (right - left) / 2;

	        if (arr[mid] == target) {
	            return mid; // Target found
	        } else if (arr[mid] > target) {
	            return binarySearch(arr, left, mid - 1, target); // Search in left half
	        } else {
	            return binarySearch(arr, mid + 1, right, target); // Search in right half
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get array input from user
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] numbers = new int[n];

	        System.out.println("Enter " + n + " sorted numbers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // Get target element input
	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();

	        // Ensure array is sorted before searching
	        Arrays.sort(numbers);

	        int result = binarySearch(numbers, 0, numbers.length - 1, target);

	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the array.");
	        }

	        scanner.close();
	    }
	}


