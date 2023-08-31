package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RedeSocial {

        public static void main(String[] args) throws UnsupportedEncodingException {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));

            Post numero1 = new Post("A origem do dia do programador", "Emily17", "Comemore hoje o dia do programador",10);
            numero1.COMUM();
            System.out.println(numero1);
            Post numero2 = new Post("Das telas pretas para o nosso monitor, da madrugada para o dia, do back-end para front-end", "Moisés15", "Programar é bom",25);
            numero2.LEGAL();
            System.out.println(numero2);
            Post numero3 = new Post("Programador Empreendedor", "Amélia35", "Ensinando um programador a ser empreendedor",20);
            numero3.SUPER_LEGAL();
            System.out.println(numero3);
            Post numero4 = new Post(" Dicas de Curriculo ", "Joana47", "Dicas de como montar seu curriculo",5);
            numero3.MUITO_BOM();
            System.out.println(numero3);
            Post numero5 = new Post(" Linguagens de Programação", "Emily17", "Aprendendo Linguagens de Programação",65);
            numero3.EXCELENTE();
            System.out.println(numero3);




        }
}
