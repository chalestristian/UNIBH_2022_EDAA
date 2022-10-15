import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    Livro livro = new Livro("POO", "Thales");
    Livro livro2 = new Livro();
    Livro[] biblioteca = new Livro[10];
    Scanner input = new Scanner(System.in);

    //ATRIBUINDO VALORES
    System.out.println("Informe o nome do livro: ");
    livro2.setTitulo(input.next());

    System.out.println("Informe o nome do autor: ");
    livro2.setAutor(input.next());

        System.out.println(livro);
    System.out.println(livro2);
    System.out.println(livro2 == livro);

    System.out.println("********************************");

    biblioteca[0] = livro;
    biblioteca[1] = livro2;

    for (int i =0; i < biblioteca.length; i++){
        System.out.println(biblioteca[i]);
    }

    /*
    * FOR MELHORADO
    *
    * (Livro value : biblioteca) {
    * System.out.println(value);
    * }
    *
     */




    }
}
