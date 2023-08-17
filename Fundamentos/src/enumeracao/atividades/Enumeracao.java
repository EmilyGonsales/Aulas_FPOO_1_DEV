package enumeracao.atividades;

public class Enumeracao {

    public static void main(String[] args) {
        Meses mes = new Meses(MesesEnum.AGOSTO, 8);
        System.out.println(mes);

        Livros livro = new Livros(CategoriaEnum.COMEDIA, "As Aventuras de Tom Sawyer", 2);
        System.out.println(livro);
        
        Produtos produto = new Produtos(EnumProdutos.SALGADO, "Esfirra de Frango", 3);
        System.out.println(produto);
        
        RedesSociais redesocial = new RedesSociais(EnumRedeSociais.TWITTER, "@EmilyGonsales");
        System.out.println(redesocial);
                

    }
}
