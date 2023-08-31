package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Cliente c1 = new Cliente("Ana Flavia");
        c1.validarNome(c1.getNome());
        c1.verificarEmailDominioGoogle(c1.getEmail());
        System.out.println(c1);
        double valorLocacaoSimples = c1.calcularLocacao(3);
        System.out.println(" O valor para locação do filme " + " simples é: " + valorLocacaoSimples);

        Cliente c2 =new Cliente("Gabriel da Silva", "gabrieldasilva@gmail.com");
        c2.verificarEmailDominioGoogle(c2.getEmail());
        c2.validarNome(c2.getNome());
        System.out.println(c2);
        double valorLocacaoLancamento = c2.calcularLocacao(3, true);
        System.out.println(" O valor para locação do filme " + "lançamento é: " + valorLocacaoLancamento);

    }
}
