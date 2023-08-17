
package enumeracao.atividades;


public class RedesSociais {
    private EnumRedeSociais nome;
    private int usuario;

    public RedesSociais(EnumRedeSociais nome, int usuario) {
        this.nome = nome;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "RedesSociais{" + "nome=" + nome + ", usuario=" + usuario + '}';
    }
}
