package dsa;

	import java.util.Arrays;

	public class Array2 {
	    public static int[] deleteElement(int[] arr, int index) {
	        int[] newArray = new int[arr.length - 1]; // 
	        for (int i = 0, j = 0; i < arr.length; i++) {
	            if (i != index) {
	                newArray[j++] = arr[i]; // 
	            }
	        }
	        return newArray;
	    }

	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40};
	        array = deleteElement(array, 1);
	        System.out.println(Arrays.toString(array)); 
	    }
	}


