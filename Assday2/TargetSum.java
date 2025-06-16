package dsa;

	import java.util.Arrays;

	public class TargetSum {
		    public static void main(String[] args) {
		        int[] arr = {2, 7, 11, 15};
		        int target = 9;

		        Arrays.sort(arr);  // Sort the array first
		        int left = 0;
		        int right = arr.length - 1;

		        while (left < right) {
		            int sum = arr[left] + arr[right];

		            if (sum == target) {
		                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
		                return;
		            } else if (sum < target) {
		                left++;
		            } else {
		                right--;
		            }
		        }

		        System.out.println("No pair found.");
		    }
		}



