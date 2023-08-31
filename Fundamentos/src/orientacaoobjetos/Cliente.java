package orientacaoobjetos;

public class Cliente implements AluguelFilme, CadastroCliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email == null) {
            return "Cliente: " + "nome:  " + nome;
        } else {

            return "Cliente: " + "nome:  " + nome + " email= " + email;

        }
    }

    /**
     * Calcular o valor total da locação do filme
     * Regra para filmes comuns.
     *
     * @param qtdeDias
     * @return
     */
    public double calcularLocacao(int qtdeDias) {
        return qtdeDias * VALOR_FILME_SIMPLES;

    }

    /**
     * Calcular o valor total da locação do filme
     * Regra para filmes novos.
     *
     * @param qtdeDias
     * @param lancamento
     * @return
     */
    public double calcularLocacao(int qtdeDias, boolean lancamento) {
        return qtdeDias * VALOR_FILME_LANCAMENTO;
    }

    @Override
    public boolean validarNome(String nome) {
        if (nome.length() > 7) {
            System.out.println("Nome " + nome + " do cliente é válido");
            return true;
        } else {
            System.out.println("Nome " + nome + " do cliente é inválido");
            return false;
        }
    }

    @Override
    public boolean verificarEmailDominioGoogle(String email) {
        return false;
    }
}

