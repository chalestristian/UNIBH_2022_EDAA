import java.util.Random;
public class exercicio2 {
    /*
     *@author Thales Cristian
     *@author Neuber Tavares
     */

    /*
      *Faça um programa que preencha um vetor com dez números inteiros,
      *calcule e mostre os números primos e suas respectivas posições.
     */
    public static void main(String[] args) {
            var aleatorio = resultadoNum();

            System.out.println();
            System.out.println();

            numero(aleatorio);
    }
        private static int[] resultadoNum() {
            final int maxNum = 1000;
            var randomGenerator = new Random();
            var aleatorio = new int[20];

            System.out.println("Listagem dos numeros:");
            System.out.print(" - ");

            for(int i=0; i<20; i++) {
                var novoNumero = randomGenerator.nextInt(maxNum);

                aleatorio[i] = novoNumero;

                System.out.print(novoNumero);
                System.out.print(" - ");
            }
            return aleatorio;
        }
        private static boolean Primo(int numero) {
            if (numero <= 1)
                return false;

            for(int d=2; d<numero; d++) {
                if (numero % d == 0) {
                    return false;
                }
            }
            return true;
        }
        private static void numero(int[] numeros) {
            System.out.println("Analise numeros");

            for(int i=0; i<20; i++) {
                var numero = numeros[i];
                System.out.println("----------------------------------------");
                if (Primo(numero))
                    System.out.println("o Numero " + numero + " na posição " + i + " é primo.");
                else
                    System.out.println("O Numero " + numero + " na posição " + i + " nao é primo.");
            }
        }
}
