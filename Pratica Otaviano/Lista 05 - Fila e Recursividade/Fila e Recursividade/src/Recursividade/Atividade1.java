package Recursividade;

import java.util.Scanner;

public class Atividade1 {
    public int x = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO INTEIRO: ");
        int dado = input.nextInt();
        Somatorio somatorio = new Somatorio(dado);
        somatorio.Somatorio(dado);
    }



}
