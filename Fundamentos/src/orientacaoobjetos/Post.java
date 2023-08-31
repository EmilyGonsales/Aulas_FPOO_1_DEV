package orientacaoobjetos;

public class Post {

    private String titulo;
    private String usuario;
    private String descricao;
    private int comentarios;
    private int estrelas;

    public Post(String titulo, String usuario, String descricao, int comentarios) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.descricao = descricao;
        this.comentarios = comentarios;
    }
    public double COMUM() {
        estrelas = 1;
        return estrelas;
    }
    public double LEGAL() {
        estrelas = 3;
        return estrelas;
    }
    public double SUPER_LEGAL() {
        estrelas = 5;
        return estrelas;
    }
    public double MUITO_BOM() {
        estrelas = 7;
        return estrelas;
    }
    public double EXCELENTE() {
        estrelas = 9;
        return estrelas;
    }

    @Override
    public String toString() {
        return "Post{" +
                "titulo='" + titulo +
                ", usuario='" + usuario +
                ", descricao='" + descricao  +
                ", comentarios=" + comentarios +
                ", estrelas=" + estrelas +
                '}';
    }


}
