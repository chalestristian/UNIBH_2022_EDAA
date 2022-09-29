public class Utilitarios {
    public static int GerarNumeroAleatorio(int numeroMin, int numeroMax) {
        return (int)(Math.random() * (numeroMax - numeroMin + 1) + numeroMin);
    }
}