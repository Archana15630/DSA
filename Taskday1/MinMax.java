package dsa;

	public class MinMax{
	    public static void findMinMax(int[] arr) {
	        int min = arr[0];
	        int max = arr[0];

	        for (int num : arr) {
	            if (num < min) {
	                min = num;
	            }
	            if (num > max) {
	                max = num;
	            }
	        }

	        System.out.println("Minimum element: " + min);
	        System.out.println("Maximum element: " + max);
	    }

	    public static void main(String[] args) {
	        int[] array = {12, 45, 2, 67, 34, 89, 5};
	        findMinMax(array);
	    }
	}

