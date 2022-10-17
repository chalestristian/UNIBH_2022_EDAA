import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

 //    int [] A = new int [20];
//     Random dados = new Random();
//     for (int i = 0; i < A.length; i++) {
//         A[i] = dados.nextInt(1000);
//     }

     int[] A = {11,12,16,18,2,5,1,17,13,4,9,8,7,10,15,20,6,3,14,19};
     for (int j = 2; j < A.length; j++){
        int chave = A[j];
        int i = j -1;

        while (i >= 0 && A[i] > chave){
            A[i+1] = A[i];
            i = i - 1;
        }
        A[i+1] = chave;
     }

     for (int e = 0; e < A.length; e++){
         System.out.print(A[e] + " ");
     }



    }
}
