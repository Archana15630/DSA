package dsa;
import java.util.Arrays;
public class LowBound {
	  public static int lowerBound(int[] arr, int target) {
		        int left = 0, right = arr.length;

		        while (left < right) {
		            int mid = left + (right - left) / 2;

		            if (arr[mid] < target) {
		                left = mid + 1; 
		            } else {
		                right = mid;
		            }
		        }
		        return left; 
		    }

		    public static void main(String[] args) {
		        int[] numbers = {10, 20, 30, 30, 40, 50}; // Sorted array
		        int target = 30;
		        
		        int index = lowerBound(numbers, target);
		        System.out.println("Lower bound index of " + target + " is: " + index);
		    }
		}



