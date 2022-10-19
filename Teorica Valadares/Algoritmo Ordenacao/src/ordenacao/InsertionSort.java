package ordenacao;

public class InsertionSort {
    private int[] A;

    public InsertionSort (int[] A){
        this.A = A;
    }

    public int[] getA(){
        return A;
    }

    public void sort(){
        int key;
        for (int j = 1; j < A.length; j++) {
            key  = A[j];
            int i = j - 1;

            while ((i > 0) && (A[i] > key)){
                A[i + 1] = A[i];
                i --;
            }
            A[i + 1] = key;
        }
    }
}