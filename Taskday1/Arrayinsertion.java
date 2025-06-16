package dsa;

import java.util.Arrays;

public class Arrayinsertion
{
    public static int[] insertElement(int[] arr, int index, int element) 
{
        int[] newArray = new int[arr.length + 1]; 
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = element; 
            } else {
                newArray[i] = arr[j++]; 
            }
        }
        return newArray;
    }

    public static void main(String[] args) 
{
        int[] array = {10, 20, 30, 40};
        array = insertElement(array, 2, 25);
        System.out.println(Arrays.toString(array)); 
    }
}