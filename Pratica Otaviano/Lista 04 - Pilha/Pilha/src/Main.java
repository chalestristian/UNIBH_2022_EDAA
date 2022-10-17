import Entidades.Agenda;
import Entidades.Pilha;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        Agenda agenda;
        Pilha pilha;
        pilha = new Pilha();



        pilha.AdcionarAgenda(new Agenda("AAA", 123));
        pilha.AdcionarAgenda(new Agenda("BBB", 456));
        pilha.AdcionarAgenda(new Agenda("CCC", 321));
        pilha.AdcionarAgenda(new Agenda("DDD", 654));


        for (int i = 0; i < pilha.getQuantidade(); i++){
            System.out.println(agenda = pilha.getAgendas()[i]);

        }




    }
}
