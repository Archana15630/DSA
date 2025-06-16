package dsa;
import java.util.Arrays;

public class ArrayUpdate{
    public static void updateElement(int[] arr, int index, int newValue)
 {
        if (index >= 0 && index < arr.length) 
{
            arr[index] = newValue; 
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        updateElement(array, 3, 50);
        System.out.println(Arrays.toString(array)); 
    }
}