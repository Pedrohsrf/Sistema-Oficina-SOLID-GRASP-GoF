package Oficina;


public class Carro extends Veiculo{
    private int qntsPortas;
    public Carro(String marca, String modelo, String cor, String id, String motor, String placa, String ano, int qntsPortas) {
        super(marca, modelo, cor, id, motor, placa, ano);
        this.qntsPortas = qntsPortas;
    }

    @Override
    public void descricao() {
        System.out.println("Marca: "+getMarca()+"Modelo: "+ getModelo() + "Cor: " +getCor() +"Ano: "+getAno());
    }

    @Override
    public void ligar() {
        System.out.println("Ligando carro "+getModelo()+"!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando carro "+getModelo()+"!");
    }

    public void abrirPortaMalas(){
        System.out.println("Abrindo porta malas!");
    }

    public void abirPortas(){
        System.out.println("Abrindo portas!");
    }
}
