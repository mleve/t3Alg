import java.util.LinkedList;
import java.util.Queue;


public class RadixSort{

	public static void sort(int[] v) {
        int max    = 1;     // cantidad de repeticiones
        int nbytes = 4;     // numero de bytes a desplazar
        int nColas = (int) Math.pow(2,nbytes) ;
        // Creación e inicialización del arreglo de colas
        Queue<Integer>[] cola = new LinkedList[nColas];
        for(int i=0; i<nColas; i++) cola[i]=new LinkedList<Integer>();
 
        int     div     = 0;        // posición a comparar
        for(int i=0; i<max; i++) {
            // parte 1: recorrer el vector  para guardar cada elemento
            // en la cola correspondiente
            for(int numero: v) {
                // buscar el mayor número del vector
                if(i==0) if(numero>max) max=numero;
                // calcular en qué cola debe ir cada número
                int numCola = (numero>>div) & 0xf;
                cola[numCola].add(numero);
            }
            div = div+nbytes;
 
            // parte 2: recorrer las colas en orden para poner cada
            // elemento en el vector;
            int j=0;
            for(Queue<Integer> c: cola) {
                while(!c.isEmpty()) v[j++]=c.remove();
            }
            // la primera vez se actualiza el número de veces que se
            // debe ejecutar el proceso
            if(i==0) { max = (int) (Math.log(max)/Math.log(nColas)) + 1; 
            }
        }
        
	 }
 
    public static void main(String[] args){
        int i;
        int[] arr = new int[1000000];
        for(i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random() * 100000);
        }
        sort(arr);
        System.out.println("\nDone ;-)");
    }
	
}
