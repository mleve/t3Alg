import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class BucketSort {
	/*BucketSort para numeros enteros, y asumiendo que hay infinito espacio disponible*/
	
    public static Object[] sort(int[] a, int maxVal){
    	
    	List<Integer>[] buckets = new ArrayList[a.length];
    	

    	for(List<Integer> bucket :buckets){
    		bucket = new ArrayList<Integer>();
    	}
        /*
        for (int i=0; i<bucket.length; i++){
            bucket[i]=0;
        }
        */

        for (int i=0; i<a.length; i++){
        	int pos = (int)Math.floor(((double)a[i]/maxVal)*a.length);
            buckets[pos].add(a[i]);
        }
        
        for(List<Integer> bucket:buckets){
        	Collections.sort(bucket);
        }
        
        for(int i=1;i<a.length;i++){
        	buckets[0].addAll(buckets[i]);
        }
        
        return buckets[0].toArray();
        
    }



    
    public static void main(String[] args){
        int i;
    	int maxVal=100;
        int[] arr = new int[10];
        for(i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random() * 100);
        }
        Object[] result = sort(arr,maxVal);

        System.out.println(Arrays.toString(result));

    }
   
}
