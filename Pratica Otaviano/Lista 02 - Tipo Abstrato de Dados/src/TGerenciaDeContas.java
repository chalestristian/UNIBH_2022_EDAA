public class TGerenciaDeContas {
    private static TContaBancaria[] CONTAS = new TContaBancaria[0];

    public static String getContasAbertas() {
        String resumoContas = "";

        for (TContaBancaria conta : CONTAS)
            resumoContas += String.format(
                    "Cliente: %s - CPF: %s - Conta: %s - Agência: %s\n",
                    conta.getNome(),
                    conta.getCpf(),
                    conta.getConta(),
                    conta.getAgencia()
            );

        return resumoContas;
    }

    public static String getContasTransf(String nroContaOrigem, String nroAgenciaOrigem) {
        String resumoContas = "";

        for (TContaBancaria conta : CONTAS)
            if (!conta.getConta().equals(nroContaOrigem) && !conta.getAgencia().equals(nroAgenciaOrigem))
                resumoContas += String.format(
                        "Cliente: %s - CPF: %s - Conta: %s - Agência: %s\n",
                        conta.getNome(),
                        conta.getCpf(),
                        conta.getConta(),
                        conta.getAgencia()
                );

        return resumoContas;
    }

    private static Boolean getContaCriada(String nroConta, String agencia) {
        for (TContaBancaria contaExistente : CONTAS) {
            if (contaExistente.getConta().equals(nroConta) && contaExistente.getAgencia().equals(agencia))
                return true;
        }

        return false;
    }

    private static String setNovaConta() {
        final int menorNumero = 100;
        final int maiorNumero = 10000;
        final int numeroPossivel = Utilitarios.GerarNumeroAleatorio(menorNumero, maiorNumero);
        final String novaConta = String.format("%03d", numeroPossivel);
        return novaConta;
    }

    private static String setNovaAgencia(String novoNroConta) {
        final int menorNumero = 100;
        final int maiorNumero = 10000;

        final int numeroPossivel = Utilitarios.GerarNumeroAleatorio(menorNumero, maiorNumero);
        final String novaAgencia = String.format("%04d", numeroPossivel);

        if (TGerenciaDeContas.getContaCriada(novoNroConta, novaAgencia))
            return setNovaAgencia(novoNroConta);
        else
            return novaAgencia;
    }

    public static TContaBancaria novoCliente(String nome, String cpf) {
        int tamanhoListaContas = TGerenciaDeContas.CONTAS.length;

        var listaContasAtualizada = new TContaBancaria[tamanhoListaContas + 1];

        // Move as contas já cadastradas para uma nova lista maior
        System.arraycopy(TGerenciaDeContas.CONTAS, 0, listaContasAtualizada, 0, tamanhoListaContas);

        String novoNroConta = TGerenciaDeContas.setNovaConta();
        String novoNroAgencia = TGerenciaDeContas.setNovaAgencia(novoNroConta);

        TContaBancaria novaConta = new TContaBancaria(novoNroConta, novoNroAgencia, nome, cpf);

        listaContasAtualizada[tamanhoListaContas] = novaConta;

        TGerenciaDeContas.CONTAS = listaContasAtualizada;

        return novaConta;
    }

    public static TResultadoOperacao transferir(String nroContaOrigem, String agenciaContaOrigem, String nroContaDestino, String agenciaContaDestino, double valor) {
        if (valor < 0)
            return new TResultadoOperacao(false, "O valor inserido para transferência é inválido. Tente novamente.");

        TContaBancaria contaOrigem = TGerenciaDeContas.obterContaCliente(nroContaOrigem, agenciaContaOrigem);

        if (!contaOrigem.valorDisponivel(valor))
            return new TResultadoOperacao(false, "Você não tem saldo suficiente.");

        TContaBancaria contaDestino = TGerenciaDeContas.obterContaCliente(nroContaDestino, agenciaContaDestino);

        if (contaDestino == null)
            return new TResultadoOperacao(false, "A conta de destino da transferência não existe. Tente novamente.");

        contaOrigem.Saque(valor);
        contaDestino.Deposito(valor);

        return new TResultadoOperacao(
                true,
                String.format("Valor transferido com êxito. Seu saldo agora é de R$%.2f.", contaOrigem.getSaldo())
        );
    }

    public static TContaBancaria obterContaCliente(String nroConta, String nroAgencia) {
        for (TContaBancaria conta : CONTAS) {
            if (conta.getConta().equals(nroConta) && conta.getAgencia().equals(nroAgencia))
                return conta;
        }

        return null;
    }

    public static int obterQuantidadeContas() {
        return CONTAS.length;
    }
}