package Filas;

public class Caracteres {
    public String conteudo;
    char[] conteudooriginal;
    char[] conteudomodificado;

    public Caracteres(String conteudo) {
        this.conteudo = conteudo;
    }
    public void TamanhosConteudosMinusculo() {
        conteudooriginal = new char[conteudo.length()];
        conteudomodificado = new char[conteudo.length()];
        for (int i = 0; i < conteudo.length(); i++) {
            conteudooriginal[i] = conteudo.charAt(i);
            conteudomodificado[i] = conteudo.toLowerCase().charAt(i);
        }
        System.out.print("CARACTERES MINUSCULOS: ");
        System.out.print("{ ");
        for (int j = 0; j < conteudomodificado.length; j++){
            if (conteudomodificado[j] == conteudooriginal[j]){
                System.out.print(" " + conteudomodificado[j]);
            }
        }
        System.out.println(" }");
    }
    public void TamanhosConteudosMaiusculos() {
        conteudooriginal = new char[conteudo.length()];
        conteudomodificado = new char[conteudo.length()];
        for (int i = 0; i < conteudo.length(); i++) {
            conteudooriginal[i] = conteudo.charAt(i);
            conteudomodificado[i] = conteudo.toUpperCase().charAt(i);
        }
        System.out.print("CARACTERES MAIUSCULOS: ");
        System.out.print("{ ");
        for (int j = 0; j < conteudomodificado.length; j++){
            if (conteudomodificado[j] == conteudooriginal[j]){
                System.out.print(" " + conteudomodificado[j]);
            }
        }
        System.out.println(" }");
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
