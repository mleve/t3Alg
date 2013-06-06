
public class Tarea3 {

	private static int[][] inputGenerator(int maxValue, int arrayCount, int arrayLength){
		int[][] aux = new int [arrayCount][arrayLength];
		
		for(int j=0;j<arrayCount;j++){
			for(int i=0;i<arrayLength;i++){
				 aux[j][i] = (int)(Math.random() * maxValue);
			}
		}
		
		return aux;
		
	}
	/*
	public static void main(String[] args){
		int maxVal= 1000000;
		int [][] input = inputGenerator(maxVal,10,1000000);
		
		//SortInterface sort = new CountingSort();
		
		for(int i=0;i<10;i++){
			sort.sort(input[i], maxVal);
		}
		System.out.println("hola");
	}
	*/
}
