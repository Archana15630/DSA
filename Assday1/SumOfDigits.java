package dsa;


	public class SumOfDigits {

	    public static int sumDigits(int num) {
	        if (num == 0)
	            return 0;
	        return (num % 10) + sumDigits(num / 10);
	    }

	    public static void main(String[] args) {
	        int number = 1234; 
	        int sum = sumDigits(number);
	        System.out.println("Sum of digits of " + number + " is: " + sum);
	    }
	}

