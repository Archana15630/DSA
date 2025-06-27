package dsa_addon;

public class PostAssignment {
		//LeetCode Problem Set
	    public long countFixedBoundSubarrays(int[] nums, int minK, int maxK) {
	        long res = 0;
	        int lastMin = -1, lastMax = -1, lastInvalid = -1;
	        
	        for (int i = 0; i < nums.length; i++) {
	            int num = nums[i];
	            if (num < minK || num > maxK) {
	                lastInvalid = i;
	                lastMin = -1;
	                lastMax = -1;
	            }
	            if (num == minK) lastMin = i;
	            if (num == maxK) lastMax = i;
	            
	            int validStart = Math.min(lastMin, lastMax);
	            if (validStart > lastInvalid) {
	                res += validStart - lastInvalid;
	            }
	        }
	        
	        return res;
	    }
	    public static void main(String[] args) {
	        PostAssignment solution = new PostAssignment();

	        int[] nums1 = {1, 3, 5, 2, 7, 5};
	        int minK1 = 1, maxK1 = 5;
	        System.out.println(solution.countFixedBoundSubarrays(nums1, minK1, maxK1)); 

	        int[] nums2 = {1, 1, 1, 1};
	        int minK2 = 1, maxK2 = 1;
	        System.out.println(solution.countFixedBoundSubarrays(nums2, minK2, maxK2)); 
	    }
	}

