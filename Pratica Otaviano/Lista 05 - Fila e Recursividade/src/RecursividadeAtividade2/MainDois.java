package RecursividadeAtividade2;
import RecursividadeAtividade1.RecursaoUm;

import java.util.Scanner;

public class MainDois {

    public static void main(String[] args) {
        RecursaoDois recursaodois;

        Scanner input = new Scanner(System.in);
        System.out.print("DIGITE O NUMERO INTEIRO: ");
        int dado = input.nextInt();

        recursaodois  = new RecursaoDois();
        recursaodois.Recursao(dado);

    }

}
