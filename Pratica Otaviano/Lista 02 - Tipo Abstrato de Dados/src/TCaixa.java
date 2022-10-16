import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TCaixa {
    private static TContaBancaria ContaAtiva;
    private static final Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            while(true) {
                imprimirCabecalho();
                selecionarOperacao();

                System.out.println();
                System.out.println("**ENTER PARA VOLTAR AO MENU**");
                System.in.read();
            }
        } catch (IOException ex) {
            Logger.getLogger(TCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void selecionarOperacao() {
        final String operacaoSair = "0 | Sair da Conta";
        final String operacaoNovaConta = "1 | Criar nova conta";
        final String operacaoSelecionarConta = "2 | Selecionar conta";
        final String operacaoDepositar = "3 | Depositar valor";
        final String operacaoRetirar = "4 | Retirar valor";
        final String operacaoSaldo = "5 | Exibir saldo";
        final String operacaoTransferir = "6 | Tranferir valor";

        if (existeClienteAtivo()) {
            System.out.println(
                    String.format(
                            "%s\n%s\n%s\n%s\n%s\n",
                            operacaoDepositar,
                            operacaoRetirar,
                            operacaoSaldo,
                            operacaoTransferir,
                            operacaoSair
                    )
            );
        }
        else {
            System.out.println(
                    String.format(
                            "%s\n%s\n",
                            operacaoNovaConta,
                            operacaoSelecionarConta
                    )
            );
        }

        System.out.print("ESCOLHA UMA OPERAÇÃO E PRESSIONE ENTER: ");

        int operacaoSelecionada = Input.nextInt();

        System.out.println();

        if (existeClienteAtivo()) {
            switch(operacaoSelecionada) {
                case 0 -> sairConta();
                case 3 -> depositarValorConta();
                case 4 -> retirarValorConta();
                case 5 -> exibirSaldoConta();
                case 6 -> transferirValorContas();
                default -> System.out.println("OPÇÃO INVALIDA");
            }
        }
        else {
            switch(operacaoSelecionada) {
                case 1 -> cadastrarCliente();
                case 2 -> selecionarConta();
                default -> System.out.println("OPÇÃO INVALIDA");
            }
        }
    }
    private static void cadastrarCliente() {
        System.out.println("-------------CADASTRO--------------");
        System.out.println("Informe os dados abaixo");
        System.out.println("-----------------------------------");

        System.out.println("Primeiro Nome:");
        String nome = Input.next();
        System.out.println("CPF:");
        String cpf = Input.next();

        System.out.println();
        TContaBancaria contaAberta = TGerenciaDeContas.novoCliente(nome, cpf);

        System.out.println(
                String.format(
                        "Conta criada com sucesso.\nConta: %s\nAgEncia: %s",
                        contaAberta.getConta(),
                        contaAberta.getAgencia()
                )
        );
    }
    private static void depositarValorConta() {
        if (!existeClienteAtivo()) {
            System.out.println("Erro. Nenhum cliente selecionado.");
            return;
        }

        System.out.println("--------------DEPÓSITO--------------");
        System.out.println("VALOR A SER DEPOSITADO");
        System.out.println("------------------------------------");
        System.out.print("VALOR DESEJADO:\nR$");

        double valor = Input.nextDouble();

        TResultadoOperacao resultado = ContaAtiva.Deposito(valor);

        System.out.println();
        System.out.println(resultado.obterMensagem());
    }
    private static void retirarValorConta() {
        if (!existeClienteAtivo()) {
            System.out.println("Erro. Nenhum cliente selecionado.");
            return;
        }

        System.out.println("--------------SAQUE--------------");
        System.out.println("VALOR A SER SACADO");
        System.out.println("---------------------------------");
        System.out.print("VALOR DESEJADO:\nR$");

        double valor = Input.nextDouble();

        TResultadoOperacao resultado = ContaAtiva.Saque(valor);

        System.out.println();
        System.out.println(resultado.obterMensagem());
    }
    private static void exibirSaldoConta() {
        if (!existeClienteAtivo()) {
            System.out.println("Erro. Nenhum cliente selecionado.");
            return;
        }

        System.out.println("--------------SALDO--------------");
        System.out.println("SALDO ABAIXO");
        System.out.println("---------------------------------");
        System.out.println(
                String.format(
                        "Saldo na sua conta: R$%s",
                        String.format("%.2f", ContaAtiva.getSaldo())
                )
        );
    }
    private static void transferirValorContas() {
        if (!existeClienteAtivo()) {
            System.out.println("Erro. Nenhum cliente selecionado.");
            return;
        }

        System.out.println("--------------TRANSFERÊNCIA--------------");

        if (TGerenciaDeContas.obterQuantidadeContas() < 2) {
            System.out.println("Não existe clientes. Cadastre novo cliente.");
            return;
        }

        System.out.println("Informe a conta de destino e o valo\nr de transferência desejado");
        System.out.println("------------------------------------------");

        System.out.println("Contas disponíveis para transferência:");
        System.out.println(TGerenciaDeContas.getContasTransf(ContaAtiva.getConta(), ContaAtiva.getAgencia()));

        System.out.println("Número da conta de destino:");
        String nroContaDestino = Input.next();

        System.out.println("Agência da conta de destino:");
        String nroAgenciaDestino = Input.next();

        System.out.print("Valor desejado:\nR$");
        double valor = Input.nextDouble();

        TResultadoOperacao resultado = ContaAtiva.Transferencia(nroContaDestino, nroAgenciaDestino, valor);

        System.out.println();
        System.out.println(resultado.obterMensagem());
    }
    private static void selecionarConta() {
        System.out.println("--------------ENTRAR--------------");
        if (TGerenciaDeContas.obterQuantidadeContas() == 0) {
            System.out.println("Não existe contas cadastradas.");
            return;
        }

        System.out.println(TGerenciaDeContas.getContasAbertas());

        System.out.println("Insira o Número da Conta:");
        String nroConta = Input.next();

        System.out.println("Insira a Agência:");
        String nroAgencia = Input.next();

        TContaBancaria conta = TGerenciaDeContas.obterContaCliente(nroConta, nroAgencia);

        if (conta == null) {
            System.out.println("Conta não encontrada. Não foi possível prosseguir.");
            return;
        }

        ContaAtiva = conta;

        System.out.println();
        System.out.println("Você entrou na conta com êxito.");
    }
    private static void sairConta() {
        System.out.println("--------------SAIR--------------");
        System.out.println("Você saiu da conta com êxito.");

        ContaAtiva = null;
    }
    private static void imprimirCabecalho() {
        Boolean existeClienteSelecionado = existeClienteAtivo();

        System.out.println("--------------CAIXA--------------");

        if (existeClienteSelecionado) {
            System.out.println(String.format("Bem-vindo, %s", ContaAtiva.getNome()));
            System.out.println(String.format("Conta: %s - Agência: %s", ContaAtiva.getConta(), ContaAtiva.getAgencia()));
        }
        else
            System.out.println("BEM VINDO AO BANCO UNIBH");

        System.out.println("---------------------------------");
        System.out.println("QUAL A OPERAÇÃO VOCÊ DESEJA REALIZAR?:");
    }
    private static Boolean existeClienteAtivo() {
        return ContaAtiva != null;
    }
}