//código baseado em explicações do blog https://www.blogcyberini.com/

import java.util.concurrent.ForkJoinPool;

public class QuickSortTest {
    public static void main(String[] args) {
        //cria um pool de threads Fork/Join
        ForkJoinPool pool = new ForkJoinPool();
        
        //array que será ordenado
        int[] A = {5, 2, 7, 6, 2, 1, 0, 3, 9, 4};
        
        //imprime o vetor desordenado
        System.out.println("A (desordenado) = " + arrayToString(A));

        //gera um novo array
        A = new int[]{5, 2, 7, 6, 2, 1, 0, 3, 9, 4};
        //tarefa ForkJoin para ordenar o vetor A
        QuicksortForkJoin quicksortTaskRandom = new QuicksortForkJoin(A);
        //executa a tarefa utilizando o pool
        pool.invoke(quicksortTaskRandom);
        System.out.println("A (ordenado com Quicksort com pivô aleatório) = " + arrayToString(A));
    }
    
    //Método auxiliar para imprimir os arrays
    private static String arrayToString(int[] array){
        String aux = "[" + array[0];
        for(int i = 1; i < array.length; i++){
            aux += ", " + array[i];
        }
        return aux + "]";
    }
    
}