package Oficina;

public class PagamentoPix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Valor "+valor +" pago com Pix!");

    }
}
