package atividade01;

public class Aluno {

    private String nome;
    private String email;
    private String ra;
    private int nota1;
    private int nota2;
    private int media;

    public Aluno(String nome, String email, String ra, int nota1, int nota2) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int CalcularMedia() {
        this.media = (this.nota1 + this.nota2) /2;
        return this.media;
    }
}
