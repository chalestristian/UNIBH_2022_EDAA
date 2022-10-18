public class Bubblesort {
    void bubbleSort(int A[])
    {
        for (int i = 0; i < A.length - 1; i++)
            for (int j = 0; j < A.length - i - 1; j++)
                if (A[j] > A[j + 1]) {
                    int temporario = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temporario;
                }
    }
    void print(int A[])
    {
        System.out.print("{ ");
        for (int i = 0; i < A.length; ++i)
            System.out.print(A[i] + " ");
        System.out.print("}");
    }
    public static void main(String args[])
    {
        Bubblesort bubblesort = new Bubblesort();
        int A[] = { 10, 5, 1, 9, 2, 6, 8, 3, 7, 4, 0,};
        bubblesort.bubbleSort(A);
        System.out.println("RESULTADO ORDENADO: ");
        bubblesort.print(A);
    }
}
