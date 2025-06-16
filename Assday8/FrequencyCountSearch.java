package dsa;
	import java.util.Arrays;
	public class FrequencyCountSearch {
	    // Binary search for first occurrence
	    public static int firstOccurrence(int[] arr, int target) {
	        int left = 0, right = arr.length - 1, result = -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == target) {
	                result = mid;
	                right = mid - 1; // Move left to find first occurrence
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }
	    public static int lastOccurrence(int[] arr, int target) {
	        int left = 0, right = arr.length - 1, result = -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == target) {
	                result = mid;
	                left = mid + 1; // Move right to find last occurrence
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }
	    public static int frequencyCount(int[] arr, int target) {
	        int first = firstOccurrence(arr, target);
	        if (first == -1) return 0; 
	        int last = lastOccurrence(arr, target);
	        return last - first + 1;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 20, 20, 30, 40, 50};
	        int target = 20;

	        int frequency = frequencyCount(numbers, target);
	        System.out.println("Frequency of " + target + " is: " + frequency);
	    }
	}


