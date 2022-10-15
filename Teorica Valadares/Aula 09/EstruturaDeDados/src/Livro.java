public class Livro {
    private String titulo;
    private String autor;

    //Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro() {
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    //Para retornar o objeto gerado pelo construtor vazio:
    public String toString(){
        return "Livro{" +
                "Titulo='" + titulo +'\'' +
                ", Autor='" + autor + '\'' +
                '}';
    }
}
