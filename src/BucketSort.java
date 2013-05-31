import java.util.Arrays;


public class BucketSort implements SortInterface {
	/*BucketSort para numeros enteros, y asumiendo que hay infinito espacio disponible*/
	
    public void sort(int[] a, int maxVal){
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++){
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++){
            bucket[a[i]]++;
        }


        int outPos=0;
        for (int i=0; i<bucket.length; i++){
            for (int j=0; j<bucket[i]; j++){
                a[outPos++]=i;
            }
        }
    }

    /*
    public static void main(String[] args){
        int maxVal=3;
        int [] data= {1,0,1,2,3,1,0,3,1,0,1,3}; //ArrayUtil.randomIntArray(10,maxVal+1);

        System.out.println(Arrays.toString(data));

        sort(data,maxVal);

        System.out.println(Arrays.toString(data));

    }
    */
}
