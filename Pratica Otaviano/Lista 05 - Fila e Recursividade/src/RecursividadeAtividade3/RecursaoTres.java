package RecursividadeAtividade3;

public class RecursaoTres {
    int k = 0;
    int n = 0;
    public RecursaoTres(int k, int n) {
        this.k = k;
        this.n = n;
    }
    public int Recursao(int k, int n) {
        if(n == 1) {
            return k;
        }
        return k * Recursao(k, n - 1);
    }
}
