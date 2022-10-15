public class Biblioteca {
    private Livro[] livros;

    Biblioteca(int quantidadeLivros){
        livros = new Livro[quantidadeLivros];
    }

    public Livro[] getLivros(){
        return  livros;
    }

    public int getQuantidade(){
        return livros.length;
    }

}
