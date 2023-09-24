class Livro extends Produto {
    private String autor;

    public Livro(String descricao) {
        this.setDescricao(descricao);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Autor: " + getAutor();
    }
}