package RecursividadeAtividade2;

public class RecursaoDois {
    int dados = 0;
    int caso_base = -1;
    public RecursaoDois(int dados) {
        this.dados = dados;
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