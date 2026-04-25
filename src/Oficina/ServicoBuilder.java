package Oficina;

public class ServicoBuilder {
    private int idServico;
    private String nome;
    private String codigoServico;
    private double preco;
    private Veiculo veiculoTratado;
    private Problema problema;
    private Funcionario funcionario;
    private Cliente cliente;
    private String pecasTrocadas;

    public ServicoBuilder(int idServico, String nome,double preco, Veiculo veiculoTratado, Problema problema, Funcionario funcionario, Cliente cliente) {
        this.idServico = idServico;
        this.nome = nome;
        this.preco = preco;
        this.veiculoTratado = veiculoTratado;
        this.problema = problema;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public int getIdServico() { return idServico; }
    public String getNome() { return nome; }
    public String getCodigoServico() { return codigoServico; }
    public double getPreco() { return preco; }
    public Veiculo getVeiculoTratado() { return veiculoTratado; }
    public Problema getProblema() { return problema; }
    public Funcionario getFuncionario() { return funcionario; }
    public Cliente getCliente() { return cliente; }
    public String getPecasTrocadas() {
        return pecasTrocadas;
    }

    public ServicoBuilder codigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
        return this;
    }

    public ServicoBuilder pecasTrocadas(String pecasTrocadas) {
        this.pecasTrocadas = pecasTrocadas;
        return this;
    }

    public Servico build() {
        return new Servico(this);
    }
}