package Oficina;

public abstract class Problema {
    private String descricao;
    private boolean resolvido;

    public Problema(String descricao, boolean resolvido) {
        this.descricao = descricao;
        this.resolvido = resolvido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }
}
