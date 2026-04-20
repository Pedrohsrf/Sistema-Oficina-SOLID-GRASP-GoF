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

<<<<<<< Updated upstream
    public Servico(int idServico, String nome, String codigoServico, double preco, Veiculo veiculoTratado, List<Problema> listaProblemas, Funcionario Funcionario, Cliente cliente) {
=======
    public Servico(int idServico, String nome, String codigoServico, double preco, boolean pago, Veiculo veiculoTratado, Problema problema, Funcionario funcionario) {
>>>>>>> Stashed changes
        this.idServico = idServico;
        this.nome = nome;
        this.codigoServico = codigoServico;
        this.preco = preco;
        this.pago = false;
        this.veiculoTratado = veiculoTratado;
<<<<<<< Updated upstream
        this.listaProblemas = listaProblemas;
        this.funcionario = Funcionario;
        this.cliente = cliente;
    }
    public Servico(int idServico, double preco, Veiculo veiculoTratado, List<Problema> listaProblemas, Funcionario funcionario, Cliente cliente) {
        this(idServico, "","", preco , veiculoTratado, listaProblemas, funcionario, cliente);
=======
        this.problema = problema;
        this.funcionario = funcionario;
    }
    public Servico(int idServico, double preco, boolean pago ,Veiculo veiculoTratado, Problema problema, Funcionario funcionario) {
        this.idServico = idServico;
        this.nome = nome;
        this.codigoServico = codigoServico;
        this.preco = preco;
        this.pago = false;
        this.veiculoTratado = veiculoTratado;
        this.problema = problema;
        this.funcionario = funcionario;
>>>>>>> Stashed changes
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

    public Problema getproblema() {
        return problema;
    }

    public void setproblema(Problema problema) {
        this.problema = problema;
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
        System.out.println("Problema "+problema.getDescricao() +" resolvido!");
    }

    public void pagar(double valor){
<<<<<<< Updated upstream
        if(pago){
            pagamento.pagar(valor);
            this.pago = true;
            System.out.printf("Pago com sucesso por %s id: %d",cliente.getNome(), cliente.getVeiculo());
        }
        System.out.printf("Pagamento de R$%.2f não efetuado por %s", valor, cliente.getNome());
    }
=======
        if(pagamento == null){
            System.out.println("Forma de pagamento não definida!");
        }
        else {
            pagamento.pagar(valor);
            this.pago = true;
        }
    }

    /* corrigir pagamento para resolver o problema de pagamento == null;
        sobrecarga
        adicionar pagamentopix e pagamentocredito em dois construtores diferentes para que aceite as duas formas de pagamento e o pagamento não fique null

     */


>>>>>>> Stashed changes
}
