import java.util.Scanner;

public class exercicio4 {
    /*
     *@author Thales Cristian
     *@author Neuber Tavares
     */
        public static void main(String[] args) {
            System.out.println("!!! EOUBO BANCO HSVC !!!");

            var valoresSuspeitos = obterValoresSuspeitos();
            var valorAssaltanteConfesso = obterValorAssaltanteConfessado();

            var assaltantes = avaliarSuspeitos(valoresSuspeitos, valorAssaltanteConfesso);
            int valorTotalRoubado = 0;

            for(int i=0; i<assaltantes.length; i++) {
                int indiceAssaltante = assaltantes[i];

                System.out.println("O SUSPEITO " + (indiceAssaltante + 1) + " É UM ASSALTANTE.");

                valorTotalRoubado += valoresSuspeitos[indiceAssaltante];
            }

            System.out.println();
            System.out.print("EM SOMA, OS ASSALTANTES ROUBARAM R$ " + valorTotalRoubado + ",00.");
        }

        private static int[] obterValoresSuspeitos() {
            final Scanner input = new Scanner(System.in);

            var valores = new int[10];
            int suspeitosContabilizados = 0;

            while(suspeitosContabilizados < 10) {
                int suspeitoNumero = suspeitosContabilizados + 1;

                System.out.print("COLOQUE O VALOR CONTIDO PELO SUSPEITO N° " + suspeitoNumero + ": ");
                int valorContido = input.nextInt();

                if (valorContido < 0) {
                    System.out.println();
                    System.out.print("Insira um valor válido.");
                    continue;
                }

                valores[suspeitosContabilizados] = valorContido;
                suspeitosContabilizados++;

                System.out.println("SUSPEITO Nº " + suspeitosContabilizados + " TINHA R$" + valorContido + ",00.");
            }

            return valores;
        }

        private static int obterValorAssaltanteConfessado() {
            System.out.println();

            final Scanner input = new Scanner(System.in);
            int valorConfessado = 0;

            while(valorConfessado == 0) {
                System.out.print("Valor obtido pelo assaltante que confessou: ");
                int valorContido = input.nextInt();

                if (valorContido <= 0 || valorContido % 10 != 0) {
                    System.out.println();
                    System.out.print("Favor inserir um valor válido. Os assaltantes continham apenas notas de 10.");
                    continue;
                }

                System.out.println();
                valorConfessado = valorContido;
            }

            return valorConfessado;
        }

        private static int[] avaliarSuspeitos(int[] valoresSuspeitos, int valorAssaltanteConfesso) {
            var indicesSuspeitosQueSaoAssaltantes = new int[0];

            for(int i=0; i<valoresSuspeitos.length; i++) {
                var valorContido = valoresSuspeitos[i];

                if (valorContido % 10 != 0 || valorContido < valorAssaltanteConfesso)
                    continue;

                indicesSuspeitosQueSaoAssaltantes = adicionarAssaltante(indicesSuspeitosQueSaoAssaltantes, i);
            }

            return indicesSuspeitosQueSaoAssaltantes;
        }

        private static int[] adicionarAssaltante(int[] indicesAssaltantes, int indiceNovoAssaltante) {
            int novoTamanhoArray = indicesAssaltantes.length + 1;
            var indicesAssaltantesAtualizado = new int[novoTamanhoArray];

            for(int i=0; i<indicesAssaltantes.length; i++)
                indicesAssaltantesAtualizado[i] = indicesAssaltantes[i];

            indicesAssaltantesAtualizado[novoTamanhoArray - 1] = indiceNovoAssaltante;

            return indicesAssaltantesAtualizado;
        }
    }
