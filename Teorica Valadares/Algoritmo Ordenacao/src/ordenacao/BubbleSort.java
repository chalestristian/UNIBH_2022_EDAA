package ordenacao;

public class BubbleSort {
    private int [] A;

    public BubbleSort(int [] A){
        this.A = A;
    }
    public int[] getA(){
        return A;
    }
    void sort() {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = A.length - 1; j > i + 1; j++) {
                if (A[j] < A[j - 1]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
        }
    }
}

