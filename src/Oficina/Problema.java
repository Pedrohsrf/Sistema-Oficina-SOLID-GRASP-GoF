package Oficina;

public class Problema {
    private String descricao;
    private boolean resolvido;

    public Problema(String descricao, boolean resolvido) {
        this.descricao = descricao;
        this.resolvido = false;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getResolvido(){
        return this.resolvido;
    }
    public void setResolvido(boolean resolvido) {
        this.resolvido = true;
    }

    @Override
    public String toString() {
        return "Problema{" +
                "descricao='" + descricao + '\'' +
                ", resolvido=" + resolvido +
                '}';
    }
}
