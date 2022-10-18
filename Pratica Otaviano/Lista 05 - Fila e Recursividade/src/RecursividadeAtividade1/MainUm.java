package RecursividadeAtividade1;

import java.util.Scanner;

public class MainUm {

    public static void main(String[] args) {
        RecursaoUm recurssaoum;

        Scanner input = new Scanner(System.in);
        System.out.print("DIGITE O NUMERO INTEIRO: ");
        int dado = input.nextInt();
        recurssaoum = new RecursaoUm();
        recurssaoum.RecursaoUm(dado);
    }


}
