import java.util.Arrays;
import java.util.Random;


public class CountingSort{

	
	
	public int sort(int[] a, int high) 
	{
		int ins = 0;
	    int[] counts = new int[high + 1]; 
	    ins++;
	    
	    for (int x : a)
	        counts[x]++; 
	    ins=ins+a.length;
	    
	    int current = 0;
	    ins++;
	    for (int i = 0; i < counts.length; i++)
	    {
	        Arrays.fill(a, current, current + counts[i], i); 
	        current += counts[i]; 
	        ins++;
	    }
	    return ins;
	}
	
}
