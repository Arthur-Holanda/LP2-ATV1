import java.util.ArrayList;

public class Main {
    /*
    public static double gerarNumeroAleatorio() {
        Random random = new Random();
        int valorInteiro = random.nextInt(10000);
        double valor =  (double) valorInteiro / 100;
        return (valor);
    }

    public void especificacao(Produto produto){
        produto.setNomeLoja("Casas Bahia");
        produto.setPreco(gerarNumeroAleatorio());
    }
    */
    public static void extrairTipo(Produto produto) {
        if (produto instanceof Mouse) {
            String descricao = produto.getDescricao();
            if (descricao != null && descricao.contains(",")) {
                String[] partesDescricao = descricao.split(",");
                if (partesDescricao.length > 1) {
                    String[] palavrasDescricao = partesDescricao[0].split(" ");
                    if (palavrasDescricao.length > 0) {
                        String tipo = palavrasDescricao[palavrasDescricao.length - 1];
                        ((Mouse) produto).setTipo(tipo);
                    }
                }
            }
        } else if (produto instanceof Livro) {
            String descricao = produto.getDescricao();
            if (descricao != null && descricao.contains(",")) {
                String[] partesDescricao = descricao.split(",");
                if (partesDescricao.length > 1) {
                    String[] palavrasDescricao = partesDescricao[1].split(" ");
                    if (palavrasDescricao.length > 1) {
                        String autor = palavrasDescricao[1];
                        ((Livro) produto).setAutor(autor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<>();

        // Adicionando mouses e livros ao carrinho
        carrinho.add(new Mouse("Mouse ótico, Saída USB. 1.600 dpi"));
        carrinho.add(new Mouse("Mouse laser, Bluetooth. 2.400 dpi"));
        carrinho.add(new Livro("Livro de Ficção Científica, Irineu Soares"));
        carrinho.add(new Livro("Livro de Mistério, Fernado Da Gama"));
        carrinho.add(new Mouse("Mouse ergonômico, conexão USB-C. 1.800 dpi"));
        carrinho.add(new Livro("Livro de Romance Clássico, Emily Brontë"));
        carrinho.add(new Livro("Livro de Fantasia Épica, J.R.R. Tolkien"));
        carrinho.add(new Mouse("Mouse gamer, iluminação RGB personalizável. 10.000 dpi"));
        carrinho.add(new Mouse("Mouse compacto, ideal para viagens. 1.200 dpi"));
        carrinho.add(new Livro("Livro de Não Ficção, Stephen Hawking"));
        carrinho.add(new Livro("Livro de Suspense Psicológico, Gillian Flynn"));
        carrinho.add(new Mouse("Mouse vertical, reduz a tensão no pulso. 2.400 dpi"));
        carrinho.add(new Mouse("Mouse silencioso, ideal para ambientes de trabalho. 1.200 dpi"));
        carrinho.add(new Livro("Livro de História Antiga, Heródoto"));
        carrinho.add(new Livro("Livro de Poesia Contemporânea, Carlos Drummond de Andrade"));



        // Exibindo descrições dos produtos no carrinho
        for (Produto produto : carrinho) {
            extrairTipo(produto);
            System.out.println(produto.getDescricao());
        }
    }
}
