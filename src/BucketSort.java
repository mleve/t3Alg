import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class BucketSort {
	
    public int sort(int[] a, int maxVal){
	    int ins=0;
	    ArrayList<Integer>[] newBuckets = new ArrayList[a.length];
	    ins++;
	    for(int i=0;i<a.length;i++){
	    	newBuckets[i] = new ArrayList<Integer>();
	    	ins++;
	    }
	    
	    for(int val:a){
	    	int pos = (int)Math.floor(((double)val/maxVal)*a.length);
	    	newBuckets[pos].add(val);
	    	ins=ins+2;
	    }
	    for(ArrayList<Integer>bucket:newBuckets){
	    	ins=ins+insertionSort(bucket);
	    }
	    
	    int aIndex=0;
	    ins++;
	    for(int i=0;i<newBuckets.length;i++){
	    	for(int j=0;j<newBuckets[i].size();j++){
	    		a[aIndex]=newBuckets[i].get(j);
	    		aIndex++;
	    		ins=ins+2;
	    	}
	    }
	    return ins;
	    

    }
    
    private int insertionSort(ArrayList<Integer> list)
    {
    	int ins=0;
    	for(int i=1;i<list.size();i++){
    		int temp = list.get(i);
    		int j;
    		ins=ins+2;
    		for(j=i-1;j>=0 && list.get(j) > temp; j--){
    			list.set(j+1, list.get(j));
    			ins=ins+2;
    		}
    		list.set(j+1, temp);
    		ins++;
    	}
		return ins;
   }


}
