public class Recursivo {
    private long x;

    Recursivo(long x) {
        this.x = x;
    }
    Recursivo() {
        x = 0;
    }
    public void setX(long x) {
        this.x = x;
    }
    public long Recursao(long n) {
        if (n == 0)
            return 1;
        else
            return n * Recursao(n - 1);
    }
}
