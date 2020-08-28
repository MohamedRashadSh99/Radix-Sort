import java.util.ArrayList;
import java.util.List;

public class RadixSortAlgo {
	public  void radixSort(int[] input) 
	{ 
		final int RADIX = 10;

		List<Integer>[] bucket = new ArrayList[RADIX];

		for (int i = 0; i < bucket.length; i++)

		{ bucket[i] = new ArrayList<Integer>(); }

		boolean maxLength = false; 

		int tmp = -1, placement = 1; 

		while (!maxLength) 

		{ maxLength = true; 

		for (Integer i : input) 

		{ tmp = i / placement;

		bucket[tmp % RADIX].add(i);

		if (maxLength && tmp > 0) 

		{ maxLength = false; } }


		int a = 0; 

		for (int b = 0; b < RADIX; b++) 

		{ for (Integer i : bucket[b])

		{ input[a++] = i; } 
		
		bucket[b].clear(); 
		}


		placement *= RADIX;

		}
	} 

}
