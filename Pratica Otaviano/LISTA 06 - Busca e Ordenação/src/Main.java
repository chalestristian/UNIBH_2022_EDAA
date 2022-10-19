import ordenacao.BuscaBinaria;
import ordenacao.BuscaSequencial;
import ordenacao.InsertionSort;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[500];
        Random r = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(1, 10000);
        }

        InsertionSort is;
        BuscaBinaria bb;
        BuscaSequencial bs;
        is = new InsertionSort(A);
        bb = new BuscaBinaria();
        bs = new BuscaSequencial();
        Scanner input = new Scanner(System.in);

        System.out.println("VETOR GERADO:");
            System.out.print("[");
                for (int j = 0; j < A.length; j++){System.out.print(A[j] + ", ");}
            System.out.print("] \n");

        long startTime = System.currentTimeMillis();
        is.sort(); // Ordenado usando o InsertionSort em: 2 milissegundos.
        System.out.println("\nVETOR ORDENADO USANDO INSERTION SORT EM: " + (System.currentTimeMillis() - startTime) + " MILISSEGUNDOS\n");

        System.out.println("VETOR ORDENADO:");
        System.out.println(Arrays.toString(is.getA()));

        System.out.print("\n[BUSCA PELO METODO BINARIO]: ESCOLHA UM NUMERO: ");
        int x = input.nextInt();
        startTime = System.currentTimeMillis();

        System.out.print(bb.binaria(x, A)+"\n"); // Busca binaria realizada em: 6 milissegundos.
        System.out.println("\nBUSCA BINARIA REALIIZADA EM: " + (System.currentTimeMillis() - startTime) + " MILISSEGUNDOS\n");

        System.out.print("\n[BUSCA PELO METODO SEQUENCIAL]: ESCOLHA UM NUMERO: ");
        int y = input.nextInt();
        startTime = System.currentTimeMillis();
        System.out.print("\n"+bs.linear(y, A)); // Busca sequencial realizada em: 2 milissegundos.
        System.out.println("\nBUSCA SEQUENCIAL REALIZADA EM: " + (System.currentTimeMillis() - startTime) + " MILISSEGUNDOS\n");

    }
}