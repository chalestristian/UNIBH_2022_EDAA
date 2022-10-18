package RecursividadeAtividade1;

public class RecursaoUm {
    int caso_base = 0;
    int soma = 0;
    public RecursaoUm() {

    }
    public int RecursaoUm(int dados){
        caso_base =  caso_base + 1;
        soma = soma + caso_base;

        System.out.println("RESULTADO RECURSIVO " + caso_base + " = "  + soma);

        if (caso_base < dados){
            return RecursaoUm(dados);
        } else {
            return caso_base;
        }
    }
}
