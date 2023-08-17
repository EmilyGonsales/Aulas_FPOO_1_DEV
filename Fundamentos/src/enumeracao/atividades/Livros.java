package enumeracao.atividades;

public class Livros {

    private CategoriaEnum categoria;
    private String nome;
    private int qntdDeLivros;

    public Livros(CategoriaEnum categoria, String nome, int qntdDeLivros) {
        this.categoria = categoria;
        this.nome = nome;
        this.qntdDeLivros = qntdDeLivros;
    }

    @Override
    public String toString() {
        return "Livros{" + "categoria=" + categoria + ", nome=" + nome + ", qntdDeLivros=" + qntdDeLivros + '}';
    }
    

}
