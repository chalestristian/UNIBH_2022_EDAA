public class TResultadoOperacao {
    public TResultadoOperacao(Boolean sucesso, String retorno) {
        this.Sucesso = sucesso;
        this.Retorno = retorno;
    }

    private final Boolean Sucesso;
    private final String Retorno;

    public String obterMensagem()  {
        if (this.Sucesso)
            return String.format("Operação realizada com sucesso. %s", Retorno);
        else
            return String.format("Não foi possível completar a operação. %s", Retorno);
    }
}