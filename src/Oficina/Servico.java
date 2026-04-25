package Oficina;

public class Servico {
    private int idServico;
    private String nome;
    private String codigoServico;
    private double preco;
    private boolean pago;
    private Veiculo veiculoTratado;
    private Problema problema;
    private Pagamento pagamento;
    private Funcionario funcionario;
    private Cliente cliente;
    private String pecasTrocadas;


    protected Servico(ServicoBuilder builder) {
        this.idServico = builder.getIdServico();
        this.nome = builder.getNome();
        this.codigoServico = builder.getCodigoServico();
        this.preco = builder.getPreco();
        this.veiculoTratado = builder.getVeiculoTratado();
        this.problema = builder.getProblema();
        this.funcionario = builder.getFuncionario();
        this.cliente = builder.getCliente();
        this.pago = false;
        this.pecasTrocadas = builder.getPecasTrocadas();
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

    public Pagamento getPagamento() {
        return pagamento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void setVeiculoTratado(Veiculo veiculoTratado) {
        this.veiculoTratado = veiculoTratado;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPecasTrocadas(String pecasTrocadas) {
        this.pecasTrocadas = pecasTrocadas;
    }

    public void executar(){
        System.out.println("Problema "+problema.getDescricao() +" resolvido!");

    }

    public void pagar(double valor){
        if(pagamento == null){
            System.out.println("Forma de pagamento não definida!");
        }
        else {
            double total = valor - cliente.getSaldo();
            double saldoAtual = cliente.getSaldo() - valor;
            if(saldoAtual > 0){
                cliente.setSaldo(saldoAtual);
            }else{
                cliente.setSaldo(0);
            }
            pagamento.pagar(total);
            this.pago = true;
            System.out.printf("Pago com sucesso por Cliente: %s | Veiculo: %s",cliente.getNome(), cliente.getVeiculo());
            System.out.printf("\nSeu saldo atual é: %.2f" ,cliente.getSaldo());
        }
    }
}

