package RecursividadeAtividade3;

import java.util.Scanner;

public class MainTres {
    public static void main(String[] args) {

        RecursaoTres recursaotres;

        Scanner input = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO NUMERO INTEIRO: ");
        int dado1 = input.nextInt();

        System.out.print("DIGITE O SEGUNDO NUMERO INTEIRO: ");
        int dado2 = input.nextInt();

        recursaotres  = new RecursaoTres(dado1,dado2);
        System.out.print("O RESULTADO DE " + dado1 + " ELEVADO A " + dado2 + " É: ");

        System.out.print(recursaotres.Recursao(dado1,dado2));

    }
}
