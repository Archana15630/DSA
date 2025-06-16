package dsa;

	import java.util.Scanner;

	public class RecursiveArrayManipulator {
	    static int[] arr = new int[100]; 
	    static int size = 0; 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        menu(sc); 
	    }

	    public static void menu(Scanner sc) {
	        System.out.println("\n=== Array Manipulator Menu ===");
	        System.out.println("1. Insert Element");
	        System.out.println("2. Display Elements");
	        System.out.println("3. Search Element");
	        System.out.println("4. Exit");
	        System.out.print("Choose an option: ");

	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	                insertElement(sc);
	                break;
	            case 2:
	                displayElements();
	                break;
	            case 3:
	                searchElement(sc);
	                break;
	            case 4:
	                System.out.println("Exiting... Goodbye!");
	                return;
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }

	        menu(sc);
	    }

	    public static void insertElement(Scanner sc) {
	        System.out.print("Enter element to insert: ");
	        int element = sc.nextInt();
	        if (size < arr.length) {
	            arr[size++] = element;
	            System.out.println("Element inserted.");
	        } else {
	            System.out.println("Array is full.");
	        }
	    }

	    public static void displayElements() {
	        if (size == 0) {
	            System.out.println("Array is empty.");
	            return;
	        }
	        System.out.println("Array elements:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void searchElement(Scanner sc) {
	        if (size == 0) {
	            System.out.println("Array is empty.");
	            return;
	        }
	        System.out.print("Enter element to search: ");
	        int target = sc.nextInt();
	        boolean found = false;
	        for (int i = 0; i < size; i++) {
	            if (arr[i] == target) {
	                System.out.println("Element found at index " + i);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Element not found.");
	        }
	    }
	}



