package RecursividadeAtividade1;

import java.util.Scanner;

public class MainUm {

    public static void main(String[] args) {
        RecursaoUm recurssaoum;

        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO INTEIRO: ");
        int dado = input.nextInt();
        recurssaoum = new RecursaoUm(dado);
        recurssaoum.RecursaoUm(dado);
    }


}
