package Oficina;

public class Funcionario {
    private String nome;
    private String cpf;
    private int idFuncionario;

    public Funcionario(String nome, String cpf, int idFuncionario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
