package Recursividade;

public class Somatorio {
    int dados = 0;
    int caso_base = 0;
    int soma = 0;
    public Somatorio(int dados) {
        this.dados = dados;
    }
    public int Somatorio(int dados){
        caso_base =  caso_base + 1;
        soma = soma + caso_base;

        System.out.println("RESULTADO RECURSIVO " + caso_base + " = "  + soma);

        if (caso_base < dados){
            return Somatorio(dados);
        } else {
            return caso_base;
        }
    }
}
