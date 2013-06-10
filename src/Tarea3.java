import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Tarea3 {

	private static int[][] inputGenerator(int minValue,int maxValue, int arrayCount, int arrayLength){
		int[][] aux = new int [arrayCount][arrayLength];
		
		for(int j=0;j<arrayCount;j++){
			for(int i=0;i<arrayLength;i++){
				 aux[j][i] = minValue + (int)(Math.random() * (maxValue-minValue));
			}
		}
		
		return aux;
		
	}
	
	public static void main(String[] args) throws IOException{
		
	BufferedWriter writer = new BufferedWriter(new FileWriter("FinalQS.csv"));
	//writer.write("Comparaciones;tiempo de ejecucion \n");
	/*Prueba counting sort*/
	/*
		writer.write("Test para Counting Sort \n");
		CountingSort sort = new CountingSort();
		for(int i = 100000;i<=1000000;i=i+50000){
			System.out.println("Counting Sort para n="+i);
			writer.write("n="+i+"\n");
			int[][] input = inputGenerator(100000,1000000,100,i);
			for(int j=0;j<input.length;j++){
				int instructions=0;
				long timeEx=System.nanoTime();
				instructions=sort.sort(input[j], 1000000);
				timeEx=System.nanoTime()-timeEx;
				writer.write(timeEx+" \n");
			}
			//writer.write("\n");
			input = null;
		}
		System.out.println("Finalizado Counting Sort test");
		sort = null;
	*/
	/*Prueba para RadixSort*/
	/*
		writer.write("Test para RadixSort\n");
		RadixSort sort = new RadixSort();
		for(int i = 100000;i<=1000000;i=i+50000){
			System.out.println("Radix Sort para n="+i);
			writer.write("n="+i+"\n");
			int[][] input = inputGenerator(100000,1000000,100,i);
			for(int j=0;j<input.length;j++){
				int instructions=0;
				long timeEx = System.nanoTime();
				instructions = sort.sort(input[j], 999999);
				timeEx=System.nanoTime()-timeEx;
				writer.write(timeEx+"\n");
			}
			//writer.write("\n");
			input = null;
		}
		System.out.println("Finalizado Radix Sort test");
		sort = null;
	*/
	/*Prueba para BucketSort */
	/*
		writer.write("Test para bucketSort\n");
		BucketSort sort = new BucketSort();
		for(int i = 100000;i<=1000000;i=i+50000){
			System.out.println("Bucket sort para n="+i);
			writer.write("n="+i+"\n");
			int[][] input = inputGenerator(100000,1000000,100,i);
			for(int j=0;j<input.length;j++){
				int instructions=0;
				long timeEx=System.nanoTime();
				instructions=sort.sort(input[j], 1000000);
				timeEx=System.nanoTime()-timeEx;
				writer.write(timeEx+"\n");
			}
			//writer.write("\n");
			input = null;
		}
		System.out.println("Finalizado Bucket Sort test");
		sort = null;
	*/
	
	writer.write("Test para QuickSort\n");
	QuickSort sort = new QuickSort();
	for(int i = 100000;i<=1000000;i=i+50000){
		System.out.println("Quicksort para n="+i);
		writer.write("n="+i+"\n");
		int[][] input = inputGenerator(100000,1000000,100,i);
		for(int j=0;j<input.length;j++){
			long timeEx=System.nanoTime();
			sort.sort(input[j]);
			timeEx=System.nanoTime()-timeEx;
			writer.write(timeEx+"\n");
		}
		//writer.write("\n");
		input = null;
	}
	System.out.println("Finalizado QuickSort test");

	
	
	writer.close();
	}
	
}
