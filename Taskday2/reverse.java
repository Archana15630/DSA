package dsa;


	import java.util.Arrays;

	public class reverse{
        public static void main(String[] args) {

	        int[] array = {4, 2, 10, 7, 5, 3, 8};

	        Arrays.sort(array);

	        System.out.println("Sorted (ascending): " + Arrays.toString(array));

	        int start = 0;

	        int end = array.length - 1;

	        while (start < end) {

	            int temp = array[start];

	            array[start] = array[end];

	            array[end] = temp;
	            start++;

	            end--;
          System.out.println("Sorted then reversed: " + Arrays.toString(array));

	    }}}




