import entidades.Biblioteca;
import entidades.BibliotecaList;
import entidades.Livro;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaListDriver {
    public static void main(String[] args){
        Livro livro;
        BibliotecaList biblioteca;

        System.out.println("Sistema de Bibliotecas");
        biblioteca = new BibliotecaList(new ArrayList<>());

        biblioteca.adicionarLivro(new Livro("Java","Deitel"));
        biblioteca.adicionarLivro(new Livro("C++","Lucas"));
        biblioteca.adicionarLivro(new Livro("Delphi","Luana"));
        biblioteca.adicionarLivro(new Livro("C#","Macoratti"));
        biblioteca.adicionarLivro(new Livro("C","Guilherme"));

        List<Livro> livros = biblioteca.livros();

        for(Livro li : livros){
            System.out.println(li);
        }
        System.out.println("*****************");
        biblioteca.removerLivro(3);

        for(Livro li : livros){
            System.out.println(li);
        }
        }


    }

