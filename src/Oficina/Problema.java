package Oficina;

public abstract class Problema {
    private String descricao;
    private double preco;
    private boolean resolvido;

    public Problema(String descricao, double preco, boolean resolvido) {
        this.descricao = descricao;
        this.preco = preco;
        this.resolvido = resolvido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }

    abstract public void identificarProblema();
    abstract public void resolverProblema();
}
