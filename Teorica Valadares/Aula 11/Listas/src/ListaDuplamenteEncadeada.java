public class ListaDuplamenteEncadeada {
    NoDuplo primeiro;
    NoDuplo ultimo;
    int numeroDeNos;

    public ListaDuplamenteEncadeada() {
        primeiro = ultimo = null;
        numeroDeNos = 0;
    }

    public void inserirFinal(NoDuplo novoNo){
        novoNo.prox = null;
        novoNo.ant = null;

        if (primeiro == null){
            primeiro = novoNo;
        } else {
            ultimo.prox = novoNo;
            novoNo.ant =ultimo;
        }
        ultimo = novoNo;

        numeroDeNos++;

    }
}
