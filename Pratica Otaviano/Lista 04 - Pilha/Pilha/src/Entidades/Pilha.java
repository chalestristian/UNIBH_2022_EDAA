package Entidades;

public class Pilha {
        public Agenda[] agendas;

        public Pilha(){
        agendas = new Agenda[10];
        }

        public Agenda[] getAgendas() {
                return agendas;
        }

        public int getQuantidade(){
                return agendas.length;
        }
        public void AdcionarAgenda(Agenda agenda){
                for (int i = 0; i < agendas.length; i++){
                        if (agendas[i] == null){
                                agendas[i] = agenda;
                                break;
                        }
                }
        }





}
