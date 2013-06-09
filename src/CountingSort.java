import java.util.Arrays;
import java.util.Random;


public class CountingSort{

	
	
	public int sort(int[] a, int high) 
	{
		int ins = 0;
	    int[] counts = new int[high + 1]; // this will hold all possible values, from low to high
	    ins++;
	    
	    for (int x : a)
	        counts[x]++; // - low so the lowest possible value is always 0
	    ins=ins+a.length;
	    
	    int current = 0;
	    ins++;
	    for (int i = 0; i < counts.length; i++)
	    {
	        Arrays.fill(a, current, current + counts[i], i); // fills counts[i] elements of value i + low in current
	        current += counts[i]; // leap forward by counts[i] steps
	        ins++;
	    }
	    return ins;
	}
	/*
    public static void main(String[] args){
        int i;
        int[] arr = new int[100000];
        System.out.print("original: ");
        for(i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random() * 1000000);
            //System.out.print(arr[i] + " ");
        }
        sort(arr,1000000);
        System.out.print("\nsorted: ");
        for(i=0;i<arr.length;i++)
            //System.out.print(arr[i] + " ");
        System.out.println("\nDone ;-)");
    }
    */
}
