package Oficina;

public class ControllerServico {

    public void executarServico(Servico servico){
        servico.executar();
    }
    public void pagarServico(Servico servico){
        servico.pagar(servico.getPreco());
    }
}
