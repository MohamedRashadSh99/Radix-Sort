
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

public class Main
{
	public static void main(String[] args)
{ 
	RadixSortAlgo radix = new RadixSortAlgo();	
System.out.println("Radix sort in Java");

int[] input = { 181, 51, 11, 33, 11, 39, 60, 2, 27, 24, 12 }; 

System.out.println("An Integer array before sorting");

System.out.println(Arrays.toString(input)); 


System.out.println("Sorting an int array using radix sort algorithm");
radix.radixSort(input);
System.out.println(Arrays.toString(input)); 

}
}





//Read more: https://www.java67.com/2018/03/how-to-implement-radix-sort-in-java.html#ixzz6WFmXUgh4