import BuscaOrdenacao.BuscaBinaria;
import BuscaOrdenacao.BuscaSequencial;
import BuscaOrdenacao.InsertionSort;
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
        for (int j = 0; j < A.length; j++) {
            System.out.print(A[j] + ", ");
        }
        System.out.print("] \n");

        is.sort(); // Ordenado usando o InsertionSort em: 2 milissegundos.

        System.out.println("VETOR ORDENADO:");
        System.out.println(Arrays.toString(is.getA()));

        System.out.print("\n[BUSCA PELO METODO BINARIO]: INFORME O NUMERO DO ELEMENTO: ");
        int x = input.nextInt();

        System.out.print(bb.binaria(x, A)+"\n"); // Busca binaria realizada em: 6 milissegundos.

        System.out.print("\n[BUSCA PELO METODO SEQUENCIAL]: INFORME O NUMERO DO ELEMENTO: ");
        int y = input.nextInt();
        System.out.print("\n"+bs.linear(y, A)); // Busca sequencial realizada em: 2 milissegundos.
    }
}