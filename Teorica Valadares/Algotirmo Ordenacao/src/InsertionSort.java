import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        int[] A = new int[20];
        Random dados = new Random();

        System.out.println("ANTES DA ORDENAÇÃO:");
        System.out.print("{ ");
        for (int c = 0; c < A.length; c++) {
            A[c] = dados.nextInt(1000);
            System.out.print(A[c] + ", ");
        }
        System.out.print("}");

        for (int j = 2; j < A.length; j++) {
            int chave = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > chave) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = chave;
        }

        System.out.println("\nDEPOIS DA ORDENAÇÃO:");
        System.out.print("{ ");
        for (int e = 0; e < A.length; e++) {
            System.out.print(A[e] + ", ");
        }
        System.out.print("}");
    }
}
