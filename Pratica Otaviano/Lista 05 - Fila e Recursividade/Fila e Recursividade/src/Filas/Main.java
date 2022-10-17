package Filas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dados;
        Caracteres caracteres;
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE OS CARACTERES SEM ESPAÇOS OU NÚMEROS. QUANDO FINALIZAR TECLE ENTER");
        dados = input.nextLine();

        caracteres = new Caracteres(dados);

        System.out.println("CARACTERES INFORMADOS: { " + caracteres.getConteudo() + " }");
        caracteres.TamanhosConteudosMinusculo();
        caracteres.TamanhosConteudosMaiusculos();






    }
}
