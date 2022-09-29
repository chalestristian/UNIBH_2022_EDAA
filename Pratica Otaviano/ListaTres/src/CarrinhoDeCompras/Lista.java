package CarrinhoDeCompras;

public class Lista {
    private int max;
    private int atual = 0;
    private Item[] carrinho;
    
    public Lista(int max) {
        this.max = max;
        this.carrinho = new Item[max];
    }
    
    public boolean add(Item produto) {
        if (this.atual == this.max) return false;
        this.carrinho[this.atual] = produto;
        this.atual++;
        return true;
    }
    
    public boolean seVazio() {
        return this.atual == 0;
    }
    
    public void print() {
        for (int i = 0; i != this.atual; i++) {
            if (carrinho[i] == null) break;
            
            System.out.println(carrinho[i]);
            System.out.println("********************************");
        }
    }
    
    public boolean excluir(int index) {
        if (this.carrinho[index] == null) return false;
        
        this.carrinho[index] = null;
        this.atual--;
        
        for (int i = index; i < this.atual; i++) {
            this.carrinho[i] = this.carrinho[i + 1];
        }
        
        this.carrinho[this.atual] = null;
        
        return true;
    }
    
    public boolean vazio() {
        for (int i = 0; i < this.atual; i++) {
            this.carrinho[i] = null;
        }
        
        this.atual = 0;
        
        return true;
    }
}
