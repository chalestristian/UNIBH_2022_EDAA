public class Q1 {
    /*
        1. Inverter a posição dos elementos de um vetor.
            Defina o passo base e o passo de recursão para o problema.
            Implemente um algoritmo recursivo para o problema.
    */
    public static void main(String[] args) {
        int[] A = {20,21,22,23,24,25,26,27,28,29,30};

        TrocarPosicao(A,0,A.length-1);
        ImprimirVetor(A, A.length);
    }

   static void TrocarPosicao(int X[], int inicio, int fim){
       int B;

       if(inicio < fim){
           B = X[inicio];
           X[inicio] = X[fim];
           X[fim] = B;

           TrocarPosicao(X, inicio + 1, fim - 1);
       }
   }
   static void ImprimirVetor(int X[], int tamanho){
        if(tamanho == 1){
            System.out.println(X[tamanho-1]);
        } else {
            ImprimirVetor(X, tamanho -1);
            System.out.println(X[tamanho-1]);
        }
   }
}
