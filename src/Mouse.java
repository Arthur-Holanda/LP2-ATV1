class Mouse extends Produto {
    private String tipo;


    public Mouse(String descricao) {
        this.setDescricao(descricao);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return super.descricao + " - Tipo: " + getTipo();
    }
}