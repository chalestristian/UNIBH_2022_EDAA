package RecursividadeAtividade3;

import java.util.Scanner;

public class MainTres {
    public static void main(String[] args) {

        RecursaoTres recursaotres;

        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO NUMERO INTEIRO: ");
        int dado1 = input.nextInt();

        System.out.println("DIGITE O SEGUNDO NUMERO INTEIRO: ");
        int dado2 = input.nextInt();

        recursaotres  = new RecursaoTres(dado1,dado2);
        System.out.println(recursaotres.Recursao(dado1,dado2));

    }
}
