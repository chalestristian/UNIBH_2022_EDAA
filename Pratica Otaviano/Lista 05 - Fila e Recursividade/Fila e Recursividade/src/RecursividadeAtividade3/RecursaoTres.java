package RecursividadeAtividade3;

public class RecursaoTres {
    int k = 0;
    int n = 0;
    int caso_base = 0;
    int result = 0;

    public RecursaoTres(int k, int n) {
        this.k = k;
        this.n = n;
    }

    // 2x2x2x2
    public int Recursao(int k, int n) {

        if(n == 1) {
            return k;
        }
        return k * Recursao(k, n - 1);
}}
