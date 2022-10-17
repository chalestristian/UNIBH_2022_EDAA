package me.caribeedu.unibh.edaa.pilhas.pares.impares;

import java.util.Scanner;

/**
 * Construa um programa que leia 10 valores do tipo int e
 * empilha-os conforme forem pares ou impares na pilha1 e
 * pilha2, respectivamente. No final desempilhe os valores de
 * cada pilha mostrando-os na tela.
 * @author Edu Caribé
 */
public class ParesImpares {
    private static final Scanner input = new Scanner(System.in);
    private static final Pilha pilha1 = new Pilha(1); // Pares
    private static final Pilha pilha2 = new Pilha(1); // Impares
    
    public static void main(String[] args) {
        requestNumber(1);
        requestNumber(2);
        requestNumber(3);
        requestNumber(4);
        requestNumber(5);
        requestNumber(6);
        requestNumber(7);
        requestNumber(8);
        requestNumber(9);
        requestNumber(10);
        
        printStacks();
    }
    
    private static void requestNumber(int indice) {
        System.out.print(String.format("Insira o %sº número: ", indice));
        
        int numero = input.nextInt();
        
        System.out.println();
        
        sendToStack(numero);
    }
    
    private static void sendToStack(int numero) {
        if (numero % 2 == 0)
            pilha1.push(numero);
        else
            pilha2.push(numero);
    }
    
    private static void printStacks() {
        while(!pilha1.empty()) {
            System.out.println("Removido da pilha par: " + pilha1.pop());
        }
        
        while(!pilha2.empty()) {
            System.out.println("Removido da pilha ímpar: " + pilha2.pop());
        }
    }
}