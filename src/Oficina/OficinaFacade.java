package Oficina;

public class OficinaFacade {
    private ControllerServico controllerServico;
    private ControllerFuncionario controllerFuncionario;
    private ControllerCliente controllerCliente;

    public OficinaFacade(ControllerServico controllerServico, ControllerFuncionario controllerFuncionario, ControllerCliente controllerCliente) {
        this.controllerServico = new ControllerServico();
        this.controllerFuncionario = new ControllerFuncionario();
        this.controllerCliente = new ControllerCliente();
    }

    public void realizarServico(Funcionario funcionario, Servico servico) {
        controllerFuncionario.atribuirServico(funcionario, servico);
        controllerServico.executarServico(servico);
    }

    public void finalizarEPagarServico(Funcionario funcionario,Servico servico) {
        controllerFuncionario.finalizarServico(funcionario);
        controllerServico.pagarServico(servico);
    }
    // comentar na apresentação sobre a duvida sobre o controller  e explicar a hierarquia do sistema
}