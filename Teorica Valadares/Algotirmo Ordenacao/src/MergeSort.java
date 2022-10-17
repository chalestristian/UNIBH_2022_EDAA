import java.util.Random;

public class MergeSort {
    void merge(int A[], int p, int q, int r)
    {
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = A[p + i];
        for (int j = 0; j < n2; ++j)
            R[j] = A[q + 1 + j];

        int i = 0;
        int j = 0;

        int k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int A[], int p, int r)
    {
        if (p < r) {
            int q = p + (r - p) / 2;
            sort(A, p, q);
            sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }
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

        MergeSort ob = new MergeSort();
        ob.sort(A, 0, A.length - 1);
        
        System.out.println("\nDEPOIS DA ORDENAÇÃO:");
        System.out.print("{ ");
        for (int e = 0; e < A.length; e++) {
            System.out.print(A[e] + ", ");
        }
        System.out.print("}");
    }
}
