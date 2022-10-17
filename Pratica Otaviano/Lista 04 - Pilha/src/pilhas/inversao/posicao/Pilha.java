package me.caribeedu.unibh.edaa.pilhas.inversao.posicao;

/**
 *
 * @author Edu Caribé
 */
public class Pilha {
    private int[] itens;
    private int	topo;
    private int tam_max;

    public Pilha(int n)	{
        itens = new int[n];
        tam_max	= n;
        topo = 0;
    }
    
    public void	push(int valor) {
        if (full())
            increaseSize();
        
        itens[topo] = valor;
        topo++;
    }
    
    private void increaseSize() {
        tam_max += tam_max;
        int[] pilhaAumentada = new int[tam_max];
        
        for(int i = 0; i < itens.length; i++)
            pilhaAumentada[i] = itens[i];
        
        itens = pilhaAumentada;
    }
    
    public void	pop() {
        topo--;
    }
    
    public void invert() {
        if (empty())
            return;
        
        int numero_inicial = itens[0];
        int numero_final = top();
        
        itens[0] = numero_final;
        itens[topo - 1] = numero_inicial;
    }
    
    public int top() {
        return itens[topo - 1];
    }

    public boolean empty() {
        return (topo ==	0);
    }
    
    public boolean full() {
        return (topo ==	tam_max);
    }
    
    public int size() {
        return topo;
    }
    
    public String print() {
        if (empty())
            return "[]";
        
        String resultado = "[";
        
        for (int i = 0; i < itens.length; i++) {
            int item = itens[i];
            
            resultado += item;
            
            if (i < itens.length - 1)
                resultado += ", ";
        }
        
        resultado += "]";
        
        return resultado;
    }
}
