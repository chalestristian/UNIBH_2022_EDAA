package RecursividadeAtividade2;

public class RecursaoDois {
    int caso_base = -1;
    public RecursaoDois() {
    }
    public int Recursao(int dados) {
        caso_base = caso_base + 1;
        System.out.println("RESULTADO RECURSIVO: " + caso_base);
        if (caso_base < dados) {
            return Recursao(dados);
        } else {
            return caso_base;
        }
    }
}