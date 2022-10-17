package me.caribeedu.unibh.edaa.pilhas.inversao.posicao;

/**
 * Construa um método que troca de lugar o elemento que está
 * no topo da pilha com o que está na base da pilha.
 * 
 * @author Edu Caribé
 */
public class InversaoPosicao {
    public static void main(String[] args) {
        Pilha pilhaExemplo = new Pilha(3);
        
        pilhaExemplo.push(1);
        pilhaExemplo.push(2);
        pilhaExemplo.push(3);
        
        System.out.println("Pilha inicial:");
        System.out.println(pilhaExemplo.print());
        
        pilhaExemplo.invert();
        
        System.out.println("Pilha invertida:");
        System.out.println(pilhaExemplo.print());
    }
}
