package ordenacao;

public class BuscaSequencial {
    public String linear (int x, int A[]){
        final int n = A.length;
        for (int i = 0; i < n; i++)
            if (x == A[i]){
                return quantidadeIgual(x, A);
            }
        return "\nELEMENTO NÃO ENCONTRADO";
    }
    public String quantidadeIgual(int x, int A[]){
        int cont = 0;
        for (int j = 0; j < A.length; j++){
            if (x == A[j]){
                cont = cont + 1;
            }
        }
        if (cont != 1){
            return "EXISTEM " + cont + " ELEMENTOS IGUAIS AO ELEMENTO "+ x +" NESA MATRIZ";
        } else {
            return "EXISTE APENAS " + cont + " ELEMENTO "+ x +" NESA MATRIZ";

        }
    }

}

