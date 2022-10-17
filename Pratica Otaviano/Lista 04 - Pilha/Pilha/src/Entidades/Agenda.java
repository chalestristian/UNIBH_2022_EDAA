package Entidades;

public class Agenda {
    public String nome;
    public long telefone;


    public Agenda(String nome, long telefone){
    this.nome = nome;
    this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "NOME: " + nome + "\n" + "TELEFONE: " + telefone+ "\n" + "------------";
    }
}
