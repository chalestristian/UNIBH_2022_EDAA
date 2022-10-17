package me.caribeedu.unibh.edaa.pilhas.teste.ordenacao;

/**
 * Dada uma pilha qualquer contendo os valores 3, 9, 5, 1 (3 é
 * o topo) descreva qual o resultado após as seguintes
 * operações: Push (2), Pop, Pop, Top, Pop, Push (7), Pop, Pop,
 * Push (4), Pop, Pop, Push (8), Push (6), Pop.
 * 
 * @author Edu Caribé
 */
public class TesteOrdenacao {
    public static void main(String[] args) {
        Pilha pilhaNumeros = new Pilha(4);
        
        pilhaNumeros.push(1);
        pilhaNumeros.push(5);
        pilhaNumeros.push(9);
        pilhaNumeros.push(3);
        
        // Print pilhaNumeros -> [1, 5, 9, 3] onde 3 é o topo
        
        pilhaNumeros.push(2);
        // Print pilhaNumeros -> [1, 5, 9, 3, 2]
        
        pilhaNumeros.pop();
        // Print pilhaNumeros -> [1, 5, 9, 3]
        
        pilhaNumeros.pop();
        // Print pilhaNumeros -> [1, 5, 9]
        
        pilhaNumeros.top();
        // Retorna 9 sem removê-lo
        
        pilhaNumeros.pop();
        // Print pilhaNumeros -> [1, 5]
        
        pilhaNumeros.push(7);
        // Print pilhaNumeros -> [1, 5, 7]
        
        pilhaNumeros.pop();
        // Print pilhaNumeros -> [1, 5]
        
        pilhaNumeros.pop();
        // Print pilhaNumeros -> [1]
        
        pilhaNumeros.push(4);
        // Print pilhaNumeros -> [1, 4]
        
        pilhaNumeros.pop();
        // Print pilhaNumeros -> [1]
        
        pilhaNumeros.pop();
        // Print pilhaNumeros -> []
        
        pilhaNumeros.push(8);
        // Print pilhaNumeros -> [8]
        
        pilhaNumeros.push(6);        
        // Print pilhaNumeros -> [8, 6]
        
        pilhaNumeros.pop();
        // Print pilhaNumeros -> [8]
    }
}
