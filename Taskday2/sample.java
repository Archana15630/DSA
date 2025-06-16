package dsa;

	import java.util.Scanner;
	public class sample {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        int[] originalArray = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            originalArray[i] = sc.nextInt();
	        }
	        int[] descendingArray = new int[n];
	        for (int i = 0; i < n; i++) {
	            descendingArray[i] = originalArray[i];
	        }
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (descendingArray[i] < descendingArray[j]) {
	                    int temp = descendingArray[i];
	                    descendingArray[i] = descendingArray[j];
	                    descendingArray[j] = temp;
	                }
	            }}
	        System.out.print("Original array: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(originalArray[i] + " ");
	        }
	        System.out.print("\nSorted (descending) array: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(descendingArray[i] + " ");
	        }
	    }
	}
		

