package ordenacao;

import java.util.Arrays;
public class BuscaBinaria {
        public String binaria(int x, int A[]){
            int inicio = 0, fim = A.length-1;
            int meio;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                if (x == A[meio]) {
                    return "\nELEMENTO " +x+ " ENCONTRADO NA POSIÇÃO N° " + encontraIndex(x, A);
                }
                if (x < A[meio])
                    fim = meio - 1;
                else
                    inicio = meio + 1;
            }
            return "\nELEMENTO NÃO ENCONTRADO";
        }
    public static int encontraIndex(int x, int A[]) {
        int index = Arrays.binarySearch(A, x);
        return (index < 0) ? -1 : index+1;
    }
}