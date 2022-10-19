package ordenacao;

public class MergeSort {
    private int[] A;

    public MergeSort(int[] A) {
        this.A = A;
    }
    InsertionSort insertionSort = new InsertionSort(A);

    public int[] getA() {
        return A;
    }


    public void merge ( int p, int q, int r)
    {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[];
        int R[];
        int i;
        int j;

        L = new int[n1 + 1];
        R = new int[n2 + 1];

        for (i = 0; i < n1; ++i)
            L[i] = A[p + i];

        for (j = 0; j < n2; ++j)
            R[j] = A[q + 1 + j];

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        i = j = 0;

        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }

    public void sort ( int p, int r){
        int q;
        //Adcionado if para validar considerando a instancia pequena como até 1000.
        //Se a instancia for até 1000, chama-se o InsertionSort no lugar do MergeSort.
        if (A.length <= 1000){
            insertionSort.sort(A);
        }
        //Senão, se a instancia for maior que 1000, chama-se o próprio MergeSort recursivo.
        else {
            if (p < r) {
                q = Math.floorDiv((p + r), 2);
                sort(p, q);
                sort(q + 1, r);
                merge(p, q, r);
            }
        }
    }
}