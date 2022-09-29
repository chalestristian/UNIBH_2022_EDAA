package CarrinhoDeCompras;


public class Item {
    private String descricao;
    private double preco;
    private String nome;
    private int quantidade;
    public Item(int quantidade, double preco, String nome, String descricao) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;

        if(this.quantidade > 0){
            this.preco = this.preco * this.quantidade;
        }
    }

    public String obterNome() {
        return nome;
    }
    public String obteDescricao() {
        return descricao;
    }
    public int obteQuantidade() {
        return quantidade;
    }
    public double obtePreco() { return preco; }

    @Override
    public String toString() {
        return "QUANTIDADE ADQUIRIDA: "+this.quantidade+"\nVALOR DE VENDA TOTAL DO PRODUTO: "+this.preco+"\nNOME: "+this.nome+"\nDESCRICAO: "+this.descricao;
    }
    

}
