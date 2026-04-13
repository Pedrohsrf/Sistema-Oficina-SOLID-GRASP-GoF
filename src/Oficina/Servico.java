package Oficina;

import java.util.List;

public class Servico {
    private int idServico;
    private String nome;
    private String codigoServico;
    private double preco;
    private boolean pago;
    private Veiculo veiculoTratado;
    private List<Problema> listaProblemas;
    private Pagamento pagamento;
    private Funcionario funcionario;

    public Servico(int idServico, String nome, String codigoServico, double preco, Veiculo veiculoTratado, List<Problema> listaProblemas, Funcionario Funcionario) {
        this.idServico = idServico;
        this.nome = nome;
        this.codigoServico = codigoServico;
        this.preco = preco;
        this.pago = false;
        this.veiculoTratado = veiculoTratado;
        this.listaProblemas = listaProblemas;
    }
    public Servico(int idServico, double preco, Veiculo veiculoTratado, List<Problema> listaProblemas, Funcionario funcionario) {
        this(idServico, "","", preco , veiculoTratado, listaProblemas, funcionario);
        this.pago = false;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Veiculo getVeiculoTratado() {
        return veiculoTratado;
    }

    public void setVeiculoTratado(Veiculo veiculoTratado) {
        this.veiculoTratado = veiculoTratado;
    }

    public List<Problema> getListaProblemas() {
        return listaProblemas;
    }

    public void setListaProblemas(List<Problema> listaProblemas) {
        this.listaProblemas = listaProblemas;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void executar(){
        for(Problema problema: listaProblemas){
        System.out.println("Problema "+problema.getDescricao() +" resolvido!");
        }
    }

    public void pagar(double valor){
        pagamento.pagar(valor);
        this.pago = true;
    }


}
