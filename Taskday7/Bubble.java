package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class Bubble {
	public static  void findBubble(int[] sample) {
	for (int i=1;i<sample.length;i++)
	{
		for(int j=0;j<sample.length-i;j++) {
		if(sample[j]>sample[j+1])
		{
			int temp=sample[j];
			sample[j]=sample[j+1];
			sample[j+1]=temp;
			
		}
		}
		
	}
	
	System.out.println(Arrays.toString(sample));
		}
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter the number of elements in the array:");
			int size=sc.nextInt();
			int[] arr=new int[size];
			System.out.println("Enter the elements in the array:");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			findBubble(arr);
			sc.close();
			}
		}
		
	


