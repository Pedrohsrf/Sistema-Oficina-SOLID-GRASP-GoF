package Oficina;

public class PagamentoCredito implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Valor "+valor +" pago com Cartão de Crédito!");
    }
}
