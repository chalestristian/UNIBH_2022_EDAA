import java.util.Scanner;

public class exercicio5 {
    /*
     *@author Thales Cristian
     *@author Neuber Tavares
     */
        public static void main(String[] args) {
            final Scanner input = new Scanner(System.in);
            int[] unicoNumero = new int[5];
            boolean[] numeroInformado = new boolean[5];
            int numIndiceAtual = 0;
            while(true) {
                System.out.println("-----------------------------------------------------------------");
                System.out.print("INSIRA O VALOR PARA O " + (numIndiceAtual + 1) + "º NUMERO: ");
                var numeroInserido = input.nextInt();

                if (numeroInformado[numIndiceAtual] != true) {
                    unicoNumero[numIndiceAtual] = numeroInserido;
                    numeroInformado[numIndiceAtual] = true;
                    System.out.println("O VALOR ATUAL DO " + (numIndiceAtual + 1) + "º NUMERO É " + unicoNumero[numIndiceAtual]);

                } else{
                    System.out.println("O VALOR ATUAL DO N° " + (numIndiceAtual + 1) + " É " + unicoNumero[numIndiceAtual] + " E NÃO PODE SER ALTERADO");
                }
                if (numIndiceAtual < 4)
                numIndiceAtual++;
                else
                numIndiceAtual = 0;
            }
        }
}

