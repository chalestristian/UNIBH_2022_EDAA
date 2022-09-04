import java.text.DecimalFormat;

public class exercicio3 {
    /*
     *@author Thales Cristian
     *@author Neuber Tavares
     */

    /*
     *Faça um programa que preencha um vetor com os modelos de cinco car (exemplos de modelos: Fusca,
     *Gol, Vectra etc). Carregue outro vetor com o consumo desses car, isto é, quantos quilômetros cada
     *um deles faz com um litro de combustível. Calcule e mostre:
     *A) o modelo de Car mais econômico;
     *e
     *B) quantos litros de combustível cada um dos car cadastrados consome para percorrer uma distância de 1.000 km
     */
        private static final DecimalFormat decimalFormatter = new DecimalFormat("0.00");
        public static void main(String[] args) {
            var CarModels = getModels();
            var CarBurn = getBurn();

            System.out.println("Carros x Consumo (km p/ litro de combustível)");

            for(int i=0; i<5; i++) {
                var Car = CarModels[i];
                var BurnKmByLiter = CarBurn[i];

                System.out.println(Car + " - " + BurnKmByLiter + "Km/L");
            }
            System.out.println("----------------------------------------------");
            CarBurnAnalytics(CarModels, CarBurn);
        }

        private static String[] getModels() {
            return new String[] {"Ferrari", "Peugeot ", "Civic",  "Siena", "Opala"};
        }

        private static double[] getBurn() {
            return new double[] {3.7, 11.2, 9.8, 10.7, 5.4};
        }

        private static void CarBurnAnalytics(String[] car, double[] burn) {
            double LowestLiterBurned = Integer.MAX_VALUE;
            String MostEconomicModel = null;
            System.out.println("Carros x Consumo (1000km)");

            for(int i=0; i<5; i++) {
                var Car = car[i];
                var BurnKmByLiter = burn[i];

                double burnOneThousandKm = 1000 / BurnKmByLiter;

                System.out.println(Car + " - " + decimalFormatter.format(burnOneThousandKm) + " liter");

                if (burnOneThousandKm < LowestLiterBurned) {
                    LowestLiterBurned = burnOneThousandKm;
                    MostEconomicModel = Car;
                }
            }

            System.out.println();
            System.out.println("O carro que menos consome é: " + MostEconomicModel);
        }
    }