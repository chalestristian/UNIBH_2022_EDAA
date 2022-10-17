package me.caribeedu.unibh.edaa.pilhas.registros.agenda;

import java.util.Scanner;

/**
 * PROGRAMA PILHA
 * 
 * @author Edu Caribé
 */
public class RegistrosAgenda {
    private static final Scanner input = new Scanner(System.in);
    private static final Pilha agendas = new Pilha(1);
    
    public static void main(String[] args) {
        while(true) {
            int opcaoEscolhida = menu();
            
            switch(opcaoEscolhida) {
                case 0 -> System.exit(0);
                case 1 -> inserirAgenda();
                case 2 -> removerUltimaAgenda();
                case 3 -> imprimirQtdAgendas();
                case 4 -> imprimirUltimaAgenda();
            }            
        }
    }
    
    private static void inserirAgenda() {
        System.out.println("NOVA AGENDA");
        
        System.out.print("Nome: ");
        String nome = input.next();
        System.out.println();
        
        System.out.print("Telefone: ");
        long telefone = input.nextLong();
        System.out.println();
        
        Agenda novaAgenda = new Agenda(nome, telefone);
        
        if (agendas.full())
            System.out.println("A lista de agendas está cheia. Ela será aumentada para conter a nova agenda.");
        
        agendas.push(novaAgenda);
        
        System.out.println("Agenda cadastrada com sucesso.");
        System.out.println();
    }
    
    private static void removerUltimaAgenda() {
        System.out.println("REMOVER ÚLTIMA AGENDA");
        
        if(agendas.empty()) {
            System.out.println("A lista de agendas está vazia. Não é possível remover a última agenda.");
            System.out.println();
            return;
        }
        
        agendas.pop();
        
        System.out.println("A última agenda cadastrada foi removida com sucesso.");
        System.out.println();
    }
    
    private static void imprimirQtdAgendas() {
        System.out.println("CADASTROS NA AGENDA");
        
        System.out.println(
            String.format(
                "A quantidade atual de agendas cadastradas é de %s.", 
                agendas.size()
            )
        );        
        System.out.println();
    }
    
    private static void imprimirUltimaAgenda() {
        System.out.println("IMPRIMIR ÚLTIMA AGENDA");
        
        if(agendas.empty()) {
            System.out.println("A lista de agendas está vazia. Não é possível imprimir a última agenda.");
            System.out.println();
            return;
        }
        
        Agenda ultimaAgenda = agendas.top();
        
        System.out.println("Última agenda cadastrada:");
        System.out.println(String.format("Nome: %s", ultimaAgenda.nome));
        System.out.println(String.format("Telefone: %s", ultimaAgenda.tel));
        System.out.println();        
    }
    
    private static int menu() { 
        int opcao = -1;
        
        while (opcao < 0 || opcao > 4) {            
            System.out.println("PROGRAMA PILHA");
            System.out.println("0: Sair");
            System.out.println("1: Inserir Itens");
            System.out.println("2: Remover Itens");
            System.out.println("3: Imprimir Tamanho");
            System.out.println("4: Imprimir Item Topo");
            System.out.print("Entre com a opção desejada: ");
            
            opcao = input.nextInt();
            
            System.out.println();
        }
        
        return opcao;
    }
}
