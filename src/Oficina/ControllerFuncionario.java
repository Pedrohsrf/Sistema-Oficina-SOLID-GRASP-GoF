package Oficina;

public class ControllerFuncionario {

    public void atribuirServico(Funcionario funcionario,Servico servico){
        funcionario.atribuirServico(servico);
    }

    public void finalizarServico(Funcionario funcionario){
        funcionario.finalizarServico();
    }
}
