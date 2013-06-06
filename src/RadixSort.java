import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class RadixSort{

	public static void sort(int[] v,int high) {
		int d = (""+high).length();
		int decPos=10;
		for(int i=0;i<d;i++){
			countingDigitSort(v,decPos);
			decPos=decPos*10;
		}
	 }
	
	private static void countingDigitSort(int[] a, int decPos) 
	{
	    int[][] counts = new int[10][a.length]; // this will hold all possible values, from low to high
	    int[] indexs = new int[10];
	    Arrays.fill(indexs, 0);
	    for (int x : a){
	    	int pos= x%decPos;
	    	if(pos>9)
	    		pos=10*pos/decPos;
	    	
	        counts[pos][indexs[pos]]=x; // - low so the lowest possible value is always 0
	        indexs[pos]++;
	    }
	    int current =0;
	    for (int i = 0; i < counts.length; i++)
	    {
	    	for(int j=0;j<indexs[i];j++){
	    		a[current]=counts[i][j];
	    		current++;
	    	}
	    }
	}
 
    public static void main(String[] args){
        int i;
        int[] arr = new int[1000];
        for(i=0;i<arr.length;i++){
            arr[i] = 1000+(int)(Math.random() * 9000);
          
        }
        sort(arr, 9999);
        System.out.println("\nDone ;-)");
    }
	
}
