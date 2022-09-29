public class TContaBancaria {
    public TContaBancaria(String conta, String agencia, String cliente, String cpf) {
        this.Conta = conta;
        this.Cpf = cpf;
        this.Agencia = agencia;
        this.Cliente = cliente;
        Saldo = 0;
    }
    private final String Conta;
    private final String Agencia;
    private double Saldo;
    private final String Cliente;
    private final String Cpf;

    public Boolean valorDisponivel(double valorRequerido) {return valorRequerido < Saldo;}
    public String getCpf() {
        return Cpf;
    }
    public String getConta() {return Conta;}
    public double getSaldo() {return Saldo;}
    public String getAgencia() {return Agencia;}
    public String getNome() {
        return Cliente;
    }

    public TResultadoOperacao Saque(double valor) {
        if (valor < 0)
            return new TResultadoOperacao(false, "Valor inválido. Tente novamente.");

        if (!valorDisponivel(valor))
            return new TResultadoOperacao(false, "Saldo insuficiente.");

        this.Saldo -= valor;

        return new TResultadoOperacao(
                true,
                String.format("Valor retirado. Seu novo saldo é R$%.2f.", this.Saldo)
        );
    }
    public TResultadoOperacao Deposito(double valor) {
        if (valor < 0)
            return new TResultadoOperacao(false, "Valor inválido. Tente novamente.");
        this.Saldo += valor;
        return new TResultadoOperacao(
                true,
                String.format("Valor depositado. Seu novo saldo é R$%.2f.", Saldo)
        );
    }
    public TResultadoOperacao Transferencia(String nroContaDestino, String agenciaContaDestino, double valor) {
        return TGerenciaDeContas.transferir(Conta, Agencia, nroContaDestino, agenciaContaDestino, valor);
    }
}