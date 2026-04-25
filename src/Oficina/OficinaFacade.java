package Oficina;

public class OficinaFacade {
    private ControllerServico controllerServico;
    private ControllerFuncionario controllerFuncionario;
    private ControllerCliente controllerCliente;

    public OficinaFacade() {
        this.controllerServico = new ControllerServico();
        this.controllerFuncionario = new ControllerFuncionario();
        this.controllerCliente = new ControllerCliente();
    }

    public void atribuirERealizarServico(Funcionario funcionario, Servico servico) {
        controllerFuncionario.atribuirServico(funcionario, servico);
        controllerServico.executarServico(servico);
    }

    public void definirPagamento(Servico servico, Pagamento pagamento) {
        servico.setPagamento(pagamento);
    }

    public void finalizarEPagarServico(Funcionario funcionario,Servico servico) {
        controllerFuncionario.finalizarServico(funcionario, servico);
        controllerServico.pagarServico(servico);
    }

    public void adicionarVeiculoCliente(Cliente cliente, Veiculo veiculo) {
        controllerCliente.adicionarVeiculo(cliente, veiculo);
    }
    // comentar na apresentação sobre a duvida sobre o controller  e explicar a hierarquia do sistema
}