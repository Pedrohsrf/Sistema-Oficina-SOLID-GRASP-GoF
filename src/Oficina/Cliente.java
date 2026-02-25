package Oficina;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private Veiculo veiculo;
    private Double saldo;

    public Cliente(String nome, String cpf, String telefone, Veiculo veiculo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.veiculo = veiculo;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
