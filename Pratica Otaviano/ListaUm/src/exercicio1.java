public class exercicio1 {
    /*
    *@author Thales Cristian
    *@author Neuber Tavares
    */

    /*
      *Escreva um programa que declare um array bidimensional chamado tabuada de 10 × 10 posições e preencha os elementos
      *do array com os valores da tabuada da soma para aquele elemento, de forma que, por exemplo,
      *o elemento tabuada[7][9] valha 16. Use o tipo de dado mais adequado para este array.
    */
        public static void main(String[] args) {
            var tabuada = new int[10][10];

            calculadoraTabuada(tabuada);
            listarTabuada(tabuada);
        }

        private static void calculadoraTabuada(int[][] tabuada) {
            for(int x=0; x < 10; x++) {
                int valorX = x + 1;

                for(int y=0; y < 10; y++) {
                    int valorY = y + 1;

                    tabuada[x][y] = valorX + valorY;
                }
            }
        }

        private static void listarTabuada(int[][] tabuada) {
            for(int y=0; y < 10; y++) {
                System.out.print(" - ");
                for(int x=0; x < 10; x++) {
                    System.out.print(" " + tabuada[x][y]);
                    System.out.print(" - ");
                }
                System.out.println();
            }
        }
}
