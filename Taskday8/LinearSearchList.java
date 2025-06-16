package dsa;
import java.util.List;
	import java.util.Arrays;

	public class LinearSearchList {
	    public static int search(List<Integer> list, int target) {
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i) == target) {
	                return i; 
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 25, 36, 47, 50, 89);
	        int target = 50;
	        int result = search(numbers, target);

	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the list.");
	        }
	    }
	}


