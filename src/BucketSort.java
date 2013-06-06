import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class BucketSort {
	/*BucketSort para numeros enteros, y asumiendo que hay infinito espacio disponible*/
	
    public static void sort(int[] a, int maxVal){
    	
	    int[][] buckets = new int[a.length][a.length]; // this will hold all possible values, from low to highyL
	    
	    ArrayList<Integer>[] newBuckets = new ArrayList[a.length];
	    /*
	    for(ArrayList<Integer> bucket :newBuckets){
	    	bucket = new ArrayList<Integer>();
	    }
	    */
	    for(int i=0;i<a.length;i++){
	    	newBuckets[i] = new ArrayList<Integer>();
	    }
	    
	    for(int val:a){
	    	int pos = (int)Math.floor(((double)val/maxVal)*a.length);
	    	newBuckets[pos].add(val);
	    }
	    for(ArrayList<Integer>bucket:newBuckets){
	    	Collections.sort(bucket);
	    }
	    
	    int aIndex=0;
	    for(int i=0;i<newBuckets.length;i++){
	    	for(int j=0;j<newBuckets[i].size();j++){
	    		a[aIndex]=newBuckets[i].get(j);
	    		aIndex++;
	    	}
	    }
	    
	   /* 
	    int[] indexs = new int[a.length];    	
    	Arrays.fill(indexs, 0);

        for (int i=0; i<a.length; i++){
        	int pos = (int)Math.floor(((double)a[i]/maxVal)*a.length);
            buckets[pos][indexs[pos]] = a[i];
            indexs[pos]++;
        }
        
        for(int[] bucket:buckets){
        	Arrays.sort(bucket);
        }
        
	    int current =0;
	    for (int i = 0; i < buckets.length; i++)
	    {
	    	for(int j=0;j<indexs[i];j++){
	    		a[current]=buckets[i][j];
	    		current++;
	    	}
	    }        
        */
    }



    
    public static void main(String[] args){
        int i;
    	int maxVal=1000000;
        int[] arr = new int[10000];
        for(i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random() * maxVal);
        }
        sort(arr,maxVal);

        System.out.println(Arrays.toString(arr));

    }
   
}
