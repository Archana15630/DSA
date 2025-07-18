package dsa;


	import java.util.Arrays;

	public class MergeSort {
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = left + (right - left) / 2; // Find the middle index

	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	            merge(arr, left, mid, right);
	        }
	    }

	    private static void merge(int[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1; // Size of left subarray
	        int n2 = right - mid; // Size of right subarray

	        int[] leftArr = new int[n1];
	        int[] rightArr = new int[n2];

	        System.arraycopy(arr, left, leftArr, 0, n1);
	        System.arraycopy(arr, mid + 1, rightArr, 0, n2);
	        int i = 0, j = 0, k = left;
	        while (i < n1 && j < n2) {
	            if (leftArr[i] <= rightArr[j]) {
	                arr[k] = leftArr[i];
	                i++;
	            } else {
	                arr[k] = rightArr[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            arr[k] = leftArr[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            arr[k] = rightArr[j];
	            j++;
	            k++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
	        System.out.println("Original Array: " + Arrays.toString(arr));

	        mergeSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted Array: " + Arrays.toString(arr));
	    }
	}


