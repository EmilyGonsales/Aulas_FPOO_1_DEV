package enumeracao.atividades;

public class Produtos {

    private EnumProdutos categoria;
    private String nome;
    private int quantidade;

    public Produtos(EnumProdutos categoria, String nome, int quantidade) {
        this.categoria = categoria;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produtos{" + "categoria=" + categoria + ", nome=" + nome + ", quantidade=" + quantidade + '}';
    }

}
