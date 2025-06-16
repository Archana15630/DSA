package dsa;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Arrays;

	public class SearchInputTypeDetection {
	    public static <T> int search(List<T> list, T target) {
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).equals(target)) {
	                return i;
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your search target: ");
	        String input = scanner.nextLine();
	        if (input.matches("-?\\d+")) { 
	            List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
	            int target = Integer.parseInt(input);
	            int result = search(numbers, target);
	            System.out.println(result != -1 ? "Element found at index: " + result : "Element not found.");
	        } else if (input.matches("-?\\d+\\.\\d+")) {
	            List<Double> decimals = Arrays.asList(10.5, 20.3, 30.7, 40.1, 50.9);
	            double target = Double.parseDouble(input);
	            int result = search(decimals, target);
	            System.out.println(result != -1 ? "Element found at index: " + result : "Element not found.");
	        } else { // String detection
	            List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
	            int result = search(words, input);
	            System.out.println(result != -1 ? "Element found at index: " + result : "Element not found.");
	        }

	        scanner.close();
	    }
	}


