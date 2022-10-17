package me.caribeedu.unibh.edaa.pilhas.registros.agenda;

/**
 *
 * @author Edu Caribé
 */
public class Pilha {
    private Agenda[] itens;
    private int	topo;
    private int tam_max;

    public Pilha(int n)	{
        itens = new Agenda[n];
        tam_max	= n;
        topo = 0;
    }
    
    public void	push(Agenda valor) {
        if (full())
            increaseSize();
        
        itens[topo] = valor;
        topo++;
    }
    
    private void increaseSize() {
        tam_max += tam_max;
        Agenda[] pilhaAumentada = new Agenda[tam_max];
        
        for(int i = 0; i < itens.length; i++)
            pilhaAumentada[i] = itens[i];
        
        itens = pilhaAumentada;
    }
    
    public void	pop() {
        topo--;
    }
    
    public Agenda top() {
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
}
