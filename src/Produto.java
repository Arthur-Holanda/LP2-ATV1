import java.util.Random;

class Produto {
    private String nomeLoja;
    private double preco;
    protected String descricao;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return ("Produto de informatica ");
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}