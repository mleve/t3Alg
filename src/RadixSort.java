import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class RadixSort{

	public int sort(int[] v,int high) {
		int ins=0;
		int d = (""+high).length();
		int decPos=10;
		ins=ins+2;
		for(int i=0;i<d;i++){
			ins=ins+countingDigitSort(v,decPos);
			decPos=decPos*10;
			ins++;
		}
		return ins;
	 }
	
	private int countingDigitSort(int[] a, int decPos) 
	{
	    int ins=0;
	    ArrayList<Integer>[] counts = new ArrayList[10];
	    ins++;
	    
	    for(int i=0;i<10;i++){
	    	counts[i] = new ArrayList<Integer>();
	    	ins++;
	    }
	    
	    for (int x : a){
	    	int pos= x%decPos;
	    	
	    	if(pos>9)
	    		pos=10*pos/decPos;
	    	ins++;
	        counts[pos].add(x); // - low so the lowest possible value is always 0
	        ins++;
	    }
	    int current =0;
	    ins++;
	    for (int i = 0; i < counts.length; i++)
	    {
	    	for(int j=0;j<counts[i].size();j++){
	    		a[current]=counts[i].get(j);
	    		current++;
	    		ins++;
	    	}
	    }
	    return ins;
	}
 /*
    public static void main(String[] args){
        int i;
        int[] arr = new int[10000];
        for(i=0;i<arr.length;i++){
            arr[i] = 10000000+(int)(Math.random() * 90000000);
          
        }
        sort(arr, 99999999);
        System.out.println(Arrays.toString(arr));
    }
	*/
}
