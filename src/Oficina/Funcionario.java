package Oficina;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int idFuncionario;
    private String nome;
    private String cpf;
    private boolean disponibilidade;
    private double comissaoAcumulada;
    private String cargo;
    private List<Servico> listaServicos;

    public Funcionario(int idFuncionario,String nome, String cpf, String cargo) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.disponibilidade = true;
        this.comissaoAcumulada = 0;
        this.cargo = cargo;
        this.listaServicos = new ArrayList<>();
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

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double getComissaoAcumulada() {
        return comissaoAcumulada;
    }

    public void setComissaoAcumulada(double comissaoAcumulada) {
        this.comissaoAcumulada = comissaoAcumulada;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void atribuirServico(Servico servico){
        servico.setFuncionario(this);
        listaServicos.add(servico);
        this.disponibilidade = false;
    }

    public void finalizarServico(Servico servico) {
        if(!this.disponibilidade){
            this.disponibilidade = true;
            this.comissaoAcumulada += servico.getPreco()* 0.2;
        }
    }
}
