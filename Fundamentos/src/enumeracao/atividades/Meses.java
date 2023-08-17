package enumeracao.atividades;

public class Meses {

    private MesesEnum nome;
    private int mes;

    public Meses(MesesEnum nome, int mes) {
        this.nome = nome;
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Meses{" + "nome=" + nome + ", mes=" + mes + '}';
    }

}
